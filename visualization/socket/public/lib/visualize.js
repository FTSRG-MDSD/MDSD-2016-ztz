var markers;
var robotStatuses;
var areaObjects;
var map;
var mapOptions;
var intervalId = 0;
var actions;
var actionId = 0;
var $log;
var $status;
var isAuto = false;

function initialize() {
	$("#unloadButton").hide();
	$("#nextButton").hide();
	$("#autoButton").hide();
	$("#backButton").hide();

	mapOptions = {
		zoom: 4,
		center: new google.maps.LatLng(32.520204, 34.937258),
		mapTypeId: google.maps.MapTypeId.ROADMAP
	}
	map = new google.maps.Map(document.getElementById('map_canvas'), mapOptions);
	$log = $("#log");
	$log.html();
	$status = $("#status");
	$status.html();

	
}

function buttonHandler(event) {
	if (actions == null) {
		return;
	}
	if (actionId == actions.length) {
		actionId = 0;
		$log.html("");
	}

	var key = Object.keys(actions[actionId]);
	if (key == "Sync") {
		for (i = 0; i < actions[actionId][key].length; i++) {
			handleAction(actions[actionId][key][i])
		}
	} else {
		handleAction(actions[actionId])
	}
	actionId++;
}

function handleAction(action) {
	var key = Object.keys(action);
	if (key == "Detection") {
		$log.html($log.html() + action[key]["Robot"] + " detects " + action[key]["Target"] + "<br/>");
		//TODO -> marker
	} else if (key == "UnicastCommunication") {
		var from = action[key]["From"];
		var range = robotStatuses.get(from)["Range"];
		$log.html($log.html() + "Message sent to " + action[key]["Target"] + " from " + from + "<br/>");
		drawCommunicationCircle(markers.get(from), range);

	} else if (key == "Action") {
		$log.html($log.html() + action[key]["Robot"] + " does " + action[key]["Action"] + "<br/>");
		if (action[key]["Action"] == "Move") {
			moveMarkerToPosition(action[key]["Robot"],
				new google.maps.LatLng(
					action[key]["Properties"]["Lat"],
					action[key]["Properties"]["Long"]
					));
		} else if (action[key]["Action"] == "MoveToTarget") {
			var target = action[key]["Targets"][0];
			moveMarkerToPosition(action[key]["Robot"], markers.get(target).getPosition());
		} else if (action[key]["Action"] == "Bring") {
			var targets = action[key]["Targets"]
			var newPosition = new google.maps.LatLng(
				action[key]["Properties"]["Lat"],
				action[key]["Properties"]["Long"]
				);
			moveMarkerToPosition(action[key]["Robot"], newPosition);
			for (var i = 0; i < targets.length; ++i) {
				if (areaObjects.get(targets[i])["Positions"].length == 1) {
					moveMarkerToPosition(targets[i], newPosition);
				}
			}

		}
	} else if (key == "BroadcastCommunication") {
        //code
    } else if (key == "MulticastCommunication") {
        //code
    } else if (key == "Status") {
    	initPositions(action[key])
    }
}

function moveMarkerToPosition(name, position) {
	markers.get(name).setDuration(duration);
	markers.get(name).setEasing("linear");
	markers.get(name).setPosition(position);
}

function showStatus(marker) {
	var name = marker.labelContent;
	var status = robotStatuses.get(name)
	$status.html("Name: " + name + "<br\>" +
		"Status: " + status["Status"] + "<br>" + 
		"Range: " + status["Range"]);
}

$(function () {
	initialize();

	var nextButtonClickHandler = function(event) {
		window.clearInterval(intervalId);
		intervalId = 0;
		buttonHandler(event);
	}
	
	$("#nextButton").click(nextButtonClickHandler);
	$("#autoButton").click(function() {
		if (isAuto) {
			window.clearInterval(intervalId)
			isAuto = false;
			$("#autoButton")[0].innerHTML = "Auto"
		} else {
			intervalId = setInterval(function() {
				buttonHandler();
			}, 1000
			);
			isAuto = true;
			$("#autoButton")[0].innerHTML = "Stop"
		}

		
	});
	$("#unloadButton").click(unloadHandler);
	$("#incomingButton").click(incomingHandler);
	$("#backButton").click(backHandler);

	if (window.location.hash == "#iframe") {
		$('#backLink').hide();
		$('#controls').css('height', '55px');
	}
});


