package hu.bme.mdsd.ztz.text.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mdsd.ztz.text.services.BehaviourLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBehaviourLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BehaviourContainer'", "'{'", "'dynamicRobots'", "','", "'}'", "'taskExecutions'", "'taskRequirements'", "'behaviourKeysContainer'", "'DynamicRobot'", "'status'", "'robot'", "'executedTasks'", "'('", "')'", "'detectedObjects'", "'collaborations'", "'messageRepository'", "'actions'", "'TaskExecution'", "'executors'", "'task'", "'requirement'", "'executionTime'", "'TaskRequirement'", "'participants'", "'taskExecution'", "'prerequisite'", "'requiredCapabilities'", "'properties'", "'capabilityProperties'", "'BehaviouralPropertyKeyContainer'", "'keys'", "'obstacle'", "'DetectedObject'", "'object'", "'RobotCollaboration'", "'collaborator'", "'MessageRepository'", "'sendedMessages'", "'Action'", "'currentTaskExecution'", "'Position'", "'coordinates'", "'Size'", "'width'", "'height'", "'length'", "'Battery'", "'capacity'", "'voltage'", "'rechargeTime'", "'Equipment'", "'facilitate'", "'Property'", "'key'", "'value'", "'MeasureValue'", "'dimension'", "'CapabilityProperties'", "'capability'", "'Coordinate'", "'latitude'", "'longitude'", "'altitude'", "'-'", "'.'", "'E'", "'e'", "'TaskDescriptor'", "'targets'", "'PropertyKey'", "'StringValue'", "'MeasureConversion'", "'rate'", "'needResponse'", "'Message'", "'timestamp'", "'involvedTaskExecutions'", "'referredObjects'", "'follows'", "'TTL'", "'EDate'", "'UnicastCommunication'", "'message'", "'target'", "'MulticastCommunication'", "'BroadcastCommunication'", "'Ready'", "'TurnedOff'", "'Waiting'", "'Executing'", "'Finished'", "'Suspended'", "'InProgress'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalBehaviourLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBehaviourLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBehaviourLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBehaviourLanguage.g"; }



     	private BehaviourLanguageGrammarAccess grammarAccess;

        public InternalBehaviourLanguageParser(TokenStream input, BehaviourLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BehaviourContainer";
       	}

       	@Override
       	protected BehaviourLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBehaviourContainer"
    // InternalBehaviourLanguage.g:65:1: entryRuleBehaviourContainer returns [EObject current=null] : iv_ruleBehaviourContainer= ruleBehaviourContainer EOF ;
    public final EObject entryRuleBehaviourContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourContainer = null;


        try {
            // InternalBehaviourLanguage.g:65:59: (iv_ruleBehaviourContainer= ruleBehaviourContainer EOF )
            // InternalBehaviourLanguage.g:66:2: iv_ruleBehaviourContainer= ruleBehaviourContainer EOF
            {
             newCompositeNode(grammarAccess.getBehaviourContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourContainer=ruleBehaviourContainer();

            state._fsp--;

             current =iv_ruleBehaviourContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviourContainer"


    // $ANTLR start "ruleBehaviourContainer"
    // InternalBehaviourLanguage.g:72:1: ruleBehaviourContainer returns [EObject current=null] : ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleBehaviourContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_dynamicRobots_5_0 = null;

        EObject lv_dynamicRobots_7_0 = null;

        EObject lv_taskExecutions_11_0 = null;

        EObject lv_taskExecutions_13_0 = null;

        EObject lv_taskRequirements_17_0 = null;

        EObject lv_taskRequirements_19_0 = null;

        EObject lv_behaviourKeysContainer_22_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:78:2: ( ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' ) )
            // InternalBehaviourLanguage.g:79:2: ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' )
            {
            // InternalBehaviourLanguage.g:79:2: ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' )
            // InternalBehaviourLanguage.g:80:3: () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}'
            {
            // InternalBehaviourLanguage.g:80:3: ()
            // InternalBehaviourLanguage.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourContainerAccess().getBehaviourContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourContainerAccess().getBehaviourContainerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:95:3: (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBehaviourLanguage.g:96:4: otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourContainerAccess().getDynamicRobotsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBehaviourLanguage.g:104:4: ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) )
                    // InternalBehaviourLanguage.g:105:5: (lv_dynamicRobots_5_0= ruleDynamicRobot )
                    {
                    // InternalBehaviourLanguage.g:105:5: (lv_dynamicRobots_5_0= ruleDynamicRobot )
                    // InternalBehaviourLanguage.g:106:6: lv_dynamicRobots_5_0= ruleDynamicRobot
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsDynamicRobotParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_dynamicRobots_5_0=ruleDynamicRobot();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourContainerRule());
                    						}
                    						add(
                    							current,
                    							"dynamicRobots",
                    							lv_dynamicRobots_5_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.DynamicRobot");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:123:4: (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:124:5: otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:128:5: ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) )
                    	    // InternalBehaviourLanguage.g:129:6: (lv_dynamicRobots_7_0= ruleDynamicRobot )
                    	    {
                    	    // InternalBehaviourLanguage.g:129:6: (lv_dynamicRobots_7_0= ruleDynamicRobot )
                    	    // InternalBehaviourLanguage.g:130:7: lv_dynamicRobots_7_0= ruleDynamicRobot
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsDynamicRobotParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_dynamicRobots_7_0=ruleDynamicRobot();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dynamicRobots",
                    	    								lv_dynamicRobots_7_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.DynamicRobot");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:153:3: (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBehaviourLanguage.g:154:4: otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviourContainerAccess().getTaskExecutionsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:162:4: ( (lv_taskExecutions_11_0= ruleTaskExecution ) )
                    // InternalBehaviourLanguage.g:163:5: (lv_taskExecutions_11_0= ruleTaskExecution )
                    {
                    // InternalBehaviourLanguage.g:163:5: (lv_taskExecutions_11_0= ruleTaskExecution )
                    // InternalBehaviourLanguage.g:164:6: lv_taskExecutions_11_0= ruleTaskExecution
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsTaskExecutionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_taskExecutions_11_0=ruleTaskExecution();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourContainerRule());
                    						}
                    						add(
                    							current,
                    							"taskExecutions",
                    							lv_taskExecutions_11_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskExecution");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:181:4: (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:182:5: otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:186:5: ( (lv_taskExecutions_13_0= ruleTaskExecution ) )
                    	    // InternalBehaviourLanguage.g:187:6: (lv_taskExecutions_13_0= ruleTaskExecution )
                    	    {
                    	    // InternalBehaviourLanguage.g:187:6: (lv_taskExecutions_13_0= ruleTaskExecution )
                    	    // InternalBehaviourLanguage.g:188:7: lv_taskExecutions_13_0= ruleTaskExecution
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsTaskExecutionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_taskExecutions_13_0=ruleTaskExecution();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"taskExecutions",
                    	    								lv_taskExecutions_13_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskExecution");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:211:3: (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBehaviourLanguage.g:212:4: otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getBehaviourContainerAccess().getTaskRequirementsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:220:4: ( (lv_taskRequirements_17_0= ruleTaskRequirement ) )
                    // InternalBehaviourLanguage.g:221:5: (lv_taskRequirements_17_0= ruleTaskRequirement )
                    {
                    // InternalBehaviourLanguage.g:221:5: (lv_taskRequirements_17_0= ruleTaskRequirement )
                    // InternalBehaviourLanguage.g:222:6: lv_taskRequirements_17_0= ruleTaskRequirement
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsTaskRequirementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_taskRequirements_17_0=ruleTaskRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourContainerRule());
                    						}
                    						add(
                    							current,
                    							"taskRequirements",
                    							lv_taskRequirements_17_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskRequirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:239:4: (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:240:5: otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:244:5: ( (lv_taskRequirements_19_0= ruleTaskRequirement ) )
                    	    // InternalBehaviourLanguage.g:245:6: (lv_taskRequirements_19_0= ruleTaskRequirement )
                    	    {
                    	    // InternalBehaviourLanguage.g:245:6: (lv_taskRequirements_19_0= ruleTaskRequirement )
                    	    // InternalBehaviourLanguage.g:246:7: lv_taskRequirements_19_0= ruleTaskRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsTaskRequirementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_taskRequirements_19_0=ruleTaskRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"taskRequirements",
                    	    								lv_taskRequirements_19_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskRequirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:269:3: (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBehaviourLanguage.g:270:4: otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) )
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviourContainerAccess().getBehaviourKeysContainerKeyword_6_0());
                    			
                    // InternalBehaviourLanguage.g:274:4: ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) )
                    // InternalBehaviourLanguage.g:275:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    {
                    // InternalBehaviourLanguage.g:275:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    // InternalBehaviourLanguage.g:276:6: lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getBehaviourKeysContainerBehaviouralPropertyKeyContainerParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_behaviourKeysContainer_22_0=ruleBehaviouralPropertyKeyContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourContainerRule());
                    						}
                    						set(
                    							current,
                    							"behaviourKeysContainer",
                    							lv_behaviourKeysContainer_22_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.BehaviouralPropertyKeyContainer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviourContainer"


    // $ANTLR start "entryRuleAction"
    // InternalBehaviourLanguage.g:302:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBehaviourLanguage.g:302:47: (iv_ruleAction= ruleAction EOF )
            // InternalBehaviourLanguage.g:303:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBehaviourLanguage.g:309:1: ruleAction returns [EObject current=null] : (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Action_Impl_0 = null;

        EObject this_UnicastCommunication_1 = null;

        EObject this_MulticastCommunication_2 = null;

        EObject this_BroadcastCommunication_3 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:315:2: ( (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication ) )
            // InternalBehaviourLanguage.g:316:2: (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication )
            {
            // InternalBehaviourLanguage.g:316:2: (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt8=1;
                }
                break;
            case 93:
                {
                alt8=2;
                }
                break;
            case 96:
                {
                alt8=3;
                }
                break;
            case 97:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBehaviourLanguage.g:317:3: this_Action_Impl_0= ruleAction_Impl
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAction_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_Impl_0=ruleAction_Impl();

                    state._fsp--;


                    			current = this_Action_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:326:3: this_UnicastCommunication_1= ruleUnicastCommunication
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getUnicastCommunicationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnicastCommunication_1=ruleUnicastCommunication();

                    state._fsp--;


                    			current = this_UnicastCommunication_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:335:3: this_MulticastCommunication_2= ruleMulticastCommunication
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMulticastCommunicationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MulticastCommunication_2=ruleMulticastCommunication();

                    state._fsp--;


                    			current = this_MulticastCommunication_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:344:3: this_BroadcastCommunication_3= ruleBroadcastCommunication
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBroadcastCommunicationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BroadcastCommunication_3=ruleBroadcastCommunication();

                    state._fsp--;


                    			current = this_BroadcastCommunication_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePropertyValue"
    // InternalBehaviourLanguage.g:356:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalBehaviourLanguage.g:356:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalBehaviourLanguage.g:357:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalBehaviourLanguage.g:363:1: rulePropertyValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_MeasureValue_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:369:2: ( (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:370:2: (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:370:2: (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==82) ) {
                alt9=1;
            }
            else if ( (LA9_0==67) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBehaviourLanguage.g:371:3: this_StringValue_0= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getPropertyValueAccess().getStringValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:380:3: this_MeasureValue_1= ruleMeasureValue
                    {

                    			newCompositeNode(grammarAccess.getPropertyValueAccess().getMeasureValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureValue_1=ruleMeasureValue();

                    state._fsp--;


                    			current = this_MeasureValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleDynamicRobot"
    // InternalBehaviourLanguage.g:392:1: entryRuleDynamicRobot returns [EObject current=null] : iv_ruleDynamicRobot= ruleDynamicRobot EOF ;
    public final EObject entryRuleDynamicRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicRobot = null;


        try {
            // InternalBehaviourLanguage.g:392:53: (iv_ruleDynamicRobot= ruleDynamicRobot EOF )
            // InternalBehaviourLanguage.g:393:2: iv_ruleDynamicRobot= ruleDynamicRobot EOF
            {
             newCompositeNode(grammarAccess.getDynamicRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicRobot=ruleDynamicRobot();

            state._fsp--;

             current =iv_ruleDynamicRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicRobot"


    // $ANTLR start "ruleDynamicRobot"
    // InternalBehaviourLanguage.g:399:1: ruleDynamicRobot returns [EObject current=null] : (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( ( ruleEString ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleDynamicRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_status_4_0 = null;

        EObject lv_detectedObjects_15_0 = null;

        EObject lv_detectedObjects_17_0 = null;

        EObject lv_collaborations_20_0 = null;

        EObject lv_messageRepository_22_0 = null;

        EObject lv_actions_25_0 = null;

        EObject lv_actions_27_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:405:2: ( (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( ( ruleEString ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalBehaviourLanguage.g:406:2: (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( ( ruleEString ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalBehaviourLanguage.g:406:2: (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( ( ruleEString ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalBehaviourLanguage.g:407:3: otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( ( ruleEString ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDynamicRobotAccess().getDynamicRobotKeyword_0());
            		
            // InternalBehaviourLanguage.g:411:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:412:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:412:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:413:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDynamicRobotAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDynamicRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDynamicRobotAccess().getStatusKeyword_3());
            		
            // InternalBehaviourLanguage.g:438:3: ( (lv_status_4_0= ruleRobotStatus ) )
            // InternalBehaviourLanguage.g:439:4: (lv_status_4_0= ruleRobotStatus )
            {
            // InternalBehaviourLanguage.g:439:4: (lv_status_4_0= ruleRobotStatus )
            // InternalBehaviourLanguage.g:440:5: lv_status_4_0= ruleRobotStatus
            {

            					newCompositeNode(grammarAccess.getDynamicRobotAccess().getStatusRobotStatusEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_status_4_0=ruleRobotStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_4_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.RobotStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getDynamicRobotAccess().getRobotKeyword_5());
            		
            // InternalBehaviourLanguage.g:461:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:462:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:462:4: ( ruleEString )
            // InternalBehaviourLanguage.g:463:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDynamicRobotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDynamicRobotAccess().getRobotRobotCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:477:3: (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBehaviourLanguage.g:478:4: otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getDynamicRobotAccess().getExecutedTasksKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getDynamicRobotAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalBehaviourLanguage.g:486:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:487:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:487:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:488:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicRobotRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getExecutedTasksTaskExecutionCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:502:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:503:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDynamicRobotAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:507:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:508:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:508:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:509:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDynamicRobotRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDynamicRobotAccess().getExecutedTasksTaskExecutionCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getDynamicRobotAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:529:3: (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBehaviourLanguage.g:530:4: otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getDynamicRobotAccess().getDetectedObjectsKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getDynamicRobotAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:538:4: ( (lv_detectedObjects_15_0= ruleDetectedObject ) )
                    // InternalBehaviourLanguage.g:539:5: (lv_detectedObjects_15_0= ruleDetectedObject )
                    {
                    // InternalBehaviourLanguage.g:539:5: (lv_detectedObjects_15_0= ruleDetectedObject )
                    // InternalBehaviourLanguage.g:540:6: lv_detectedObjects_15_0= ruleDetectedObject
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getDetectedObjectsDetectedObjectParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_detectedObjects_15_0=ruleDetectedObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
                    						}
                    						add(
                    							current,
                    							"detectedObjects",
                    							lv_detectedObjects_15_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.DetectedObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:557:4: (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:558:5: otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_22); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getDynamicRobotAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:562:5: ( (lv_detectedObjects_17_0= ruleDetectedObject ) )
                    	    // InternalBehaviourLanguage.g:563:6: (lv_detectedObjects_17_0= ruleDetectedObject )
                    	    {
                    	    // InternalBehaviourLanguage.g:563:6: (lv_detectedObjects_17_0= ruleDetectedObject )
                    	    // InternalBehaviourLanguage.g:564:7: lv_detectedObjects_17_0= ruleDetectedObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getDynamicRobotAccess().getDetectedObjectsDetectedObjectParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_detectedObjects_17_0=ruleDetectedObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"detectedObjects",
                    	    								lv_detectedObjects_17_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.DetectedObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getDynamicRobotAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:587:3: (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBehaviourLanguage.g:588:4: otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) )
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getDynamicRobotAccess().getCollaborationsKeyword_9_0());
                    			
                    // InternalBehaviourLanguage.g:592:4: ( (lv_collaborations_20_0= ruleRobotCollaboration ) )
                    // InternalBehaviourLanguage.g:593:5: (lv_collaborations_20_0= ruleRobotCollaboration )
                    {
                    // InternalBehaviourLanguage.g:593:5: (lv_collaborations_20_0= ruleRobotCollaboration )
                    // InternalBehaviourLanguage.g:594:6: lv_collaborations_20_0= ruleRobotCollaboration
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getCollaborationsRobotCollaborationParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_collaborations_20_0=ruleRobotCollaboration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
                    						}
                    						set(
                    							current,
                    							"collaborations",
                    							lv_collaborations_20_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.RobotCollaboration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:612:3: (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBehaviourLanguage.g:613:4: otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) )
                    {
                    otherlv_21=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_21, grammarAccess.getDynamicRobotAccess().getMessageRepositoryKeyword_10_0());
                    			
                    // InternalBehaviourLanguage.g:617:4: ( (lv_messageRepository_22_0= ruleMessageRepository ) )
                    // InternalBehaviourLanguage.g:618:5: (lv_messageRepository_22_0= ruleMessageRepository )
                    {
                    // InternalBehaviourLanguage.g:618:5: (lv_messageRepository_22_0= ruleMessageRepository )
                    // InternalBehaviourLanguage.g:619:6: lv_messageRepository_22_0= ruleMessageRepository
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getMessageRepositoryMessageRepositoryParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_messageRepository_22_0=ruleMessageRepository();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
                    						}
                    						set(
                    							current,
                    							"messageRepository",
                    							lv_messageRepository_22_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MessageRepository");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:637:3: (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBehaviourLanguage.g:638:4: otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getDynamicRobotAccess().getActionsKeyword_11_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_24, grammarAccess.getDynamicRobotAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalBehaviourLanguage.g:646:4: ( (lv_actions_25_0= ruleAction ) )
                    // InternalBehaviourLanguage.g:647:5: (lv_actions_25_0= ruleAction )
                    {
                    // InternalBehaviourLanguage.g:647:5: (lv_actions_25_0= ruleAction )
                    // InternalBehaviourLanguage.g:648:6: lv_actions_25_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getActionsActionParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actions_25_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_25_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:665:4: (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:666:5: otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getDynamicRobotAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:670:5: ( (lv_actions_27_0= ruleAction ) )
                    	    // InternalBehaviourLanguage.g:671:6: (lv_actions_27_0= ruleAction )
                    	    {
                    	    // InternalBehaviourLanguage.g:671:6: (lv_actions_27_0= ruleAction )
                    	    // InternalBehaviourLanguage.g:672:7: lv_actions_27_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getDynamicRobotAccess().getActionsActionParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actions_27_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_27_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_28, grammarAccess.getDynamicRobotAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getDynamicRobotAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicRobot"


    // $ANTLR start "entryRuleTaskExecution"
    // InternalBehaviourLanguage.g:703:1: entryRuleTaskExecution returns [EObject current=null] : iv_ruleTaskExecution= ruleTaskExecution EOF ;
    public final EObject entryRuleTaskExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskExecution = null;


        try {
            // InternalBehaviourLanguage.g:703:54: (iv_ruleTaskExecution= ruleTaskExecution EOF )
            // InternalBehaviourLanguage.g:704:2: iv_ruleTaskExecution= ruleTaskExecution EOF
            {
             newCompositeNode(grammarAccess.getTaskExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskExecution=ruleTaskExecution();

            state._fsp--;

             current =iv_ruleTaskExecution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskExecution"


    // $ANTLR start "ruleTaskExecution"
    // InternalBehaviourLanguage.g:710:1: ruleTaskExecution returns [EObject current=null] : (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleTaskExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_status_4_0 = null;

        EObject lv_executionTime_16_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:716:2: ( (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' ) )
            // InternalBehaviourLanguage.g:717:2: (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' )
            {
            // InternalBehaviourLanguage.g:717:2: (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' )
            // InternalBehaviourLanguage.g:718:3: otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskExecutionAccess().getTaskExecutionKeyword_0());
            		
            // InternalBehaviourLanguage.g:722:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:723:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:723:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:724:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskExecutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskExecutionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskExecutionAccess().getStatusKeyword_3());
            		
            // InternalBehaviourLanguage.g:749:3: ( (lv_status_4_0= ruleTaskExecutionStatus ) )
            // InternalBehaviourLanguage.g:750:4: (lv_status_4_0= ruleTaskExecutionStatus )
            {
            // InternalBehaviourLanguage.g:750:4: (lv_status_4_0= ruleTaskExecutionStatus )
            // InternalBehaviourLanguage.g:751:5: lv_status_4_0= ruleTaskExecutionStatus
            {

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getStatusTaskExecutionStatusEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_status_4_0=ruleTaskExecutionStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskExecutionRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_4_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskExecutionStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:768:3: (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBehaviourLanguage.g:769:4: otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskExecutionAccess().getExecutorsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskExecutionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:777:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:778:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:778:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:779:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskExecutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutorsDynamicRobotCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:793:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:794:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTaskExecutionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:798:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:799:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:799:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:800:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskExecutionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutorsDynamicRobotCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskExecutionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskExecutionAccess().getTaskKeyword_6());
            		
            // InternalBehaviourLanguage.g:824:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:825:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:825:4: ( ruleEString )
            // InternalBehaviourLanguage.g:826:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskExecutionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getTaskTaskCrossReference_7_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:840:3: (otherlv_13= 'requirement' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBehaviourLanguage.g:841:4: otherlv_13= 'requirement' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,32,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getTaskExecutionAccess().getRequirementKeyword_8_0());
                    			
                    // InternalBehaviourLanguage.g:845:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:846:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:846:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:847:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskExecutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getRequirementTaskRequirementCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:862:3: (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBehaviourLanguage.g:863:4: otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) )
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskExecutionAccess().getExecutionTimeKeyword_9_0());
                    			
                    // InternalBehaviourLanguage.g:867:4: ( (lv_executionTime_16_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:868:5: (lv_executionTime_16_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:868:5: (lv_executionTime_16_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:869:6: lv_executionTime_16_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutionTimeMeasureValueParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_executionTime_16_0=ruleMeasureValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskExecutionRule());
                    						}
                    						set(
                    							current,
                    							"executionTime",
                    							lv_executionTime_16_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTaskExecutionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskExecution"


    // $ANTLR start "entryRuleTaskRequirement"
    // InternalBehaviourLanguage.g:895:1: entryRuleTaskRequirement returns [EObject current=null] : iv_ruleTaskRequirement= ruleTaskRequirement EOF ;
    public final EObject entryRuleTaskRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequirement = null;


        try {
            // InternalBehaviourLanguage.g:895:56: (iv_ruleTaskRequirement= ruleTaskRequirement EOF )
            // InternalBehaviourLanguage.g:896:2: iv_ruleTaskRequirement= ruleTaskRequirement EOF
            {
             newCompositeNode(grammarAccess.getTaskRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRequirement=ruleTaskRequirement();

            state._fsp--;

             current =iv_ruleTaskRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskRequirement"


    // $ANTLR start "ruleTaskRequirement"
    // InternalBehaviourLanguage.g:902:1: ruleTaskRequirement returns [EObject current=null] : (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleTaskRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_participants_4_0 = null;

        EObject lv_properties_17_0 = null;

        EObject lv_properties_19_0 = null;

        EObject lv_capabilityProperties_23_0 = null;

        EObject lv_capabilityProperties_25_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:908:2: ( (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalBehaviourLanguage.g:909:2: (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalBehaviourLanguage.g:909:2: (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalBehaviourLanguage.g:910:3: otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequirementAccess().getTaskRequirementKeyword_0());
            		
            // InternalBehaviourLanguage.g:914:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:915:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:915:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:916:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRequirementAccess().getParticipantsKeyword_3());
            		
            // InternalBehaviourLanguage.g:941:3: ( (lv_participants_4_0= ruleEInt ) )
            // InternalBehaviourLanguage.g:942:4: (lv_participants_4_0= ruleEInt )
            {
            // InternalBehaviourLanguage.g:942:4: (lv_participants_4_0= ruleEInt )
            // InternalBehaviourLanguage.g:943:5: lv_participants_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getParticipantsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_participants_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
            					}
            					set(
            						current,
            						"participants",
            						lv_participants_4_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskRequirementAccess().getTaskExecutionKeyword_5());
            		
            // InternalBehaviourLanguage.g:964:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:965:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:965:4: ( ruleEString )
            // InternalBehaviourLanguage.g:966:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRequirementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getTaskExecutionTaskExecutionCrossReference_6_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:980:3: (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBehaviourLanguage.g:981:4: otherlv_7= 'prerequisite' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskRequirementAccess().getPrerequisiteKeyword_7_0());
                    			
                    // InternalBehaviourLanguage.g:985:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:986:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:986:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:987:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getPrerequisiteTaskExecutionCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1002:3: (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBehaviourLanguage.g:1003:4: otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskRequirementAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:1011:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:1012:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:1012:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:1013:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1027:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1028:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTaskRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1032:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:1033:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:1033:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:1034:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,24,FOLLOW_40); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskRequirementAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1054:3: (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBehaviourLanguage.g:1055:4: otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskRequirementAccess().getPropertiesKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_16, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBehaviourLanguage.g:1063:4: ( (lv_properties_17_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1064:5: (lv_properties_17_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1064:5: (lv_properties_17_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1065:6: lv_properties_17_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_17_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_17_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1082:4: (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1083:5: otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getTaskRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1087:5: ( (lv_properties_19_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1088:6: (lv_properties_19_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1088:6: (lv_properties_19_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1089:7: lv_properties_19_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_19_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_19_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_42); 

                    				newLeafNode(otherlv_20, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1112:3: (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBehaviourLanguage.g:1113:4: otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_22, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBehaviourLanguage.g:1121:4: ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) )
                    // InternalBehaviourLanguage.g:1122:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    {
                    // InternalBehaviourLanguage.g:1122:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    // InternalBehaviourLanguage.g:1123:6: lv_capabilityProperties_23_0= ruleCapabilityProperties
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_capabilityProperties_23_0=ruleCapabilityProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
                    						}
                    						add(
                    							current,
                    							"capabilityProperties",
                    							lv_capabilityProperties_23_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.CapabilityProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1140:4: (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1141:5: otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getTaskRequirementAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1145:5: ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    // InternalBehaviourLanguage.g:1146:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    {
                    	    // InternalBehaviourLanguage.g:1146:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    // InternalBehaviourLanguage.g:1147:7: lv_capabilityProperties_25_0= ruleCapabilityProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_capabilityProperties_25_0=ruleCapabilityProperties();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"capabilityProperties",
                    	    								lv_capabilityProperties_25_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.CapabilityProperties");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskRequirement"


    // $ANTLR start "entryRuleBehaviouralPropertyKeyContainer"
    // InternalBehaviourLanguage.g:1178:1: entryRuleBehaviouralPropertyKeyContainer returns [EObject current=null] : iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF ;
    public final EObject entryRuleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralPropertyKeyContainer = null;


        try {
            // InternalBehaviourLanguage.g:1178:72: (iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF )
            // InternalBehaviourLanguage.g:1179:2: iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF
            {
             newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviouralPropertyKeyContainer=ruleBehaviouralPropertyKeyContainer();

            state._fsp--;

             current =iv_ruleBehaviouralPropertyKeyContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviouralPropertyKeyContainer"


    // $ANTLR start "ruleBehaviouralPropertyKeyContainer"
    // InternalBehaviourLanguage.g:1185:1: ruleBehaviouralPropertyKeyContainer returns [EObject current=null] : ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_keys_6_0 = null;

        EObject lv_keys_8_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1191:2: ( ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:1192:2: ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:1192:2: ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:1193:3: () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalBehaviourLanguage.g:1193:3: ()
            // InternalBehaviourLanguage.g:1194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerKeyword_1());
            		
            // InternalBehaviourLanguage.g:1204:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1205:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1205:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:1206:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviouralPropertyKeyContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1227:3: (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBehaviourLanguage.g:1228:4: otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_5, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1236:4: ( (lv_keys_6_0= rulePropertyKey ) )
                    // InternalBehaviourLanguage.g:1237:5: (lv_keys_6_0= rulePropertyKey )
                    {
                    // InternalBehaviourLanguage.g:1237:5: (lv_keys_6_0= rulePropertyKey )
                    // InternalBehaviourLanguage.g:1238:6: lv_keys_6_0= rulePropertyKey
                    {

                    						newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_keys_6_0=rulePropertyKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviouralPropertyKeyContainerRule());
                    						}
                    						add(
                    							current,
                    							"keys",
                    							lv_keys_6_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.PropertyKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1255:4: (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1256:5: otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1260:5: ( (lv_keys_8_0= rulePropertyKey ) )
                    	    // InternalBehaviourLanguage.g:1261:6: (lv_keys_8_0= rulePropertyKey )
                    	    {
                    	    // InternalBehaviourLanguage.g:1261:6: (lv_keys_8_0= rulePropertyKey )
                    	    // InternalBehaviourLanguage.g:1262:7: lv_keys_8_0= rulePropertyKey
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_keys_8_0=rulePropertyKey();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviouralPropertyKeyContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keys",
                    	    								lv_keys_8_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.PropertyKey");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviouralPropertyKeyContainer"


    // $ANTLR start "entryRuleEString"
    // InternalBehaviourLanguage.g:1293:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBehaviourLanguage.g:1293:47: (iv_ruleEString= ruleEString EOF )
            // InternalBehaviourLanguage.g:1294:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBehaviourLanguage.g:1300:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1306:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1307:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1307:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalBehaviourLanguage.g:1308:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1316:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDetectedObject"
    // InternalBehaviourLanguage.g:1327:1: entryRuleDetectedObject returns [EObject current=null] : iv_ruleDetectedObject= ruleDetectedObject EOF ;
    public final EObject entryRuleDetectedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectedObject = null;


        try {
            // InternalBehaviourLanguage.g:1327:55: (iv_ruleDetectedObject= ruleDetectedObject EOF )
            // InternalBehaviourLanguage.g:1328:2: iv_ruleDetectedObject= ruleDetectedObject EOF
            {
             newCompositeNode(grammarAccess.getDetectedObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetectedObject=ruleDetectedObject();

            state._fsp--;

             current =iv_ruleDetectedObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDetectedObject"


    // $ANTLR start "ruleDetectedObject"
    // InternalBehaviourLanguage.g:1334:1: ruleDetectedObject returns [EObject current=null] : ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleDetectedObject() throws RecognitionException {
        EObject current = null;

        Token lv_obstacle_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1340:2: ( ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalBehaviourLanguage.g:1341:2: ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalBehaviourLanguage.g:1341:2: ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalBehaviourLanguage.g:1342:3: ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}'
            {
            // InternalBehaviourLanguage.g:1342:3: ( (lv_obstacle_0_0= 'obstacle' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBehaviourLanguage.g:1343:4: (lv_obstacle_0_0= 'obstacle' )
                    {
                    // InternalBehaviourLanguage.g:1343:4: (lv_obstacle_0_0= 'obstacle' )
                    // InternalBehaviourLanguage.g:1344:5: lv_obstacle_0_0= 'obstacle'
                    {
                    lv_obstacle_0_0=(Token)match(input,43,FOLLOW_46); 

                    					newLeafNode(lv_obstacle_0_0, grammarAccess.getDetectedObjectAccess().getObstacleObstacleKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDetectedObjectRule());
                    					}
                    					setWithLastConsumed(current, "obstacle", true, "obstacle");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDetectedObjectAccess().getDetectedObjectKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getDetectedObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getDetectedObjectAccess().getObjectKeyword_3());
            		
            // InternalBehaviourLanguage.g:1368:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:1369:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:1369:4: ( ruleEString )
            // InternalBehaviourLanguage.g:1370:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectedObjectRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDetectedObjectAccess().getObjectAreaObjectCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDetectedObjectAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDetectedObject"


    // $ANTLR start "entryRuleRobotCollaboration"
    // InternalBehaviourLanguage.g:1392:1: entryRuleRobotCollaboration returns [EObject current=null] : iv_ruleRobotCollaboration= ruleRobotCollaboration EOF ;
    public final EObject entryRuleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotCollaboration = null;


        try {
            // InternalBehaviourLanguage.g:1392:59: (iv_ruleRobotCollaboration= ruleRobotCollaboration EOF )
            // InternalBehaviourLanguage.g:1393:2: iv_ruleRobotCollaboration= ruleRobotCollaboration EOF
            {
             newCompositeNode(grammarAccess.getRobotCollaborationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotCollaboration=ruleRobotCollaboration();

            state._fsp--;

             current =iv_ruleRobotCollaboration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobotCollaboration"


    // $ANTLR start "ruleRobotCollaboration"
    // InternalBehaviourLanguage.g:1399:1: ruleRobotCollaboration returns [EObject current=null] : (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1405:2: ( (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:1406:2: (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:1406:2: (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:1407:3: otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotCollaborationAccess().getRobotCollaborationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotCollaborationAccess().getCollaboratorKeyword_2());
            		
            // InternalBehaviourLanguage.g:1419:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:1420:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:1420:4: ( ruleEString )
            // InternalBehaviourLanguage.g:1421:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotCollaborationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRobotCollaborationAccess().getCollaboratorDynamicRobotCrossReference_3_0());
            				
            pushFollow(FOLLOW_49);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:1435:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBehaviourLanguage.g:1436:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotCollaborationAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1444:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1445:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1445:5: (lv_properties_6_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1446:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotCollaborationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_6_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1463:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1464:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRobotCollaborationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1468:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1469:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1469:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1470:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotCollaborationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_8_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobotCollaborationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRobotCollaborationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobotCollaboration"


    // $ANTLR start "entryRuleMessageRepository"
    // InternalBehaviourLanguage.g:1501:1: entryRuleMessageRepository returns [EObject current=null] : iv_ruleMessageRepository= ruleMessageRepository EOF ;
    public final EObject entryRuleMessageRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageRepository = null;


        try {
            // InternalBehaviourLanguage.g:1501:58: (iv_ruleMessageRepository= ruleMessageRepository EOF )
            // InternalBehaviourLanguage.g:1502:2: iv_ruleMessageRepository= ruleMessageRepository EOF
            {
             newCompositeNode(grammarAccess.getMessageRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageRepository=ruleMessageRepository();

            state._fsp--;

             current =iv_ruleMessageRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageRepository"


    // $ANTLR start "ruleMessageRepository"
    // InternalBehaviourLanguage.g:1508:1: ruleMessageRepository returns [EObject current=null] : ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleMessageRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sendedMessages_6_0 = null;

        EObject lv_sendedMessages_8_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1514:2: ( ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:1515:2: ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:1515:2: ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:1516:3: () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalBehaviourLanguage.g:1516:3: ()
            // InternalBehaviourLanguage.g:1517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageRepositoryAccess().getMessageRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageRepositoryAccess().getMessageRepositoryKeyword_1());
            		
            // InternalBehaviourLanguage.g:1527:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1528:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1528:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:1529:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageRepositoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRepositoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1550:3: (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBehaviourLanguage.g:1551:4: otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageRepositoryAccess().getSendedMessagesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1559:4: ( (lv_sendedMessages_6_0= ruleMessage ) )
                    // InternalBehaviourLanguage.g:1560:5: (lv_sendedMessages_6_0= ruleMessage )
                    {
                    // InternalBehaviourLanguage.g:1560:5: (lv_sendedMessages_6_0= ruleMessage )
                    // InternalBehaviourLanguage.g:1561:6: lv_sendedMessages_6_0= ruleMessage
                    {

                    						newCompositeNode(grammarAccess.getMessageRepositoryAccess().getSendedMessagesMessageParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_sendedMessages_6_0=ruleMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"sendedMessages",
                    							lv_sendedMessages_6_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Message");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1578:4: (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1579:5: otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMessageRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1583:5: ( (lv_sendedMessages_8_0= ruleMessage ) )
                    	    // InternalBehaviourLanguage.g:1584:6: (lv_sendedMessages_8_0= ruleMessage )
                    	    {
                    	    // InternalBehaviourLanguage.g:1584:6: (lv_sendedMessages_8_0= ruleMessage )
                    	    // InternalBehaviourLanguage.g:1585:7: lv_sendedMessages_8_0= ruleMessage
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageRepositoryAccess().getSendedMessagesMessageParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_sendedMessages_8_0=ruleMessage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessageRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sendedMessages",
                    	    								lv_sendedMessages_8_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Message");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getMessageRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMessageRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageRepository"


    // $ANTLR start "entryRuleAction_Impl"
    // InternalBehaviourLanguage.g:1616:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalBehaviourLanguage.g:1616:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalBehaviourLanguage.g:1617:2: iv_ruleAction_Impl= ruleAction_Impl EOF
            {
             newCompositeNode(grammarAccess.getAction_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction_Impl=ruleAction_Impl();

            state._fsp--;

             current =iv_ruleAction_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction_Impl"


    // $ANTLR start "ruleAction_Impl"
    // InternalBehaviourLanguage.g:1623:1: ruleAction_Impl returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleAction_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1629:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalBehaviourLanguage.g:1630:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalBehaviourLanguage.g:1630:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalBehaviourLanguage.g:1631:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalBehaviourLanguage.g:1631:3: ()
            // InternalBehaviourLanguage.g:1632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAction_ImplAccess().getActionKeyword_1());
            		
            // InternalBehaviourLanguage.g:1642:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1643:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1643:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:1644:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAction_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAction_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1665:3: (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBehaviourLanguage.g:1666:4: otherlv_4= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getCurrentTaskExecutionKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:1670:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:1671:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:1671:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:1672:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getCurrentTaskExecutionTaskExecutionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1687:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBehaviourLanguage.g:1688:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAction_ImplAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:1696:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1697:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1697:5: (lv_properties_8_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1698:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAction_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1715:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1716:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAction_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1720:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1721:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1721:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1722:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getAction_ImplAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAction_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction_Impl"


    // $ANTLR start "entryRulePosition"
    // InternalBehaviourLanguage.g:1753:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalBehaviourLanguage.g:1753:49: (iv_rulePosition= rulePosition EOF )
            // InternalBehaviourLanguage.g:1754:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalBehaviourLanguage.g:1760:1: rulePosition returns [EObject current=null] : ( () otherlv_1= 'Position' otherlv_2= '{' (otherlv_3= 'coordinates' otherlv_4= '{' ( (lv_coordinates_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )* otherlv_8= '}' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_coordinates_5_0 = null;

        EObject lv_coordinates_7_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_properties_13_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1766:2: ( ( () otherlv_1= 'Position' otherlv_2= '{' (otherlv_3= 'coordinates' otherlv_4= '{' ( (lv_coordinates_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )* otherlv_8= '}' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalBehaviourLanguage.g:1767:2: ( () otherlv_1= 'Position' otherlv_2= '{' (otherlv_3= 'coordinates' otherlv_4= '{' ( (lv_coordinates_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )* otherlv_8= '}' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalBehaviourLanguage.g:1767:2: ( () otherlv_1= 'Position' otherlv_2= '{' (otherlv_3= 'coordinates' otherlv_4= '{' ( (lv_coordinates_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )* otherlv_8= '}' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalBehaviourLanguage.g:1768:3: () otherlv_1= 'Position' otherlv_2= '{' (otherlv_3= 'coordinates' otherlv_4= '{' ( (lv_coordinates_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )* otherlv_8= '}' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalBehaviourLanguage.g:1768:3: ()
            // InternalBehaviourLanguage.g:1769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPositionAccess().getPositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getPositionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:1783:3: (otherlv_3= 'coordinates' otherlv_4= '{' ( (lv_coordinates_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )* otherlv_8= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBehaviourLanguage.g:1784:4: otherlv_3= 'coordinates' otherlv_4= '{' ( (lv_coordinates_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getCoordinatesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_54); 

                    				newLeafNode(otherlv_4, grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBehaviourLanguage.g:1792:4: ( (lv_coordinates_5_0= ruleCoordinate ) )
                    // InternalBehaviourLanguage.g:1793:5: (lv_coordinates_5_0= ruleCoordinate )
                    {
                    // InternalBehaviourLanguage.g:1793:5: (lv_coordinates_5_0= ruleCoordinate )
                    // InternalBehaviourLanguage.g:1794:6: lv_coordinates_5_0= ruleCoordinate
                    {

                    						newCompositeNode(grammarAccess.getPositionAccess().getCoordinatesCoordinateParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_coordinates_5_0=ruleCoordinate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositionRule());
                    						}
                    						add(
                    							current,
                    							"coordinates",
                    							lv_coordinates_5_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Coordinate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1811:4: (otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1812:5: otherlv_6= ',' ( (lv_coordinates_7_0= ruleCoordinate ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_54); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPositionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1816:5: ( (lv_coordinates_7_0= ruleCoordinate ) )
                    	    // InternalBehaviourLanguage.g:1817:6: (lv_coordinates_7_0= ruleCoordinate )
                    	    {
                    	    // InternalBehaviourLanguage.g:1817:6: (lv_coordinates_7_0= ruleCoordinate )
                    	    // InternalBehaviourLanguage.g:1818:7: lv_coordinates_7_0= ruleCoordinate
                    	    {

                    	    							newCompositeNode(grammarAccess.getPositionAccess().getCoordinatesCoordinateParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_coordinates_7_0=ruleCoordinate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPositionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"coordinates",
                    	    								lv_coordinates_7_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Coordinate");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_49); 

                    				newLeafNode(otherlv_8, grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1841:3: (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBehaviourLanguage.g:1842:4: otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPositionAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1850:4: ( (lv_properties_11_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1851:5: (lv_properties_11_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1851:5: (lv_properties_11_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1852:6: lv_properties_11_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPositionAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_11_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositionRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_11_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1869:4: (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1870:5: otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPositionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1874:5: ( (lv_properties_13_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1875:6: (lv_properties_13_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1875:6: (lv_properties_13_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1876:7: lv_properties_13_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getPositionAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_13_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPositionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_13_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleSize"
    // InternalBehaviourLanguage.g:1907:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalBehaviourLanguage.g:1907:45: (iv_ruleSize= ruleSize EOF )
            // InternalBehaviourLanguage.g:1908:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalBehaviourLanguage.g:1914:1: ruleSize returns [EObject current=null] : (otherlv_0= 'Size' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= ruleMeasureValue ) ) otherlv_4= 'height' ( (lv_height_5_0= ruleMeasureValue ) ) otherlv_6= 'length' ( (lv_length_7_0= ruleMeasureValue ) ) otherlv_8= '}' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_width_3_0 = null;

        EObject lv_height_5_0 = null;

        EObject lv_length_7_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1920:2: ( (otherlv_0= 'Size' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= ruleMeasureValue ) ) otherlv_4= 'height' ( (lv_height_5_0= ruleMeasureValue ) ) otherlv_6= 'length' ( (lv_length_7_0= ruleMeasureValue ) ) otherlv_8= '}' ) )
            // InternalBehaviourLanguage.g:1921:2: (otherlv_0= 'Size' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= ruleMeasureValue ) ) otherlv_4= 'height' ( (lv_height_5_0= ruleMeasureValue ) ) otherlv_6= 'length' ( (lv_length_7_0= ruleMeasureValue ) ) otherlv_8= '}' )
            {
            // InternalBehaviourLanguage.g:1921:2: (otherlv_0= 'Size' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= ruleMeasureValue ) ) otherlv_4= 'height' ( (lv_height_5_0= ruleMeasureValue ) ) otherlv_6= 'length' ( (lv_length_7_0= ruleMeasureValue ) ) otherlv_8= '}' )
            // InternalBehaviourLanguage.g:1922:3: otherlv_0= 'Size' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= ruleMeasureValue ) ) otherlv_4= 'height' ( (lv_height_5_0= ruleMeasureValue ) ) otherlv_6= 'length' ( (lv_length_7_0= ruleMeasureValue ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSizeAccess().getWidthKeyword_2());
            		
            // InternalBehaviourLanguage.g:1934:3: ( (lv_width_3_0= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:1935:4: (lv_width_3_0= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:1935:4: (lv_width_3_0= ruleMeasureValue )
            // InternalBehaviourLanguage.g:1936:5: lv_width_3_0= ruleMeasureValue
            {

            					newCompositeNode(grammarAccess.getSizeAccess().getWidthMeasureValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
            lv_width_3_0=ruleMeasureValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizeRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_3_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getSizeAccess().getHeightKeyword_4());
            		
            // InternalBehaviourLanguage.g:1957:3: ( (lv_height_5_0= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:1958:4: (lv_height_5_0= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:1958:4: (lv_height_5_0= ruleMeasureValue )
            // InternalBehaviourLanguage.g:1959:5: lv_height_5_0= ruleMeasureValue
            {

            					newCompositeNode(grammarAccess.getSizeAccess().getHeightMeasureValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_57);
            lv_height_5_0=ruleMeasureValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizeRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_5_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,57,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getSizeAccess().getLengthKeyword_6());
            		
            // InternalBehaviourLanguage.g:1980:3: ( (lv_length_7_0= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:1981:4: (lv_length_7_0= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:1981:4: (lv_length_7_0= ruleMeasureValue )
            // InternalBehaviourLanguage.g:1982:5: lv_length_7_0= ruleMeasureValue
            {

            					newCompositeNode(grammarAccess.getSizeAccess().getLengthMeasureValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_length_7_0=ruleMeasureValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizeRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_7_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSizeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleBattery"
    // InternalBehaviourLanguage.g:2007:1: entryRuleBattery returns [EObject current=null] : iv_ruleBattery= ruleBattery EOF ;
    public final EObject entryRuleBattery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBattery = null;


        try {
            // InternalBehaviourLanguage.g:2007:48: (iv_ruleBattery= ruleBattery EOF )
            // InternalBehaviourLanguage.g:2008:2: iv_ruleBattery= ruleBattery EOF
            {
             newCompositeNode(grammarAccess.getBatteryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBattery=ruleBattery();

            state._fsp--;

             current =iv_ruleBattery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBattery"


    // $ANTLR start "ruleBattery"
    // InternalBehaviourLanguage.g:2014:1: ruleBattery returns [EObject current=null] : (otherlv_0= 'Battery' otherlv_1= '{' otherlv_2= 'capacity' ( (lv_capacity_3_0= ruleMeasureValue ) ) otherlv_4= 'voltage' ( (lv_voltage_5_0= ruleMeasureValue ) ) otherlv_6= 'rechargeTime' ( (lv_rechargeTime_7_0= ruleMeasureValue ) ) (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleBattery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_capacity_3_0 = null;

        EObject lv_voltage_5_0 = null;

        EObject lv_rechargeTime_7_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2020:2: ( (otherlv_0= 'Battery' otherlv_1= '{' otherlv_2= 'capacity' ( (lv_capacity_3_0= ruleMeasureValue ) ) otherlv_4= 'voltage' ( (lv_voltage_5_0= ruleMeasureValue ) ) otherlv_6= 'rechargeTime' ( (lv_rechargeTime_7_0= ruleMeasureValue ) ) (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalBehaviourLanguage.g:2021:2: (otherlv_0= 'Battery' otherlv_1= '{' otherlv_2= 'capacity' ( (lv_capacity_3_0= ruleMeasureValue ) ) otherlv_4= 'voltage' ( (lv_voltage_5_0= ruleMeasureValue ) ) otherlv_6= 'rechargeTime' ( (lv_rechargeTime_7_0= ruleMeasureValue ) ) (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalBehaviourLanguage.g:2021:2: (otherlv_0= 'Battery' otherlv_1= '{' otherlv_2= 'capacity' ( (lv_capacity_3_0= ruleMeasureValue ) ) otherlv_4= 'voltage' ( (lv_voltage_5_0= ruleMeasureValue ) ) otherlv_6= 'rechargeTime' ( (lv_rechargeTime_7_0= ruleMeasureValue ) ) (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalBehaviourLanguage.g:2022:3: otherlv_0= 'Battery' otherlv_1= '{' otherlv_2= 'capacity' ( (lv_capacity_3_0= ruleMeasureValue ) ) otherlv_4= 'voltage' ( (lv_voltage_5_0= ruleMeasureValue ) ) otherlv_6= 'rechargeTime' ( (lv_rechargeTime_7_0= ruleMeasureValue ) ) (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBatteryAccess().getBatteryKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getBatteryAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getBatteryAccess().getCapacityKeyword_2());
            		
            // InternalBehaviourLanguage.g:2034:3: ( (lv_capacity_3_0= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:2035:4: (lv_capacity_3_0= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:2035:4: (lv_capacity_3_0= ruleMeasureValue )
            // InternalBehaviourLanguage.g:2036:5: lv_capacity_3_0= ruleMeasureValue
            {

            					newCompositeNode(grammarAccess.getBatteryAccess().getCapacityMeasureValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_59);
            lv_capacity_3_0=ruleMeasureValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBatteryRule());
            					}
            					set(
            						current,
            						"capacity",
            						lv_capacity_3_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getBatteryAccess().getVoltageKeyword_4());
            		
            // InternalBehaviourLanguage.g:2057:3: ( (lv_voltage_5_0= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:2058:4: (lv_voltage_5_0= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:2058:4: (lv_voltage_5_0= ruleMeasureValue )
            // InternalBehaviourLanguage.g:2059:5: lv_voltage_5_0= ruleMeasureValue
            {

            					newCompositeNode(grammarAccess.getBatteryAccess().getVoltageMeasureValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_60);
            lv_voltage_5_0=ruleMeasureValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBatteryRule());
            					}
            					set(
            						current,
            						"voltage",
            						lv_voltage_5_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,61,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getBatteryAccess().getRechargeTimeKeyword_6());
            		
            // InternalBehaviourLanguage.g:2080:3: ( (lv_rechargeTime_7_0= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:2081:4: (lv_rechargeTime_7_0= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:2081:4: (lv_rechargeTime_7_0= ruleMeasureValue )
            // InternalBehaviourLanguage.g:2082:5: lv_rechargeTime_7_0= ruleMeasureValue
            {

            					newCompositeNode(grammarAccess.getBatteryAccess().getRechargeTimeMeasureValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_49);
            lv_rechargeTime_7_0=ruleMeasureValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBatteryRule());
            					}
            					set(
            						current,
            						"rechargeTime",
            						lv_rechargeTime_7_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:2099:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBehaviourLanguage.g:2100:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getBatteryAccess().getPropertiesKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_9, grammarAccess.getBatteryAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:2108:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2109:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2109:5: (lv_properties_10_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2110:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getBatteryAccess().getPropertiesPropertyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBatteryRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2127:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2128:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBatteryAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2132:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2133:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2133:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2134:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getBatteryAccess().getPropertiesPropertyParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBatteryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getBatteryAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getBatteryAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBattery"


    // $ANTLR start "entryRuleEquipment"
    // InternalBehaviourLanguage.g:2165:1: entryRuleEquipment returns [EObject current=null] : iv_ruleEquipment= ruleEquipment EOF ;
    public final EObject entryRuleEquipment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquipment = null;


        try {
            // InternalBehaviourLanguage.g:2165:50: (iv_ruleEquipment= ruleEquipment EOF )
            // InternalBehaviourLanguage.g:2166:2: iv_ruleEquipment= ruleEquipment EOF
            {
             newCompositeNode(grammarAccess.getEquipmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquipment=ruleEquipment();

            state._fsp--;

             current =iv_ruleEquipment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquipment"


    // $ANTLR start "ruleEquipment"
    // InternalBehaviourLanguage.g:2172:1: ruleEquipment returns [EObject current=null] : ( () otherlv_1= 'Equipment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'facilitate' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleEquipment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2178:2: ( ( () otherlv_1= 'Equipment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'facilitate' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalBehaviourLanguage.g:2179:2: ( () otherlv_1= 'Equipment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'facilitate' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalBehaviourLanguage.g:2179:2: ( () otherlv_1= 'Equipment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'facilitate' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalBehaviourLanguage.g:2180:3: () otherlv_1= 'Equipment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'facilitate' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalBehaviourLanguage.g:2180:3: ()
            // InternalBehaviourLanguage.g:2181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEquipmentAccess().getEquipmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEquipmentAccess().getEquipmentKeyword_1());
            		
            // InternalBehaviourLanguage.g:2191:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2192:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2192:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:2193:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEquipmentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquipmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getEquipmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:2214:3: (otherlv_4= 'facilitate' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==63) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBehaviourLanguage.g:2215:4: otherlv_4= 'facilitate' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getEquipmentAccess().getFacilitateKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEquipmentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:2223:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:2224:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:2224:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:2225:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEquipmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEquipmentAccess().getFacilitateCapabilityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2239:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==14) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2240:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEquipmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2244:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:2245:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:2245:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:2246:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEquipmentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEquipmentAccess().getFacilitateCapabilityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,24,FOLLOW_49); 

                    				newLeafNode(otherlv_9, grammarAccess.getEquipmentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2266:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBehaviourLanguage.g:2267:4: otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEquipmentAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getEquipmentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:2275:4: ( (lv_properties_12_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2276:5: (lv_properties_12_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2276:5: (lv_properties_12_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2277:6: lv_properties_12_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getEquipmentAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_12_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEquipmentRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_12_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2294:4: (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2295:5: otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEquipmentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2299:5: ( (lv_properties_14_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2300:6: (lv_properties_14_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2300:6: (lv_properties_14_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2301:7: lv_properties_14_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getEquipmentAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_14_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEquipmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_14_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getEquipmentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEquipmentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquipment"


    // $ANTLR start "entryRuleProperty"
    // InternalBehaviourLanguage.g:2332:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBehaviourLanguage.g:2332:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBehaviourLanguage.g:2333:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalBehaviourLanguage.g:2339:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2345:2: ( (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:2346:2: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:2346:2: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' )
            // InternalBehaviourLanguage.g:2347:3: otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,65,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getKeyKeyword_2());
            		
            // InternalBehaviourLanguage.g:2359:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2360:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2360:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2361:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getKeyPropertyKeyCrossReference_3_0());
            				
            pushFollow(FOLLOW_63);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,66,FOLLOW_64); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getValueKeyword_4());
            		
            // InternalBehaviourLanguage.g:2379:3: ( (lv_value_5_0= rulePropertyValue ) )
            // InternalBehaviourLanguage.g:2380:4: (lv_value_5_0= rulePropertyValue )
            {
            // InternalBehaviourLanguage.g:2380:4: (lv_value_5_0= rulePropertyValue )
            // InternalBehaviourLanguage.g:2381:5: lv_value_5_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_5_0=rulePropertyValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.PropertyValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMeasureValue"
    // InternalBehaviourLanguage.g:2406:1: entryRuleMeasureValue returns [EObject current=null] : iv_ruleMeasureValue= ruleMeasureValue EOF ;
    public final EObject entryRuleMeasureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue = null;


        try {
            // InternalBehaviourLanguage.g:2406:53: (iv_ruleMeasureValue= ruleMeasureValue EOF )
            // InternalBehaviourLanguage.g:2407:2: iv_ruleMeasureValue= ruleMeasureValue EOF
            {
             newCompositeNode(grammarAccess.getMeasureValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureValue=ruleMeasureValue();

            state._fsp--;

             current =iv_ruleMeasureValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasureValue"


    // $ANTLR start "ruleMeasureValue"
    // InternalBehaviourLanguage.g:2413:1: ruleMeasureValue returns [EObject current=null] : (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleMeasureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2419:2: ( (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:2420:2: (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:2420:2: (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalBehaviourLanguage.g:2421:3: otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureValueAccess().getMeasureValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:2429:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==66) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBehaviourLanguage.g:2430:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) )
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureValueAccess().getValueKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:2434:4: ( (lv_value_3_0= ruleEFloat ) )
                    // InternalBehaviourLanguage.g:2435:5: (lv_value_3_0= ruleEFloat )
                    {
                    // InternalBehaviourLanguage.g:2435:5: (lv_value_3_0= ruleEFloat )
                    // InternalBehaviourLanguage.g:2436:6: lv_value_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getMeasureValueAccess().getValueEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_value_3_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,68,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureValueAccess().getDimensionKeyword_3());
            		
            // InternalBehaviourLanguage.g:2458:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2459:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2459:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2460:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureValueAccess().getDimensionMeasureDimensionCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMeasureValueAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasureValue"


    // $ANTLR start "entryRuleCapabilityProperties"
    // InternalBehaviourLanguage.g:2482:1: entryRuleCapabilityProperties returns [EObject current=null] : iv_ruleCapabilityProperties= ruleCapabilityProperties EOF ;
    public final EObject entryRuleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperties = null;


        try {
            // InternalBehaviourLanguage.g:2482:61: (iv_ruleCapabilityProperties= ruleCapabilityProperties EOF )
            // InternalBehaviourLanguage.g:2483:2: iv_ruleCapabilityProperties= ruleCapabilityProperties EOF
            {
             newCompositeNode(grammarAccess.getCapabilityPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapabilityProperties=ruleCapabilityProperties();

            state._fsp--;

             current =iv_ruleCapabilityProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapabilityProperties"


    // $ANTLR start "ruleCapabilityProperties"
    // InternalBehaviourLanguage.g:2489:1: ruleCapabilityProperties returns [EObject current=null] : (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2495:2: ( (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:2496:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:2496:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:2497:3: otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertiesAccess().getCapabilityPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,70,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertiesAccess().getCapabilityKeyword_2());
            		
            // InternalBehaviourLanguage.g:2509:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2510:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2510:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2511:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityPropertiesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getCapabilityCapabilityCrossReference_3_0());
            				
            pushFollow(FOLLOW_49);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:2525:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBehaviourLanguage.g:2526:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertiesAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:2534:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2535:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2535:5: (lv_properties_6_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2536:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityPropertiesRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_6_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2553:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2554:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCapabilityPropertiesAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2558:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2559:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2559:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2560:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCapabilityPropertiesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_8_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getCapabilityPropertiesAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCapabilityPropertiesAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapabilityProperties"


    // $ANTLR start "entryRuleCoordinate"
    // InternalBehaviourLanguage.g:2591:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalBehaviourLanguage.g:2591:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalBehaviourLanguage.g:2592:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;

             current =iv_ruleCoordinate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalBehaviourLanguage.g:2598:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= 'Coordinate' otherlv_1= '{' otherlv_2= 'latitude' ( (lv_latitude_3_0= ruleEFloat ) ) otherlv_4= 'longitude' ( (lv_longitude_5_0= ruleEFloat ) ) otherlv_6= 'altitude' ( (lv_altitude_7_0= ruleEFloat ) ) otherlv_8= '}' ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_latitude_3_0 = null;

        AntlrDatatypeRuleToken lv_longitude_5_0 = null;

        AntlrDatatypeRuleToken lv_altitude_7_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2604:2: ( (otherlv_0= 'Coordinate' otherlv_1= '{' otherlv_2= 'latitude' ( (lv_latitude_3_0= ruleEFloat ) ) otherlv_4= 'longitude' ( (lv_longitude_5_0= ruleEFloat ) ) otherlv_6= 'altitude' ( (lv_altitude_7_0= ruleEFloat ) ) otherlv_8= '}' ) )
            // InternalBehaviourLanguage.g:2605:2: (otherlv_0= 'Coordinate' otherlv_1= '{' otherlv_2= 'latitude' ( (lv_latitude_3_0= ruleEFloat ) ) otherlv_4= 'longitude' ( (lv_longitude_5_0= ruleEFloat ) ) otherlv_6= 'altitude' ( (lv_altitude_7_0= ruleEFloat ) ) otherlv_8= '}' )
            {
            // InternalBehaviourLanguage.g:2605:2: (otherlv_0= 'Coordinate' otherlv_1= '{' otherlv_2= 'latitude' ( (lv_latitude_3_0= ruleEFloat ) ) otherlv_4= 'longitude' ( (lv_longitude_5_0= ruleEFloat ) ) otherlv_6= 'altitude' ( (lv_altitude_7_0= ruleEFloat ) ) otherlv_8= '}' )
            // InternalBehaviourLanguage.g:2606:3: otherlv_0= 'Coordinate' otherlv_1= '{' otherlv_2= 'latitude' ( (lv_latitude_3_0= ruleEFloat ) ) otherlv_4= 'longitude' ( (lv_longitude_5_0= ruleEFloat ) ) otherlv_6= 'altitude' ( (lv_altitude_7_0= ruleEFloat ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getCoordinateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getLatitudeKeyword_2());
            		
            // InternalBehaviourLanguage.g:2618:3: ( (lv_latitude_3_0= ruleEFloat ) )
            // InternalBehaviourLanguage.g:2619:4: (lv_latitude_3_0= ruleEFloat )
            {
            // InternalBehaviourLanguage.g:2619:4: (lv_latitude_3_0= ruleEFloat )
            // InternalBehaviourLanguage.g:2620:5: lv_latitude_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getLatitudeEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_70);
            lv_latitude_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"latitude",
            						lv_latitude_3_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,73,FOLLOW_66); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinateAccess().getLongitudeKeyword_4());
            		
            // InternalBehaviourLanguage.g:2641:3: ( (lv_longitude_5_0= ruleEFloat ) )
            // InternalBehaviourLanguage.g:2642:4: (lv_longitude_5_0= ruleEFloat )
            {
            // InternalBehaviourLanguage.g:2642:4: (lv_longitude_5_0= ruleEFloat )
            // InternalBehaviourLanguage.g:2643:5: lv_longitude_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getLongitudeEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_71);
            lv_longitude_5_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"longitude",
            						lv_longitude_5_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,74,FOLLOW_66); 

            			newLeafNode(otherlv_6, grammarAccess.getCoordinateAccess().getAltitudeKeyword_6());
            		
            // InternalBehaviourLanguage.g:2664:3: ( (lv_altitude_7_0= ruleEFloat ) )
            // InternalBehaviourLanguage.g:2665:4: (lv_altitude_7_0= ruleEFloat )
            {
            // InternalBehaviourLanguage.g:2665:4: (lv_altitude_7_0= ruleEFloat )
            // InternalBehaviourLanguage.g:2666:5: lv_altitude_7_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getAltitudeEFloatParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_altitude_7_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"altitude",
            						lv_altitude_7_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCoordinateAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleEFloat"
    // InternalBehaviourLanguage.g:2691:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBehaviourLanguage.g:2691:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBehaviourLanguage.g:2692:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalBehaviourLanguage.g:2698:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2704:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBehaviourLanguage.g:2705:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBehaviourLanguage.g:2705:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBehaviourLanguage.g:2706:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBehaviourLanguage.g:2706:3: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==75) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBehaviourLanguage.g:2707:4: kw= '-'
                    {
                    kw=(Token)match(input,75,FOLLOW_72); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2713:3: (this_INT_1= RULE_INT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBehaviourLanguage.g:2714:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_73); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,76,FOLLOW_74); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_75); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBehaviourLanguage.g:2734:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=77 && LA57_0<=78)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBehaviourLanguage.g:2735:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBehaviourLanguage.g:2735:4: (kw= 'E' | kw= 'e' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==77) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==78) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2736:5: kw= 'E'
                            {
                            kw=(Token)match(input,77,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:2742:5: kw= 'e'
                            {
                            kw=(Token)match(input,78,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2748:4: (kw= '-' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==75) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2749:5: kw= '-'
                            {
                            kw=(Token)match(input,75,FOLLOW_74); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleTaskDescriptor"
    // InternalBehaviourLanguage.g:2767:1: entryRuleTaskDescriptor returns [EObject current=null] : iv_ruleTaskDescriptor= ruleTaskDescriptor EOF ;
    public final EObject entryRuleTaskDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDescriptor = null;


        try {
            // InternalBehaviourLanguage.g:2767:55: (iv_ruleTaskDescriptor= ruleTaskDescriptor EOF )
            // InternalBehaviourLanguage.g:2768:2: iv_ruleTaskDescriptor= ruleTaskDescriptor EOF
            {
             newCompositeNode(grammarAccess.getTaskDescriptorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDescriptor=ruleTaskDescriptor();

            state._fsp--;

             current =iv_ruleTaskDescriptor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskDescriptor"


    // $ANTLR start "ruleTaskDescriptor"
    // InternalBehaviourLanguage.g:2774:1: ruleTaskDescriptor returns [EObject current=null] : ( () otherlv_1= 'TaskDescriptor' otherlv_2= '{' (otherlv_3= 'targets' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTaskDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_properties_11_0 = null;

        EObject lv_properties_13_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2780:2: ( ( () otherlv_1= 'TaskDescriptor' otherlv_2= '{' (otherlv_3= 'targets' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalBehaviourLanguage.g:2781:2: ( () otherlv_1= 'TaskDescriptor' otherlv_2= '{' (otherlv_3= 'targets' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalBehaviourLanguage.g:2781:2: ( () otherlv_1= 'TaskDescriptor' otherlv_2= '{' (otherlv_3= 'targets' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalBehaviourLanguage.g:2782:3: () otherlv_1= 'TaskDescriptor' otherlv_2= '{' (otherlv_3= 'targets' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalBehaviourLanguage.g:2782:3: ()
            // InternalBehaviourLanguage.g:2783:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskDescriptorAccess().getTaskDescriptorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDescriptorAccess().getTaskDescriptorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskDescriptorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:2797:3: (otherlv_3= 'targets' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==80) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBehaviourLanguage.g:2798:4: otherlv_3= 'targets' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskDescriptorAccess().getTargetsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskDescriptorAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalBehaviourLanguage.g:2806:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:2807:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:2807:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:2808:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskDescriptorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskDescriptorAccess().getTargetsAreaObjectCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2822:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2823:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTaskDescriptorAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2827:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:2828:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:2828:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:2829:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskDescriptorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTaskDescriptorAccess().getTargetsAreaObjectCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FOLLOW_49); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskDescriptorAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2849:3: (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBehaviourLanguage.g:2850:4: otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskDescriptorAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskDescriptorAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:2858:4: ( (lv_properties_11_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2859:5: (lv_properties_11_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2859:5: (lv_properties_11_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2860:6: lv_properties_11_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getTaskDescriptorAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_11_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskDescriptorRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_11_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2877:4: (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2878:5: otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTaskDescriptorAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2882:5: ( (lv_properties_13_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2883:6: (lv_properties_13_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2883:6: (lv_properties_13_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2884:7: lv_properties_13_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskDescriptorAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_13_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskDescriptorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_13_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskDescriptorAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTaskDescriptorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskDescriptor"


    // $ANTLR start "entryRulePropertyKey"
    // InternalBehaviourLanguage.g:2915:1: entryRulePropertyKey returns [EObject current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final EObject entryRulePropertyKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKey = null;


        try {
            // InternalBehaviourLanguage.g:2915:52: (iv_rulePropertyKey= rulePropertyKey EOF )
            // InternalBehaviourLanguage.g:2916:2: iv_rulePropertyKey= rulePropertyKey EOF
            {
             newCompositeNode(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyKey=rulePropertyKey();

            state._fsp--;

             current =iv_rulePropertyKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyKey"


    // $ANTLR start "rulePropertyKey"
    // InternalBehaviourLanguage.g:2922:1: rulePropertyKey returns [EObject current=null] : ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePropertyKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2928:2: ( ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBehaviourLanguage.g:2929:2: ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBehaviourLanguage.g:2929:2: ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2930:3: () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2930:3: ()
            // InternalBehaviourLanguage.g:2931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyKeyAccess().getPropertyKeyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyKeyAccess().getPropertyKeyKeyword_1());
            		
            // InternalBehaviourLanguage.g:2941:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2942:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2942:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:2943:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyKeyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyKeyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyKey"


    // $ANTLR start "entryRuleStringValue"
    // InternalBehaviourLanguage.g:2964:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBehaviourLanguage.g:2964:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBehaviourLanguage.g:2965:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalBehaviourLanguage.g:2971:1: ruleStringValue returns [EObject current=null] : (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2977:2: ( (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalBehaviourLanguage.g:2978:2: (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalBehaviourLanguage.g:2978:2: (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalBehaviourLanguage.g:2979:3: otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringValueAccess().getStringValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getValueKeyword_2());
            		
            // InternalBehaviourLanguage.g:2991:3: ( (lv_value_3_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2992:4: (lv_value_3_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2992:4: (lv_value_3_0= ruleEString )
            // InternalBehaviourLanguage.g:2993:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringValueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleMeasureConversion"
    // InternalBehaviourLanguage.g:3018:1: entryRuleMeasureConversion returns [EObject current=null] : iv_ruleMeasureConversion= ruleMeasureConversion EOF ;
    public final EObject entryRuleMeasureConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureConversion = null;


        try {
            // InternalBehaviourLanguage.g:3018:58: (iv_ruleMeasureConversion= ruleMeasureConversion EOF )
            // InternalBehaviourLanguage.g:3019:2: iv_ruleMeasureConversion= ruleMeasureConversion EOF
            {
             newCompositeNode(grammarAccess.getMeasureConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureConversion=ruleMeasureConversion();

            state._fsp--;

             current =iv_ruleMeasureConversion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasureConversion"


    // $ANTLR start "ruleMeasureConversion"
    // InternalBehaviourLanguage.g:3025:1: ruleMeasureConversion returns [EObject current=null] : (otherlv_0= 'MeasureConversion' otherlv_1= '{' (otherlv_2= 'rate' ( (lv_rate_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleMeasureConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_rate_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3031:2: ( (otherlv_0= 'MeasureConversion' otherlv_1= '{' (otherlv_2= 'rate' ( (lv_rate_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:3032:2: (otherlv_0= 'MeasureConversion' otherlv_1= '{' (otherlv_2= 'rate' ( (lv_rate_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:3032:2: (otherlv_0= 'MeasureConversion' otherlv_1= '{' (otherlv_2= 'rate' ( (lv_rate_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalBehaviourLanguage.g:3033:3: otherlv_0= 'MeasureConversion' otherlv_1= '{' (otherlv_2= 'rate' ( (lv_rate_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureConversionAccess().getMeasureConversionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureConversionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:3041:3: (otherlv_2= 'rate' ( (lv_rate_3_0= ruleEFloat ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==84) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBehaviourLanguage.g:3042:4: otherlv_2= 'rate' ( (lv_rate_3_0= ruleEFloat ) )
                    {
                    otherlv_2=(Token)match(input,84,FOLLOW_66); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureConversionAccess().getRateKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:3046:4: ( (lv_rate_3_0= ruleEFloat ) )
                    // InternalBehaviourLanguage.g:3047:5: (lv_rate_3_0= ruleEFloat )
                    {
                    // InternalBehaviourLanguage.g:3047:5: (lv_rate_3_0= ruleEFloat )
                    // InternalBehaviourLanguage.g:3048:6: lv_rate_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getMeasureConversionAccess().getRateEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_rate_3_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureConversionRule());
                    						}
                    						set(
                    							current,
                    							"rate",
                    							lv_rate_3_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,68,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureConversionAccess().getDimensionKeyword_3());
            		
            // InternalBehaviourLanguage.g:3070:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3071:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3071:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3072:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureConversionAccess().getDimensionMeasureDimensionCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMeasureConversionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasureConversion"


    // $ANTLR start "entryRuleMessage"
    // InternalBehaviourLanguage.g:3094:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBehaviourLanguage.g:3094:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBehaviourLanguage.g:3095:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalBehaviourLanguage.g:3101:1: ruleMessage returns [EObject current=null] : ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_needResponse_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_5_0 = null;

        EObject lv_properties_22_0 = null;

        EObject lv_properties_24_0 = null;

        EObject lv_TTL_27_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3107:2: ( ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' ) )
            // InternalBehaviourLanguage.g:3108:2: ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' )
            {
            // InternalBehaviourLanguage.g:3108:2: ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' )
            // InternalBehaviourLanguage.g:3109:3: ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}'
            {
            // InternalBehaviourLanguage.g:3109:3: ( (lv_needResponse_0_0= 'needResponse' ) )
            // InternalBehaviourLanguage.g:3110:4: (lv_needResponse_0_0= 'needResponse' )
            {
            // InternalBehaviourLanguage.g:3110:4: (lv_needResponse_0_0= 'needResponse' )
            // InternalBehaviourLanguage.g:3111:5: lv_needResponse_0_0= 'needResponse'
            {
            lv_needResponse_0_0=(Token)match(input,85,FOLLOW_78); 

            					newLeafNode(lv_needResponse_0_0, grammarAccess.getMessageAccess().getNeedResponseNeedResponseKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(current, "needResponse", true, "needResponse");
            				

            }


            }

            otherlv_1=(Token)match(input,86,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getMessageKeyword_1());
            		
            // InternalBehaviourLanguage.g:3127:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:3128:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:3128:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:3129:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:3150:3: (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==87) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBehaviourLanguage.g:3151:4: otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) )
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_80); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getTimestampKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:3155:4: ( (lv_timestamp_5_0= ruleEDate ) )
                    // InternalBehaviourLanguage.g:3156:5: (lv_timestamp_5_0= ruleEDate )
                    {
                    // InternalBehaviourLanguage.g:3156:5: (lv_timestamp_5_0= ruleEDate )
                    // InternalBehaviourLanguage.g:3157:6: lv_timestamp_5_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getTimestampEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_timestamp_5_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_5_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:3175:3: (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==88) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBehaviourLanguage.g:3176:4: otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,88,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:3184:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:3185:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:3185:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:3186:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:3200:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==14) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:3201:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:3205:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:3206:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:3206:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:3207:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMessageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,24,FOLLOW_82); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:3227:3: (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==89) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBehaviourLanguage.g:3228:4: otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,89,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getReferredObjectsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalBehaviourLanguage.g:3236:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:3237:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:3237:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:3238:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:3252:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==14) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:3253:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:3257:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:3258:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:3258:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:3259:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMessageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,24,FOLLOW_83); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:3279:3: (otherlv_18= 'follows' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==90) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBehaviourLanguage.g:3280:4: otherlv_18= 'follows' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,90,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getFollowsKeyword_7_0());
                    			
                    // InternalBehaviourLanguage.g:3284:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:3285:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:3285:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:3286:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getFollowsMessageCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:3301:3: (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==39) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalBehaviourLanguage.g:3302:4: otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getPropertiesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:3310:4: ( (lv_properties_22_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:3311:5: (lv_properties_22_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:3311:5: (lv_properties_22_0= ruleProperty )
                    // InternalBehaviourLanguage.g:3312:6: lv_properties_22_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getPropertiesPropertyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_22_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_22_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:3329:4: (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:3330:5: otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:3334:5: ( (lv_properties_24_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:3335:6: (lv_properties_24_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:3335:6: (lv_properties_24_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:3336:7: lv_properties_24_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getPropertiesPropertyParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_24_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_24_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_85); 

                    				newLeafNode(otherlv_25, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:3359:3: (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==91) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalBehaviourLanguage.g:3360:4: otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) )
                    {
                    otherlv_26=(Token)match(input,91,FOLLOW_34); 

                    				newLeafNode(otherlv_26, grammarAccess.getMessageAccess().getTTLKeyword_9_0());
                    			
                    // InternalBehaviourLanguage.g:3364:4: ( (lv_TTL_27_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:3365:5: (lv_TTL_27_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:3365:5: (lv_TTL_27_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:3366:6: lv_TTL_27_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getTTLMeasureValueParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_TTL_27_0=ruleMeasureValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						set(
                    							current,
                    							"TTL",
                    							lv_TTL_27_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleEDate"
    // InternalBehaviourLanguage.g:3392:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalBehaviourLanguage.g:3392:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalBehaviourLanguage.g:3393:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalBehaviourLanguage.g:3399:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3405:2: (kw= 'EDate' )
            // InternalBehaviourLanguage.g:3406:2: kw= 'EDate'
            {
            kw=(Token)match(input,92,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleUnicastCommunication"
    // InternalBehaviourLanguage.g:3414:1: entryRuleUnicastCommunication returns [EObject current=null] : iv_ruleUnicastCommunication= ruleUnicastCommunication EOF ;
    public final EObject entryRuleUnicastCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnicastCommunication = null;


        try {
            // InternalBehaviourLanguage.g:3414:61: (iv_ruleUnicastCommunication= ruleUnicastCommunication EOF )
            // InternalBehaviourLanguage.g:3415:2: iv_ruleUnicastCommunication= ruleUnicastCommunication EOF
            {
             newCompositeNode(grammarAccess.getUnicastCommunicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnicastCommunication=ruleUnicastCommunication();

            state._fsp--;

             current =iv_ruleUnicastCommunication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnicastCommunication"


    // $ANTLR start "ruleUnicastCommunication"
    // InternalBehaviourLanguage.g:3421:1: ruleUnicastCommunication returns [EObject current=null] : (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleUnicastCommunication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_properties_13_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3427:2: ( (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalBehaviourLanguage.g:3428:2: (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalBehaviourLanguage.g:3428:2: (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalBehaviourLanguage.g:3429:3: otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getUnicastCommunicationAccess().getUnicastCommunicationKeyword_0());
            		
            // InternalBehaviourLanguage.g:3433:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:3434:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:3434:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:3435:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnicastCommunicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getUnicastCommunicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:3456:3: (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==51) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBehaviourLanguage.g:3457:4: otherlv_3= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnicastCommunicationAccess().getCurrentTaskExecutionKeyword_3_0());
                    			
                    // InternalBehaviourLanguage.g:3461:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:3462:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:3462:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:3463:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnicastCommunicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getCurrentTaskExecutionTaskExecutionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getUnicastCommunicationAccess().getMessageKeyword_4());
            		
            // InternalBehaviourLanguage.g:3482:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3483:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3483:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3484:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnicastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getMessageMessageCrossReference_5_0());
            				
            pushFollow(FOLLOW_88);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,95,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getUnicastCommunicationAccess().getTargetKeyword_6());
            		
            // InternalBehaviourLanguage.g:3502:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3503:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3503:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3504:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnicastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getTargetDynamicRobotCrossReference_7_0());
            				
            pushFollow(FOLLOW_49);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:3518:3: (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==39) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalBehaviourLanguage.g:3519:4: otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnicastCommunicationAccess().getPropertiesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnicastCommunicationAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:3527:4: ( (lv_properties_11_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:3528:5: (lv_properties_11_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:3528:5: (lv_properties_11_0= ruleProperty )
                    // InternalBehaviourLanguage.g:3529:6: lv_properties_11_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getPropertiesPropertyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_11_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnicastCommunicationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_11_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:3546:4: (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==14) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:3547:5: otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getUnicastCommunicationAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:3551:5: ( (lv_properties_13_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:3552:6: (lv_properties_13_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:3552:6: (lv_properties_13_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:3553:7: lv_properties_13_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getPropertiesPropertyParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_13_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnicastCommunicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_13_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getUnicastCommunicationAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getUnicastCommunicationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnicastCommunication"


    // $ANTLR start "entryRuleMulticastCommunication"
    // InternalBehaviourLanguage.g:3584:1: entryRuleMulticastCommunication returns [EObject current=null] : iv_ruleMulticastCommunication= ruleMulticastCommunication EOF ;
    public final EObject entryRuleMulticastCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulticastCommunication = null;


        try {
            // InternalBehaviourLanguage.g:3584:63: (iv_ruleMulticastCommunication= ruleMulticastCommunication EOF )
            // InternalBehaviourLanguage.g:3585:2: iv_ruleMulticastCommunication= ruleMulticastCommunication EOF
            {
             newCompositeNode(grammarAccess.getMulticastCommunicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulticastCommunication=ruleMulticastCommunication();

            state._fsp--;

             current =iv_ruleMulticastCommunication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulticastCommunication"


    // $ANTLR start "ruleMulticastCommunication"
    // InternalBehaviourLanguage.g:3591:1: ruleMulticastCommunication returns [EObject current=null] : (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleMulticastCommunication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_15_0 = null;

        EObject lv_properties_17_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3597:2: ( (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalBehaviourLanguage.g:3598:2: (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalBehaviourLanguage.g:3598:2: (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalBehaviourLanguage.g:3599:3: otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMulticastCommunicationAccess().getMulticastCommunicationKeyword_0());
            		
            // InternalBehaviourLanguage.g:3603:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:3604:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:3604:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:3605:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMulticastCommunicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getMulticastCommunicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:3626:3: (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==51) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalBehaviourLanguage.g:3627:4: otherlv_3= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getMulticastCommunicationAccess().getCurrentTaskExecutionKeyword_3_0());
                    			
                    // InternalBehaviourLanguage.g:3631:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:3632:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:3632:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:3633:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMulticastCommunicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getCurrentTaskExecutionTaskExecutionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getMulticastCommunicationAccess().getMessageKeyword_4());
            		
            // InternalBehaviourLanguage.g:3652:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3653:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3653:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3654:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMulticastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getMessageMessageCrossReference_5_0());
            				
            pushFollow(FOLLOW_89);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,80,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getMulticastCommunicationAccess().getTargetsKeyword_6());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getMulticastCommunicationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalBehaviourLanguage.g:3676:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3677:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3677:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3678:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMulticastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getTargetsDynamicRobotCrossReference_8_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:3692:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==14) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:3693:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FOLLOW_14); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMulticastCommunicationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalBehaviourLanguage.g:3697:4: ( ( ruleEString ) )
            	    // InternalBehaviourLanguage.g:3698:5: ( ruleEString )
            	    {
            	    // InternalBehaviourLanguage.g:3698:5: ( ruleEString )
            	    // InternalBehaviourLanguage.g:3699:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMulticastCommunicationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getTargetsDynamicRobotCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_49); 

            			newLeafNode(otherlv_12, grammarAccess.getMulticastCommunicationAccess().getRightParenthesisKeyword_10());
            		
            // InternalBehaviourLanguage.g:3718:3: (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==39) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalBehaviourLanguage.g:3719:4: otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getMulticastCommunicationAccess().getPropertiesKeyword_11_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_14, grammarAccess.getMulticastCommunicationAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalBehaviourLanguage.g:3727:4: ( (lv_properties_15_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:3728:5: (lv_properties_15_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:3728:5: (lv_properties_15_0= ruleProperty )
                    // InternalBehaviourLanguage.g:3729:6: lv_properties_15_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_15_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMulticastCommunicationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_15_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:3746:4: (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==14) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:3747:5: otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getMulticastCommunicationAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:3751:5: ( (lv_properties_17_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:3752:6: (lv_properties_17_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:3752:6: (lv_properties_17_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:3753:7: lv_properties_17_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_17_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMulticastCommunicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_17_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getMulticastCommunicationAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMulticastCommunicationAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulticastCommunication"


    // $ANTLR start "entryRuleBroadcastCommunication"
    // InternalBehaviourLanguage.g:3784:1: entryRuleBroadcastCommunication returns [EObject current=null] : iv_ruleBroadcastCommunication= ruleBroadcastCommunication EOF ;
    public final EObject entryRuleBroadcastCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastCommunication = null;


        try {
            // InternalBehaviourLanguage.g:3784:63: (iv_ruleBroadcastCommunication= ruleBroadcastCommunication EOF )
            // InternalBehaviourLanguage.g:3785:2: iv_ruleBroadcastCommunication= ruleBroadcastCommunication EOF
            {
             newCompositeNode(grammarAccess.getBroadcastCommunicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBroadcastCommunication=ruleBroadcastCommunication();

            state._fsp--;

             current =iv_ruleBroadcastCommunication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBroadcastCommunication"


    // $ANTLR start "ruleBroadcastCommunication"
    // InternalBehaviourLanguage.g:3791:1: ruleBroadcastCommunication returns [EObject current=null] : (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleBroadcastCommunication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_15_0 = null;

        EObject lv_properties_17_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3797:2: ( (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalBehaviourLanguage.g:3798:2: (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalBehaviourLanguage.g:3798:2: (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalBehaviourLanguage.g:3799:3: otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getBroadcastCommunicationAccess().getBroadcastCommunicationKeyword_0());
            		
            // InternalBehaviourLanguage.g:3803:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:3804:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:3804:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:3805:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBroadcastCommunicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getBroadcastCommunicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:3826:3: (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==51) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalBehaviourLanguage.g:3827:4: otherlv_3= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getBroadcastCommunicationAccess().getCurrentTaskExecutionKeyword_3_0());
                    			
                    // InternalBehaviourLanguage.g:3831:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:3832:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:3832:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:3833:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getCurrentTaskExecutionTaskExecutionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getBroadcastCommunicationAccess().getMessageKeyword_4());
            		
            // InternalBehaviourLanguage.g:3852:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3853:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3853:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3854:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getMessageMessageCrossReference_5_0());
            				
            pushFollow(FOLLOW_89);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,80,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getBroadcastCommunicationAccess().getTargetsKeyword_6());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getBroadcastCommunicationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalBehaviourLanguage.g:3876:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3877:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3877:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3878:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getTargetsDynamicRobotCrossReference_8_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:3892:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==14) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:3893:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FOLLOW_14); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBroadcastCommunicationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalBehaviourLanguage.g:3897:4: ( ( ruleEString ) )
            	    // InternalBehaviourLanguage.g:3898:5: ( ruleEString )
            	    {
            	    // InternalBehaviourLanguage.g:3898:5: ( ruleEString )
            	    // InternalBehaviourLanguage.g:3899:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getTargetsDynamicRobotCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_49); 

            			newLeafNode(otherlv_12, grammarAccess.getBroadcastCommunicationAccess().getRightParenthesisKeyword_10());
            		
            // InternalBehaviourLanguage.g:3918:3: (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==39) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalBehaviourLanguage.g:3919:4: otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getBroadcastCommunicationAccess().getPropertiesKeyword_11_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_14, grammarAccess.getBroadcastCommunicationAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalBehaviourLanguage.g:3927:4: ( (lv_properties_15_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:3928:5: (lv_properties_15_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:3928:5: (lv_properties_15_0= ruleProperty )
                    // InternalBehaviourLanguage.g:3929:6: lv_properties_15_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_properties_15_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBroadcastCommunicationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_15_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:3946:4: (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==14) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:3947:5: otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBroadcastCommunicationAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:3951:5: ( (lv_properties_17_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:3952:6: (lv_properties_17_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:3952:6: (lv_properties_17_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:3953:7: lv_properties_17_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_properties_17_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBroadcastCommunicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_17_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getBroadcastCommunicationAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getBroadcastCommunicationAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBroadcastCommunication"


    // $ANTLR start "entryRuleEInt"
    // InternalBehaviourLanguage.g:3984:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBehaviourLanguage.g:3984:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBehaviourLanguage.g:3985:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBehaviourLanguage.g:3991:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3997:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBehaviourLanguage.g:3998:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBehaviourLanguage.g:3998:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBehaviourLanguage.g:3999:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBehaviourLanguage.g:3999:3: (kw= '-' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==75) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalBehaviourLanguage.g:4000:4: kw= '-'
                    {
                    kw=(Token)match(input,75,FOLLOW_74); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleRobotStatus"
    // InternalBehaviourLanguage.g:4017:1: ruleRobotStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) ) ;
    public final Enumerator ruleRobotStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:4023:2: ( ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) ) )
            // InternalBehaviourLanguage.g:4024:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) )
            {
            // InternalBehaviourLanguage.g:4024:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) )
            int alt84=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt84=1;
                }
                break;
            case 99:
                {
                alt84=2;
                }
                break;
            case 100:
                {
                alt84=3;
                }
                break;
            case 101:
                {
                alt84=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalBehaviourLanguage.g:4025:3: (enumLiteral_0= 'Ready' )
                    {
                    // InternalBehaviourLanguage.g:4025:3: (enumLiteral_0= 'Ready' )
                    // InternalBehaviourLanguage.g:4026:4: enumLiteral_0= 'Ready'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:4033:3: (enumLiteral_1= 'TurnedOff' )
                    {
                    // InternalBehaviourLanguage.g:4033:3: (enumLiteral_1= 'TurnedOff' )
                    // InternalBehaviourLanguage.g:4034:4: enumLiteral_1= 'TurnedOff'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:4041:3: (enumLiteral_2= 'Waiting' )
                    {
                    // InternalBehaviourLanguage.g:4041:3: (enumLiteral_2= 'Waiting' )
                    // InternalBehaviourLanguage.g:4042:4: enumLiteral_2= 'Waiting'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:4049:3: (enumLiteral_3= 'Executing' )
                    {
                    // InternalBehaviourLanguage.g:4049:3: (enumLiteral_3= 'Executing' )
                    // InternalBehaviourLanguage.g:4050:4: enumLiteral_3= 'Executing'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getExecutingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRobotStatusAccess().getExecutingEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobotStatus"


    // $ANTLR start "ruleTaskExecutionStatus"
    // InternalBehaviourLanguage.g:4060:1: ruleTaskExecutionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) ;
    public final Enumerator ruleTaskExecutionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:4066:2: ( ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) )
            // InternalBehaviourLanguage.g:4067:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            {
            // InternalBehaviourLanguage.g:4067:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            int alt85=5;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt85=1;
                }
                break;
            case 102:
                {
                alt85=2;
                }
                break;
            case 103:
                {
                alt85=3;
                }
                break;
            case 104:
                {
                alt85=4;
                }
                break;
            case 100:
                {
                alt85=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalBehaviourLanguage.g:4068:3: (enumLiteral_0= 'Ready' )
                    {
                    // InternalBehaviourLanguage.g:4068:3: (enumLiteral_0= 'Ready' )
                    // InternalBehaviourLanguage.g:4069:4: enumLiteral_0= 'Ready'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:4076:3: (enumLiteral_1= 'Finished' )
                    {
                    // InternalBehaviourLanguage.g:4076:3: (enumLiteral_1= 'Finished' )
                    // InternalBehaviourLanguage.g:4077:4: enumLiteral_1= 'Finished'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:4084:3: (enumLiteral_2= 'Suspended' )
                    {
                    // InternalBehaviourLanguage.g:4084:3: (enumLiteral_2= 'Suspended' )
                    // InternalBehaviourLanguage.g:4085:4: enumLiteral_2= 'Suspended'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:4092:3: (enumLiteral_3= 'InProgress' )
                    {
                    // InternalBehaviourLanguage.g:4092:3: (enumLiteral_3= 'InProgress' )
                    // InternalBehaviourLanguage.g:4093:4: enumLiteral_3= 'InProgress'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:4100:3: (enumLiteral_4= 'Waiting' )
                    {
                    // InternalBehaviourLanguage.g:4100:3: (enumLiteral_4= 'Waiting' )
                    // InternalBehaviourLanguage.g:4101:4: enumLiteral_4= 'Waiting'
                    {
                    enumLiteral_4=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getWaitingEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTaskExecutionStatusAccess().getWaitingEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskExecutionStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001E408000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001E008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000001C008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L,0x0000000320000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x000001D400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000300008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001E000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000001C000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000018000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008008000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020008000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000008000008000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040008L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000008000008000L,0x0000000000010000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100010L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000008000008000L,0x000000000F800000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000008000008000L,0x000000000F000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000008000008000L,0x000000000E000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000008000008000L,0x000000000C000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000008000008000L,0x0000000008000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008000L,0x0000000008000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0008000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}