var duration = parseInt($('#durationOption').val());
$('#durationOption').on('change keydown paste input', refreshDuration)

function refreshDuration() {
	duration = parseInt($('#durationOption').val());
	if (duration < 0) {
		duration = 1;
		$('#durationOption').val(duration);

	}
}

function unloadHandler() {
	$("#loadButton").show(1000);
	$("#incomingButton").show(1000);
	$("#unloadButton").hide(1000);
	$("#nextButton").hide(1000);
	$("#autoButton").hide(1000);
	clearMap();
}


var queue = []
var handleSocket = false;
var eventTimer;

function incomingHandler() {
	$("#loadButton").hide(1000);
	$("#incomingButton").hide(1000);
	$("#backButton").show(1000);
	queue = []
	handleSocket = true;
	markers = new Map();
	robotStatuses = new Map();
	areaObjects = new Map();
}

function eventTimerFun() {
	eventTimer = true;
	if (queue.length > 0) {
		handleSocketEvent(queue.shift());
	}
	if  (queue.length > 0) {
		eventTimer = setTimeout(eventTimerFun, duration);
	} else {
		eventTimer = null;
	}
}

function backHandler() {
	handleSocket = false;
	queue = []

	$("#loadButton").show(1000);
	$("#incomingButton").show(1000);
	$("#backButton").hide(1000);

	if (eventTimer != null && eventTimer != true) {
		clearTimeout(eventTimer);
	}
	

	clearMap();
}

function handleSocketEvent(data) {
	if (data.type == "robotPosition") {
		markers.set(data.name, new MarkerWithLabel({
			map: map,
			title: 'Robot',
			labelContent: data.name
		})
		);
		markers.get(data.name).addListener('click', function(name) {
			showStatus(this);
		});
		robotStatuses.set(data.name, {Lat: data["lat"], Long: data["long"]});
		setPosition(markers.get(data.name), data["lat"], data["long"]);
		map.setCenter(markers.get(data.name).getPosition())
	} else if (data.type == "objectPosition") {
		markers.set(data.name, new MarkerWithLabel({
				map: map,
				title: 'Object',
				labelContent: data.name,
				icon: 'http://maps.google.com/mapfiles/ms/icons/green-dot.png'
			}));

		areaObjects.set(data.name, {Lat: data["lat"], Long: data["long"]});
		setPosition(markers.get(data.name), data["lat"], data["long"]);
	} else if (data.type == "event") {
		if (data.name == "Move") {
			$log.html($log.html() + data.robot + " moves to (" + data["lat"] + ", " + data["long"] + ")<br/>");
			moveMarkerToPosition(data.robot, newPosition(data["lat"], data["long"]));
		} else if (data.name == "MoveToTarget") {
			$log.html($log.html() + data.robot + " moves to " + data.target + "<br/>");
			moveMarkerToPosition(data.robot, markers.get(data.target).getPosition());
		} else if (data.name == "Bring") {
			$log.html($log.html() + data.robot + " brings " + data.target + " to (" + data["lat"] + ", " + data["long"] + ")<br/>");
			moveMarkerToPosition(data.robot, newPosition(data["lat"], data["long"]));
			moveMarkerToPosition(data.target, newPosition(data["lat"], data["long"]));
		} else if (data.name == "Detect") {
			$log.html($log.html() + data.robot + " detects " + data.target + "<br/>");
			markers.get(data.target).setAnimation(google.maps.Animation.BOUNCE);
			setTimeout(function() {
				markers.get(data.target).setAnimation(null);
			}, duration/2)
		} else if (data.name == "Reset") {
			$log.html($log.html() + data.target + " resets at (" + data["lat"] + ", " + data["long"] + ")<br/>");
			setPosition(markers.get(data.target), data["lat"], data["long"]);
		}
	}

	if (queue.length > 0 && (queue[0].type == "robotPosition" || queue[0].type == "objectPosition")) handleSocketEvent(queue.shift());
}

function newPosition(lat, lng) {
	return new google.maps.LatLng( lat, lng );
}

function clearMap() {
	for (var i=0;i<robotStatuses.keys().length;++i) {
		markers.get(robotStatuses.keys()[i]).setMap(null);
	}
	for (var i=0;i<areaObjects.keys().length;++i) {
		markers.get(areaObjects.keys()[i]).setMap(null);
	}
	robotStatuses = null;
	areaObjects = null;
	markers = null;

	var uploadButton = $(".file-upload-button");
	uploadButton.wrap('<form>').parent('form').trigger('reset');
    uploadButton.unwrap();
}

$(document).on('change', '.file-upload-button', function(event) {
	var reader = new FileReader();
	reader.onload = function(event) {
		actions = JSON.parse(event.target.result);
		markers = new Map();
		robotStatuses = new Map();
		areaObjects = new Map();
		for (i = 0; i < actions[0]["Status"]["Robots"].length; i++) {
			var name = actions[0]["Status"]["Robots"][i]["Robot"];

			markers.set(name, new MarkerWithLabel({
				map: map,
				title: 'Robot',
				labelContent: name
			})
			);
			markers.get(name).addListener('click', function(name) {
				showStatus(this);
			});
			robotStatuses.set(name, actions[0]["Status"]["Robots"][i])
		}

		for (i = 0; i < actions[0]["Status"]["Objects"].length; i++) {
			var areaObject = actions[0]["Status"]["Objects"][i];
			var name = areaObject["Name"];

			if (areaObject["Positions"].length == 1) {
				markers.set(name, new MarkerWithLabel({
					map: map,
					title: 'Object',
					labelContent: name,
					icon: 'http://maps.google.com/mapfiles/ms/icons/green-dot.png'
				}));
			}

			areaObjects.set(name, areaObject);
		}

		initPositions(actions[0]["Status"]);

		map.setCenter(markers.get(name).getPosition())
		actionId++;

		$("#nextButton").show(1000);
		$("#autoButton").show(1000);
		$("#loadButton").hide(1000);
		$("#unloadButton").show(1000);
		$("#incomingButton").hide(1000);
	}
	reader.readAsText(event.target.files[0]);
});


function initPositions(action) {
	for (i = 0; i < action["Robots"].length; i++) {
		var robot = action["Robots"][i];
		var name = robot["Robot"];
		setPosition(markers.get(name), robot["Lat"], robot["Long"]);
		/*markers.get(name).setAnimation(google.maps.Animation.DROP);
		markers.get(name).setPositionNotAnimated(new google.maps.LatLng(
			robot["Lat"],
			robot["Long"]
			));*/
	}
	for (i = 0; i < action["Objects"].length; i++) {			
		var areaObject = action["Objects"][i]
		var name = areaObject["Name"]
		if (areaObject["Positions"].length == 1) {
			setPosition(markers.get(name), areaObject["Positions"][0]["Lat"], areaObject["Positions"][0]["Long"])
			/*markers.get(name).setAnimation(google.maps.Animation.DROP);
			markers.get(name).setPositionNotAnimated(new google.maps.LatLng(
				areaObject["Positions"][0]["Lat"],
				areaObject["Positions"][0]["Long"]
				));*/
		}
	}
}

function setPosition(marker, lat, lng) {
	marker.setAnimation(google.maps.Animation.DROP);
	marker.setPositionNotAnimated(new google.maps.LatLng(lat, lng));
}

function drawCommunicationCircle(marker, range) {
	var circle = new google.maps.Circle({
		strokeColor: '#FF0000',
		strokeOpacity: 0.8,
		strokeWeight: 1,
		fillColor: '#FF0000',
		fillOpacity: 0.6,
		map: map,
		center: marker.getPosition(),
		radius: parseInt(range)*300
	});
	window.setTimeout(function() { circle.setMap(null)}, duration*0.8);
}