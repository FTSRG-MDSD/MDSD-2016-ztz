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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'BehaviourContainer'", "'{'", "'dynamicRobots'", "','", "'}'", "'taskExecutions'", "'taskRequirements'", "'behaviourKeysContainer'", "'DynamicRobot'", "'status'", "'robot'", "'executedTasks'", "'('", "')'", "'detectedObjects'", "'collaborations'", "'messageRepository'", "'actions'", "'TaskExecution'", "'executors'", "'task'", "'requirement'", "'executionTime'", "'TaskRequirement'", "'participants'", "'taskExecution'", "'prerequisite'", "'requiredCapabilities'", "'properties'", "'capabilityProperties'", "'BehaviouralPropertyKeyContainer'", "'keys'", "'obstacle'", "'DetectedObject'", "'object'", "'RobotCollaboration'", "'collaborator'", "'MessageRepository'", "'sendedMessages'", "'Action'", "'currentTaskExecution'", "'Property'", "'key'", "'value'", "'MeasureValue'", "'dimension'", "'CapabilityProperties'", "'capability'", "'-'", "'.'", "'E'", "'e'", "'PropertyKey'", "'StringValue'", "'needResponse'", "'Message'", "'timestamp'", "'involvedTaskExecutions'", "'referredObjects'", "'follows'", "'TTL'", "'EDate'", "'UnicastCommunication'", "'message'", "'target'", "'MulticastCommunication'", "'targets'", "'BroadcastCommunication'", "'Ready'", "'TurnedOff'", "'Waiting'", "'Executing'", "'Finished'", "'Suspended'", "'InProgress'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

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
        	return "BehaviourLanguage";
       	}

       	@Override
       	protected BehaviourLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBehaviourLanguage"
    // InternalBehaviourLanguage.g:65:1: entryRuleBehaviourLanguage returns [EObject current=null] : iv_ruleBehaviourLanguage= ruleBehaviourLanguage EOF ;
    public final EObject entryRuleBehaviourLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourLanguage = null;


        try {
            // InternalBehaviourLanguage.g:65:58: (iv_ruleBehaviourLanguage= ruleBehaviourLanguage EOF )
            // InternalBehaviourLanguage.g:66:2: iv_ruleBehaviourLanguage= ruleBehaviourLanguage EOF
            {
             newCompositeNode(grammarAccess.getBehaviourLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourLanguage=ruleBehaviourLanguage();

            state._fsp--;

             current =iv_ruleBehaviourLanguage; 
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
    // $ANTLR end "entryRuleBehaviourLanguage"


    // $ANTLR start "ruleBehaviourLanguage"
    // InternalBehaviourLanguage.g:72:1: ruleBehaviourLanguage returns [EObject current=null] : ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) ) ;
    public final EObject ruleBehaviourLanguage() throws RecognitionException {
        EObject current = null;

        EObject lv_importModel_0_0 = null;

        EObject lv_container_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:78:2: ( ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) ) )
            // InternalBehaviourLanguage.g:79:2: ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) )
            {
            // InternalBehaviourLanguage.g:79:2: ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) )
            // InternalBehaviourLanguage.g:80:3: ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) )
            {
            // InternalBehaviourLanguage.g:80:3: ( (lv_importModel_0_0= ruleImport ) )
            // InternalBehaviourLanguage.g:81:4: (lv_importModel_0_0= ruleImport )
            {
            // InternalBehaviourLanguage.g:81:4: (lv_importModel_0_0= ruleImport )
            // InternalBehaviourLanguage.g:82:5: lv_importModel_0_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getBehaviourLanguageAccess().getImportModelImportParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_importModel_0_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourLanguageRule());
            					}
            					set(
            						current,
            						"importModel",
            						lv_importModel_0_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:99:3: ( (lv_container_1_0= ruleBehaviourContainer ) )
            // InternalBehaviourLanguage.g:100:4: (lv_container_1_0= ruleBehaviourContainer )
            {
            // InternalBehaviourLanguage.g:100:4: (lv_container_1_0= ruleBehaviourContainer )
            // InternalBehaviourLanguage.g:101:5: lv_container_1_0= ruleBehaviourContainer
            {

            					newCompositeNode(grammarAccess.getBehaviourLanguageAccess().getContainerBehaviourContainerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_container_1_0=ruleBehaviourContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourLanguageRule());
            					}
            					set(
            						current,
            						"container",
            						lv_container_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.BehaviourContainer");
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
    // $ANTLR end "ruleBehaviourLanguage"


    // $ANTLR start "entryRuleImport"
    // InternalBehaviourLanguage.g:122:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBehaviourLanguage.g:122:47: (iv_ruleImport= ruleImport EOF )
            // InternalBehaviourLanguage.g:123:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBehaviourLanguage.g:129:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:135:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalBehaviourLanguage.g:136:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalBehaviourLanguage.g:136:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalBehaviourLanguage.g:137:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalBehaviourLanguage.g:141:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalBehaviourLanguage.g:142:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalBehaviourLanguage.g:142:4: (lv_importURI_1_0= RULE_STRING )
            // InternalBehaviourLanguage.g:143:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleBehaviourContainer"
    // InternalBehaviourLanguage.g:163:1: entryRuleBehaviourContainer returns [EObject current=null] : iv_ruleBehaviourContainer= ruleBehaviourContainer EOF ;
    public final EObject entryRuleBehaviourContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourContainer = null;


        try {
            // InternalBehaviourLanguage.g:163:59: (iv_ruleBehaviourContainer= ruleBehaviourContainer EOF )
            // InternalBehaviourLanguage.g:164:2: iv_ruleBehaviourContainer= ruleBehaviourContainer EOF
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
    // InternalBehaviourLanguage.g:170:1: ruleBehaviourContainer returns [EObject current=null] : ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' ) ;
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
            // InternalBehaviourLanguage.g:176:2: ( ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' ) )
            // InternalBehaviourLanguage.g:177:2: ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' )
            {
            // InternalBehaviourLanguage.g:177:2: ( () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' )
            // InternalBehaviourLanguage.g:178:3: () otherlv_1= 'BehaviourContainer' otherlv_2= '{' (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}'
            {
            // InternalBehaviourLanguage.g:178:3: ()
            // InternalBehaviourLanguage.g:179:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourContainerAccess().getBehaviourContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourContainerAccess().getBehaviourContainerKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:193:3: (otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBehaviourLanguage.g:194:4: otherlv_3= 'dynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourContainerAccess().getDynamicRobotsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBehaviourLanguage.g:202:4: ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) )
                    // InternalBehaviourLanguage.g:203:5: (lv_dynamicRobots_5_0= ruleDynamicRobot )
                    {
                    // InternalBehaviourLanguage.g:203:5: (lv_dynamicRobots_5_0= ruleDynamicRobot )
                    // InternalBehaviourLanguage.g:204:6: lv_dynamicRobots_5_0= ruleDynamicRobot
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsDynamicRobotParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:221:4: (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:222:5: otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:226:5: ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) )
                    	    // InternalBehaviourLanguage.g:227:6: (lv_dynamicRobots_7_0= ruleDynamicRobot )
                    	    {
                    	    // InternalBehaviourLanguage.g:227:6: (lv_dynamicRobots_7_0= ruleDynamicRobot )
                    	    // InternalBehaviourLanguage.g:228:7: lv_dynamicRobots_7_0= ruleDynamicRobot
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsDynamicRobotParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:251:3: (otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBehaviourLanguage.g:252:4: otherlv_9= 'taskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviourContainerAccess().getTaskExecutionsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:260:4: ( (lv_taskExecutions_11_0= ruleTaskExecution ) )
                    // InternalBehaviourLanguage.g:261:5: (lv_taskExecutions_11_0= ruleTaskExecution )
                    {
                    // InternalBehaviourLanguage.g:261:5: (lv_taskExecutions_11_0= ruleTaskExecution )
                    // InternalBehaviourLanguage.g:262:6: lv_taskExecutions_11_0= ruleTaskExecution
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsTaskExecutionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:279:4: (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:280:5: otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:284:5: ( (lv_taskExecutions_13_0= ruleTaskExecution ) )
                    	    // InternalBehaviourLanguage.g:285:6: (lv_taskExecutions_13_0= ruleTaskExecution )
                    	    {
                    	    // InternalBehaviourLanguage.g:285:6: (lv_taskExecutions_13_0= ruleTaskExecution )
                    	    // InternalBehaviourLanguage.g:286:7: lv_taskExecutions_13_0= ruleTaskExecution
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsTaskExecutionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:309:3: (otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBehaviourLanguage.g:310:4: otherlv_15= 'taskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getBehaviourContainerAccess().getTaskRequirementsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:318:4: ( (lv_taskRequirements_17_0= ruleTaskRequirement ) )
                    // InternalBehaviourLanguage.g:319:5: (lv_taskRequirements_17_0= ruleTaskRequirement )
                    {
                    // InternalBehaviourLanguage.g:319:5: (lv_taskRequirements_17_0= ruleTaskRequirement )
                    // InternalBehaviourLanguage.g:320:6: lv_taskRequirements_17_0= ruleTaskRequirement
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsTaskRequirementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:337:4: (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:338:5: otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:342:5: ( (lv_taskRequirements_19_0= ruleTaskRequirement ) )
                    	    // InternalBehaviourLanguage.g:343:6: (lv_taskRequirements_19_0= ruleTaskRequirement )
                    	    {
                    	    // InternalBehaviourLanguage.g:343:6: (lv_taskRequirements_19_0= ruleTaskRequirement )
                    	    // InternalBehaviourLanguage.g:344:7: lv_taskRequirements_19_0= ruleTaskRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsTaskRequirementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_20=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:367:3: (otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBehaviourLanguage.g:368:4: otherlv_21= 'behaviourKeysContainer' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) )
                    {
                    otherlv_21=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviourContainerAccess().getBehaviourKeysContainerKeyword_6_0());
                    			
                    // InternalBehaviourLanguage.g:372:4: ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) )
                    // InternalBehaviourLanguage.g:373:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    {
                    // InternalBehaviourLanguage.g:373:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    // InternalBehaviourLanguage.g:374:6: lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getBehaviourKeysContainerBehaviouralPropertyKeyContainerParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_23=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:400:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBehaviourLanguage.g:400:47: (iv_ruleAction= ruleAction EOF )
            // InternalBehaviourLanguage.g:401:2: iv_ruleAction= ruleAction EOF
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
    // InternalBehaviourLanguage.g:407:1: ruleAction returns [EObject current=null] : (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Action_Impl_0 = null;

        EObject this_UnicastCommunication_1 = null;

        EObject this_MulticastCommunication_2 = null;

        EObject this_BroadcastCommunication_3 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:413:2: ( (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication ) )
            // InternalBehaviourLanguage.g:414:2: (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication )
            {
            // InternalBehaviourLanguage.g:414:2: (this_Action_Impl_0= ruleAction_Impl | this_UnicastCommunication_1= ruleUnicastCommunication | this_MulticastCommunication_2= ruleMulticastCommunication | this_BroadcastCommunication_3= ruleBroadcastCommunication )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt8=1;
                }
                break;
            case 74:
                {
                alt8=2;
                }
                break;
            case 77:
                {
                alt8=3;
                }
                break;
            case 79:
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
                    // InternalBehaviourLanguage.g:415:3: this_Action_Impl_0= ruleAction_Impl
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
                    // InternalBehaviourLanguage.g:424:3: this_UnicastCommunication_1= ruleUnicastCommunication
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
                    // InternalBehaviourLanguage.g:433:3: this_MulticastCommunication_2= ruleMulticastCommunication
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
                    // InternalBehaviourLanguage.g:442:3: this_BroadcastCommunication_3= ruleBroadcastCommunication
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
    // InternalBehaviourLanguage.g:454:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalBehaviourLanguage.g:454:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalBehaviourLanguage.g:455:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalBehaviourLanguage.g:461:1: rulePropertyValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_MeasureValue_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:467:2: ( (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:468:2: (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:468:2: (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==65) ) {
                alt9=1;
            }
            else if ( (LA9_0==56) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBehaviourLanguage.g:469:3: this_StringValue_0= ruleStringValue
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
                    // InternalBehaviourLanguage.g:478:3: this_MeasureValue_1= ruleMeasureValue
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
    // InternalBehaviourLanguage.g:490:1: entryRuleDynamicRobot returns [EObject current=null] : iv_ruleDynamicRobot= ruleDynamicRobot EOF ;
    public final EObject entryRuleDynamicRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicRobot = null;


        try {
            // InternalBehaviourLanguage.g:490:53: (iv_ruleDynamicRobot= ruleDynamicRobot EOF )
            // InternalBehaviourLanguage.g:491:2: iv_ruleDynamicRobot= ruleDynamicRobot EOF
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
    // InternalBehaviourLanguage.g:497:1: ruleDynamicRobot returns [EObject current=null] : (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleDynamicRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
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
            // InternalBehaviourLanguage.g:503:2: ( (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalBehaviourLanguage.g:504:2: (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalBehaviourLanguage.g:504:2: (otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalBehaviourLanguage.g:505:3: otherlv_0= 'DynamicRobot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleRobotStatus ) ) otherlv_5= 'robot' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )? (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )? (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )? (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDynamicRobotAccess().getDynamicRobotKeyword_0());
            		
            // InternalBehaviourLanguage.g:509:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:510:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:510:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:511:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDynamicRobotAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDynamicRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getDynamicRobotAccess().getStatusKeyword_3());
            		
            // InternalBehaviourLanguage.g:536:3: ( (lv_status_4_0= ruleRobotStatus ) )
            // InternalBehaviourLanguage.g:537:4: (lv_status_4_0= ruleRobotStatus )
            {
            // InternalBehaviourLanguage.g:537:4: (lv_status_4_0= ruleRobotStatus )
            // InternalBehaviourLanguage.g:538:5: lv_status_4_0= ruleRobotStatus
            {

            					newCompositeNode(grammarAccess.getDynamicRobotAccess().getStatusRobotStatusEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_5=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getDynamicRobotAccess().getRobotKeyword_5());
            		
            // InternalBehaviourLanguage.g:559:3: ( (otherlv_6= RULE_ID ) )
            // InternalBehaviourLanguage.g:560:4: (otherlv_6= RULE_ID )
            {
            // InternalBehaviourLanguage.g:560:4: (otherlv_6= RULE_ID )
            // InternalBehaviourLanguage.g:561:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDynamicRobotRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_6, grammarAccess.getDynamicRobotAccess().getRobotRobotCrossReference_6_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:572:3: (otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBehaviourLanguage.g:573:4: otherlv_7= 'executedTasks' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getDynamicRobotAccess().getExecutedTasksKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getDynamicRobotAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalBehaviourLanguage.g:581:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:582:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:582:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:583:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicRobotRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getExecutedTasksTaskExecutionCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:597:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:598:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDynamicRobotAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:602:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:603:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:603:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:604:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDynamicRobotRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDynamicRobotAccess().getExecutedTasksTaskExecutionCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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

                    otherlv_12=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getDynamicRobotAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:624:3: (otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBehaviourLanguage.g:625:4: otherlv_13= 'detectedObjects' otherlv_14= '{' ( (lv_detectedObjects_15_0= ruleDetectedObject ) ) (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getDynamicRobotAccess().getDetectedObjectsKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getDynamicRobotAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:633:4: ( (lv_detectedObjects_15_0= ruleDetectedObject ) )
                    // InternalBehaviourLanguage.g:634:5: (lv_detectedObjects_15_0= ruleDetectedObject )
                    {
                    // InternalBehaviourLanguage.g:634:5: (lv_detectedObjects_15_0= ruleDetectedObject )
                    // InternalBehaviourLanguage.g:635:6: lv_detectedObjects_15_0= ruleDetectedObject
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getDetectedObjectsDetectedObjectParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:652:4: (otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:653:5: otherlv_16= ',' ( (lv_detectedObjects_17_0= ruleDetectedObject ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_25); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getDynamicRobotAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:657:5: ( (lv_detectedObjects_17_0= ruleDetectedObject ) )
                    	    // InternalBehaviourLanguage.g:658:6: (lv_detectedObjects_17_0= ruleDetectedObject )
                    	    {
                    	    // InternalBehaviourLanguage.g:658:6: (lv_detectedObjects_17_0= ruleDetectedObject )
                    	    // InternalBehaviourLanguage.g:659:7: lv_detectedObjects_17_0= ruleDetectedObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getDynamicRobotAccess().getDetectedObjectsDetectedObjectParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_18=(Token)match(input,16,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getDynamicRobotAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:682:3: (otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBehaviourLanguage.g:683:4: otherlv_19= 'collaborations' ( (lv_collaborations_20_0= ruleRobotCollaboration ) )
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_19, grammarAccess.getDynamicRobotAccess().getCollaborationsKeyword_9_0());
                    			
                    // InternalBehaviourLanguage.g:687:4: ( (lv_collaborations_20_0= ruleRobotCollaboration ) )
                    // InternalBehaviourLanguage.g:688:5: (lv_collaborations_20_0= ruleRobotCollaboration )
                    {
                    // InternalBehaviourLanguage.g:688:5: (lv_collaborations_20_0= ruleRobotCollaboration )
                    // InternalBehaviourLanguage.g:689:6: lv_collaborations_20_0= ruleRobotCollaboration
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getCollaborationsRobotCollaborationParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalBehaviourLanguage.g:707:3: (otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBehaviourLanguage.g:708:4: otherlv_21= 'messageRepository' ( (lv_messageRepository_22_0= ruleMessageRepository ) )
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_21, grammarAccess.getDynamicRobotAccess().getMessageRepositoryKeyword_10_0());
                    			
                    // InternalBehaviourLanguage.g:712:4: ( (lv_messageRepository_22_0= ruleMessageRepository ) )
                    // InternalBehaviourLanguage.g:713:5: (lv_messageRepository_22_0= ruleMessageRepository )
                    {
                    // InternalBehaviourLanguage.g:713:5: (lv_messageRepository_22_0= ruleMessageRepository )
                    // InternalBehaviourLanguage.g:714:6: lv_messageRepository_22_0= ruleMessageRepository
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getMessageRepositoryMessageRepositoryParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalBehaviourLanguage.g:732:3: (otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBehaviourLanguage.g:733:4: otherlv_23= 'actions' otherlv_24= '{' ( (lv_actions_25_0= ruleAction ) ) (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getDynamicRobotAccess().getActionsKeyword_11_0());
                    			
                    otherlv_24=(Token)match(input,13,FOLLOW_31); 

                    				newLeafNode(otherlv_24, grammarAccess.getDynamicRobotAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalBehaviourLanguage.g:741:4: ( (lv_actions_25_0= ruleAction ) )
                    // InternalBehaviourLanguage.g:742:5: (lv_actions_25_0= ruleAction )
                    {
                    // InternalBehaviourLanguage.g:742:5: (lv_actions_25_0= ruleAction )
                    // InternalBehaviourLanguage.g:743:6: lv_actions_25_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getDynamicRobotAccess().getActionsActionParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:760:4: (otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:761:5: otherlv_26= ',' ( (lv_actions_27_0= ruleAction ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FOLLOW_31); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getDynamicRobotAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:765:5: ( (lv_actions_27_0= ruleAction ) )
                    	    // InternalBehaviourLanguage.g:766:6: (lv_actions_27_0= ruleAction )
                    	    {
                    	    // InternalBehaviourLanguage.g:766:6: (lv_actions_27_0= ruleAction )
                    	    // InternalBehaviourLanguage.g:767:7: lv_actions_27_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getDynamicRobotAccess().getActionsActionParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_28=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getDynamicRobotAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:798:1: entryRuleTaskExecution returns [EObject current=null] : iv_ruleTaskExecution= ruleTaskExecution EOF ;
    public final EObject entryRuleTaskExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskExecution = null;


        try {
            // InternalBehaviourLanguage.g:798:54: (iv_ruleTaskExecution= ruleTaskExecution EOF )
            // InternalBehaviourLanguage.g:799:2: iv_ruleTaskExecution= ruleTaskExecution EOF
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
    // InternalBehaviourLanguage.g:805:1: ruleTaskExecution returns [EObject current=null] : (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' ) ;
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
            // InternalBehaviourLanguage.g:811:2: ( (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' ) )
            // InternalBehaviourLanguage.g:812:2: (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' )
            {
            // InternalBehaviourLanguage.g:812:2: (otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}' )
            // InternalBehaviourLanguage.g:813:3: otherlv_0= 'TaskExecution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleTaskExecutionStatus ) ) (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'task' ( ( ruleEString ) ) (otherlv_13= 'requirement' ( ( ruleEString ) ) )? (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskExecutionAccess().getTaskExecutionKeyword_0());
            		
            // InternalBehaviourLanguage.g:817:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:818:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:818:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:819:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskExecutionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskExecutionAccess().getStatusKeyword_3());
            		
            // InternalBehaviourLanguage.g:844:3: ( (lv_status_4_0= ruleTaskExecutionStatus ) )
            // InternalBehaviourLanguage.g:845:4: (lv_status_4_0= ruleTaskExecutionStatus )
            {
            // InternalBehaviourLanguage.g:845:4: (lv_status_4_0= ruleTaskExecutionStatus )
            // InternalBehaviourLanguage.g:846:5: lv_status_4_0= ruleTaskExecutionStatus
            {

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getStatusTaskExecutionStatusEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalBehaviourLanguage.g:863:3: (otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBehaviourLanguage.g:864:4: otherlv_5= 'executors' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskExecutionAccess().getExecutorsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskExecutionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:872:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:873:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:873:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:874:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskExecutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutorsDynamicRobotCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:888:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:889:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTaskExecutionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:893:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:894:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:894:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:895:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskExecutionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutorsDynamicRobotCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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

                    otherlv_10=(Token)match(input,25,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskExecutionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskExecutionAccess().getTaskKeyword_6());
            		
            // InternalBehaviourLanguage.g:919:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:920:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:920:4: ( ruleEString )
            // InternalBehaviourLanguage.g:921:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskExecutionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getTaskTaskCrossReference_7_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:935:3: (otherlv_13= 'requirement' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBehaviourLanguage.g:936:4: otherlv_13= 'requirement' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getTaskExecutionAccess().getRequirementKeyword_8_0());
                    			
                    // InternalBehaviourLanguage.g:940:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:941:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:941:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:942:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskExecutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getRequirementTaskRequirementCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:957:3: (otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBehaviourLanguage.g:958:4: otherlv_15= 'executionTime' ( (lv_executionTime_16_0= ruleMeasureValue ) )
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_37); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskExecutionAccess().getExecutionTimeKeyword_9_0());
                    			
                    // InternalBehaviourLanguage.g:962:4: ( (lv_executionTime_16_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:963:5: (lv_executionTime_16_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:963:5: (lv_executionTime_16_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:964:6: lv_executionTime_16_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutionTimeMeasureValueParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:990:1: entryRuleTaskRequirement returns [EObject current=null] : iv_ruleTaskRequirement= ruleTaskRequirement EOF ;
    public final EObject entryRuleTaskRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequirement = null;


        try {
            // InternalBehaviourLanguage.g:990:56: (iv_ruleTaskRequirement= ruleTaskRequirement EOF )
            // InternalBehaviourLanguage.g:991:2: iv_ruleTaskRequirement= ruleTaskRequirement EOF
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
    // InternalBehaviourLanguage.g:997:1: ruleTaskRequirement returns [EObject current=null] : (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // InternalBehaviourLanguage.g:1003:2: ( (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalBehaviourLanguage.g:1004:2: (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalBehaviourLanguage.g:1004:2: (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalBehaviourLanguage.g:1005:3: otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( ( ruleEString ) ) (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequirementAccess().getTaskRequirementKeyword_0());
            		
            // InternalBehaviourLanguage.g:1009:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1010:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1010:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:1011:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRequirementAccess().getParticipantsKeyword_3());
            		
            // InternalBehaviourLanguage.g:1036:3: ( (lv_participants_4_0= ruleEInt ) )
            // InternalBehaviourLanguage.g:1037:4: (lv_participants_4_0= ruleEInt )
            {
            // InternalBehaviourLanguage.g:1037:4: (lv_participants_4_0= ruleEInt )
            // InternalBehaviourLanguage.g:1038:5: lv_participants_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getParticipantsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_5=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskRequirementAccess().getTaskExecutionKeyword_5());
            		
            // InternalBehaviourLanguage.g:1059:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:1060:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:1060:4: ( ruleEString )
            // InternalBehaviourLanguage.g:1061:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRequirementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getTaskExecutionTaskExecutionCrossReference_6_0());
            				
            pushFollow(FOLLOW_41);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:1075:3: (otherlv_7= 'prerequisite' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBehaviourLanguage.g:1076:4: otherlv_7= 'prerequisite' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskRequirementAccess().getPrerequisiteKeyword_7_0());
                    			
                    // InternalBehaviourLanguage.g:1080:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:1081:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:1081:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:1082:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getPrerequisiteTaskExecutionCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1097:3: (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBehaviourLanguage.g:1098:4: otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskRequirementAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:1106:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:1107:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:1107:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:1108:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1122:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1123:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTaskRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1127:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:1128:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:1128:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:1129:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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

                    otherlv_14=(Token)match(input,25,FOLLOW_43); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskRequirementAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1149:3: (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBehaviourLanguage.g:1150:4: otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskRequirementAccess().getPropertiesKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_16, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBehaviourLanguage.g:1158:4: ( (lv_properties_17_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1159:5: (lv_properties_17_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1159:5: (lv_properties_17_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1160:6: lv_properties_17_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:1177:4: (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1178:5: otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getTaskRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1182:5: ( (lv_properties_19_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1183:6: (lv_properties_19_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1183:6: (lv_properties_19_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1184:7: lv_properties_19_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_20=(Token)match(input,16,FOLLOW_45); 

                    				newLeafNode(otherlv_20, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1207:3: (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBehaviourLanguage.g:1208:4: otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,13,FOLLOW_46); 

                    				newLeafNode(otherlv_22, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBehaviourLanguage.g:1216:4: ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) )
                    // InternalBehaviourLanguage.g:1217:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    {
                    // InternalBehaviourLanguage.g:1217:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    // InternalBehaviourLanguage.g:1218:6: lv_capabilityProperties_23_0= ruleCapabilityProperties
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:1235:4: (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1236:5: otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_46); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getTaskRequirementAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1240:5: ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    // InternalBehaviourLanguage.g:1241:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    {
                    	    // InternalBehaviourLanguage.g:1241:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    // InternalBehaviourLanguage.g:1242:7: lv_capabilityProperties_25_0= ruleCapabilityProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_26=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_26, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1273:1: entryRuleBehaviouralPropertyKeyContainer returns [EObject current=null] : iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF ;
    public final EObject entryRuleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralPropertyKeyContainer = null;


        try {
            // InternalBehaviourLanguage.g:1273:72: (iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF )
            // InternalBehaviourLanguage.g:1274:2: iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF
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
    // InternalBehaviourLanguage.g:1280:1: ruleBehaviouralPropertyKeyContainer returns [EObject current=null] : ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalBehaviourLanguage.g:1286:2: ( ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:1287:2: ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:1287:2: ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:1288:3: () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalBehaviourLanguage.g:1288:3: ()
            // InternalBehaviourLanguage.g:1289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerKeyword_1());
            		
            // InternalBehaviourLanguage.g:1299:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1300:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1300:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:1301:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1322:3: (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBehaviourLanguage.g:1323:4: otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_48); 

                    				newLeafNode(otherlv_5, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1331:4: ( (lv_keys_6_0= rulePropertyKey ) )
                    // InternalBehaviourLanguage.g:1332:5: (lv_keys_6_0= rulePropertyKey )
                    {
                    // InternalBehaviourLanguage.g:1332:5: (lv_keys_6_0= rulePropertyKey )
                    // InternalBehaviourLanguage.g:1333:6: lv_keys_6_0= rulePropertyKey
                    {

                    						newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:1350:4: (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1351:5: otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_48); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1355:5: ( (lv_keys_8_0= rulePropertyKey ) )
                    	    // InternalBehaviourLanguage.g:1356:6: (lv_keys_8_0= rulePropertyKey )
                    	    {
                    	    // InternalBehaviourLanguage.g:1356:6: (lv_keys_8_0= rulePropertyKey )
                    	    // InternalBehaviourLanguage.g:1357:7: lv_keys_8_0= rulePropertyKey
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_9=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1388:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBehaviourLanguage.g:1388:47: (iv_ruleEString= ruleEString EOF )
            // InternalBehaviourLanguage.g:1389:2: iv_ruleEString= ruleEString EOF
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
    // InternalBehaviourLanguage.g:1395:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1401:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1402:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1402:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalBehaviourLanguage.g:1403:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1411:3: this_ID_1= RULE_ID
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
    // InternalBehaviourLanguage.g:1422:1: entryRuleDetectedObject returns [EObject current=null] : iv_ruleDetectedObject= ruleDetectedObject EOF ;
    public final EObject entryRuleDetectedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectedObject = null;


        try {
            // InternalBehaviourLanguage.g:1422:55: (iv_ruleDetectedObject= ruleDetectedObject EOF )
            // InternalBehaviourLanguage.g:1423:2: iv_ruleDetectedObject= ruleDetectedObject EOF
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
    // InternalBehaviourLanguage.g:1429:1: ruleDetectedObject returns [EObject current=null] : ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleDetectedObject() throws RecognitionException {
        EObject current = null;

        Token lv_obstacle_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1435:2: ( ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalBehaviourLanguage.g:1436:2: ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalBehaviourLanguage.g:1436:2: ( ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalBehaviourLanguage.g:1437:3: ( (lv_obstacle_0_0= 'obstacle' ) )? otherlv_1= 'DetectedObject' otherlv_2= '{' otherlv_3= 'object' ( ( ruleEString ) ) otherlv_5= '}'
            {
            // InternalBehaviourLanguage.g:1437:3: ( (lv_obstacle_0_0= 'obstacle' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBehaviourLanguage.g:1438:4: (lv_obstacle_0_0= 'obstacle' )
                    {
                    // InternalBehaviourLanguage.g:1438:4: (lv_obstacle_0_0= 'obstacle' )
                    // InternalBehaviourLanguage.g:1439:5: lv_obstacle_0_0= 'obstacle'
                    {
                    lv_obstacle_0_0=(Token)match(input,44,FOLLOW_49); 

                    					newLeafNode(lv_obstacle_0_0, grammarAccess.getDetectedObjectAccess().getObstacleObstacleKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDetectedObjectRule());
                    					}
                    					setWithLastConsumed(current, "obstacle", true, "obstacle");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDetectedObjectAccess().getDetectedObjectKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getDetectedObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDetectedObjectAccess().getObjectKeyword_3());
            		
            // InternalBehaviourLanguage.g:1463:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:1464:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:1464:4: ( ruleEString )
            // InternalBehaviourLanguage.g:1465:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectedObjectRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDetectedObjectAccess().getObjectAreaObjectCrossReference_4_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1487:1: entryRuleRobotCollaboration returns [EObject current=null] : iv_ruleRobotCollaboration= ruleRobotCollaboration EOF ;
    public final EObject entryRuleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotCollaboration = null;


        try {
            // InternalBehaviourLanguage.g:1487:59: (iv_ruleRobotCollaboration= ruleRobotCollaboration EOF )
            // InternalBehaviourLanguage.g:1488:2: iv_ruleRobotCollaboration= ruleRobotCollaboration EOF
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
    // InternalBehaviourLanguage.g:1494:1: ruleRobotCollaboration returns [EObject current=null] : (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalBehaviourLanguage.g:1500:2: ( (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:1501:2: (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:1501:2: (otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:1502:3: otherlv_0= 'RobotCollaboration' otherlv_1= '{' otherlv_2= 'collaborator' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotCollaborationAccess().getRobotCollaborationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotCollaborationAccess().getCollaboratorKeyword_2());
            		
            // InternalBehaviourLanguage.g:1514:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:1515:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:1515:4: ( ruleEString )
            // InternalBehaviourLanguage.g:1516:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotCollaborationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRobotCollaborationAccess().getCollaboratorDynamicRobotCrossReference_3_0());
            				
            pushFollow(FOLLOW_52);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:1530:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBehaviourLanguage.g:1531:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotCollaborationAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1539:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1540:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1540:5: (lv_properties_6_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1541:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:1558:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1559:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRobotCollaborationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1563:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1564:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1564:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1565:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_9=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobotCollaborationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1596:1: entryRuleMessageRepository returns [EObject current=null] : iv_ruleMessageRepository= ruleMessageRepository EOF ;
    public final EObject entryRuleMessageRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageRepository = null;


        try {
            // InternalBehaviourLanguage.g:1596:58: (iv_ruleMessageRepository= ruleMessageRepository EOF )
            // InternalBehaviourLanguage.g:1597:2: iv_ruleMessageRepository= ruleMessageRepository EOF
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
    // InternalBehaviourLanguage.g:1603:1: ruleMessageRepository returns [EObject current=null] : ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalBehaviourLanguage.g:1609:2: ( ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:1610:2: ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:1610:2: ( () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:1611:3: () otherlv_1= 'MessageRepository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalBehaviourLanguage.g:1611:3: ()
            // InternalBehaviourLanguage.g:1612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageRepositoryAccess().getMessageRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageRepositoryAccess().getMessageRepositoryKeyword_1());
            		
            // InternalBehaviourLanguage.g:1622:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1623:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1623:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:1624:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageRepositoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1645:3: (otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBehaviourLanguage.g:1646:4: otherlv_4= 'sendedMessages' otherlv_5= '{' ( (lv_sendedMessages_6_0= ruleMessage ) ) (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageRepositoryAccess().getSendedMessagesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1654:4: ( (lv_sendedMessages_6_0= ruleMessage ) )
                    // InternalBehaviourLanguage.g:1655:5: (lv_sendedMessages_6_0= ruleMessage )
                    {
                    // InternalBehaviourLanguage.g:1655:5: (lv_sendedMessages_6_0= ruleMessage )
                    // InternalBehaviourLanguage.g:1656:6: lv_sendedMessages_6_0= ruleMessage
                    {

                    						newCompositeNode(grammarAccess.getMessageRepositoryAccess().getSendedMessagesMessageParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:1673:4: (otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1674:5: otherlv_7= ',' ( (lv_sendedMessages_8_0= ruleMessage ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_54); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMessageRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1678:5: ( (lv_sendedMessages_8_0= ruleMessage ) )
                    	    // InternalBehaviourLanguage.g:1679:6: (lv_sendedMessages_8_0= ruleMessage )
                    	    {
                    	    // InternalBehaviourLanguage.g:1679:6: (lv_sendedMessages_8_0= ruleMessage )
                    	    // InternalBehaviourLanguage.g:1680:7: lv_sendedMessages_8_0= ruleMessage
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageRepositoryAccess().getSendedMessagesMessageParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_9=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getMessageRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1711:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalBehaviourLanguage.g:1711:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalBehaviourLanguage.g:1712:2: iv_ruleAction_Impl= ruleAction_Impl EOF
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
    // InternalBehaviourLanguage.g:1718:1: ruleAction_Impl returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalBehaviourLanguage.g:1724:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalBehaviourLanguage.g:1725:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalBehaviourLanguage.g:1725:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalBehaviourLanguage.g:1726:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalBehaviourLanguage.g:1726:3: ()
            // InternalBehaviourLanguage.g:1727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAction_ImplAccess().getActionKeyword_1());
            		
            // InternalBehaviourLanguage.g:1737:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1738:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1738:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:1739:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAction_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1760:3: (otherlv_4= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBehaviourLanguage.g:1761:4: otherlv_4= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getCurrentTaskExecutionKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:1765:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:1766:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:1766:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:1767:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getCurrentTaskExecutionTaskExecutionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1782:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBehaviourLanguage.g:1783:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAction_ImplAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:1791:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1792:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1792:5: (lv_properties_8_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1793:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:1810:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==15) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1811:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAction_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1815:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1816:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1816:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1817:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getAction_ImplAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_11=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleProperty"
    // InternalBehaviourLanguage.g:1848:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBehaviourLanguage.g:1848:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBehaviourLanguage.g:1849:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalBehaviourLanguage.g:1855:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' ) ;
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
            // InternalBehaviourLanguage.g:1861:2: ( (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:1862:2: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:1862:2: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' )
            // InternalBehaviourLanguage.g:1863:3: otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getKeyKeyword_2());
            		
            // InternalBehaviourLanguage.g:1875:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:1876:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:1876:4: ( ruleEString )
            // InternalBehaviourLanguage.g:1877:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getKeyPropertyKeyCrossReference_3_0());
            				
            pushFollow(FOLLOW_57);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_58); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getValueKeyword_4());
            		
            // InternalBehaviourLanguage.g:1895:3: ( (lv_value_5_0= rulePropertyValue ) )
            // InternalBehaviourLanguage.g:1896:4: (lv_value_5_0= rulePropertyValue )
            {
            // InternalBehaviourLanguage.g:1896:4: (lv_value_5_0= rulePropertyValue )
            // InternalBehaviourLanguage.g:1897:5: lv_value_5_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1922:1: entryRuleMeasureValue returns [EObject current=null] : iv_ruleMeasureValue= ruleMeasureValue EOF ;
    public final EObject entryRuleMeasureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue = null;


        try {
            // InternalBehaviourLanguage.g:1922:53: (iv_ruleMeasureValue= ruleMeasureValue EOF )
            // InternalBehaviourLanguage.g:1923:2: iv_ruleMeasureValue= ruleMeasureValue EOF
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
    // InternalBehaviourLanguage.g:1929:1: ruleMeasureValue returns [EObject current=null] : (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalBehaviourLanguage.g:1935:2: ( (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:1936:2: (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:1936:2: (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalBehaviourLanguage.g:1937:3: otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureValueAccess().getMeasureValueKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:1945:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==55) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBehaviourLanguage.g:1946:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) )
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_60); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureValueAccess().getValueKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:1950:4: ( (lv_value_3_0= ruleEFloat ) )
                    // InternalBehaviourLanguage.g:1951:5: (lv_value_3_0= ruleEFloat )
                    {
                    // InternalBehaviourLanguage.g:1951:5: (lv_value_3_0= ruleEFloat )
                    // InternalBehaviourLanguage.g:1952:6: lv_value_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getMeasureValueAccess().getValueEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            otherlv_4=(Token)match(input,57,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureValueAccess().getDimensionKeyword_3());
            		
            // InternalBehaviourLanguage.g:1974:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:1975:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:1975:4: ( ruleEString )
            // InternalBehaviourLanguage.g:1976:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureValueAccess().getDimensionMeasureDimensionCrossReference_4_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1998:1: entryRuleCapabilityProperties returns [EObject current=null] : iv_ruleCapabilityProperties= ruleCapabilityProperties EOF ;
    public final EObject entryRuleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperties = null;


        try {
            // InternalBehaviourLanguage.g:1998:61: (iv_ruleCapabilityProperties= ruleCapabilityProperties EOF )
            // InternalBehaviourLanguage.g:1999:2: iv_ruleCapabilityProperties= ruleCapabilityProperties EOF
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
    // InternalBehaviourLanguage.g:2005:1: ruleCapabilityProperties returns [EObject current=null] : (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalBehaviourLanguage.g:2011:2: ( (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:2012:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:2012:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:2013:3: otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( ( ruleEString ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertiesAccess().getCapabilityPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertiesAccess().getCapabilityKeyword_2());
            		
            // InternalBehaviourLanguage.g:2025:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2026:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2026:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2027:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityPropertiesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getCapabilityCapabilityCrossReference_3_0());
            				
            pushFollow(FOLLOW_52);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:2041:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBehaviourLanguage.g:2042:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertiesAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:2050:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2051:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2051:5: (lv_properties_6_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2052:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:2069:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2070:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCapabilityPropertiesAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2074:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2075:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2075:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2076:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getCapabilityPropertiesAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEFloat"
    // InternalBehaviourLanguage.g:2107:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBehaviourLanguage.g:2107:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBehaviourLanguage.g:2108:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBehaviourLanguage.g:2114:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2120:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBehaviourLanguage.g:2121:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBehaviourLanguage.g:2121:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBehaviourLanguage.g:2122:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBehaviourLanguage.g:2122:3: (kw= '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBehaviourLanguage.g:2123:4: kw= '-'
                    {
                    kw=(Token)match(input,60,FOLLOW_63); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2129:3: (this_INT_1= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBehaviourLanguage.g:2130:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_64); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,61,FOLLOW_65); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_66); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBehaviourLanguage.g:2150:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=62 && LA47_0<=63)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBehaviourLanguage.g:2151:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBehaviourLanguage.g:2151:4: (kw= 'E' | kw= 'e' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==62) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==63) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2152:5: kw= 'E'
                            {
                            kw=(Token)match(input,62,FOLLOW_39); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:2158:5: kw= 'e'
                            {
                            kw=(Token)match(input,63,FOLLOW_39); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2164:4: (kw= '-' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==60) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2165:5: kw= '-'
                            {
                            kw=(Token)match(input,60,FOLLOW_65); 

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


    // $ANTLR start "entryRulePropertyKey"
    // InternalBehaviourLanguage.g:2183:1: entryRulePropertyKey returns [EObject current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final EObject entryRulePropertyKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKey = null;


        try {
            // InternalBehaviourLanguage.g:2183:52: (iv_rulePropertyKey= rulePropertyKey EOF )
            // InternalBehaviourLanguage.g:2184:2: iv_rulePropertyKey= rulePropertyKey EOF
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
    // InternalBehaviourLanguage.g:2190:1: rulePropertyKey returns [EObject current=null] : ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePropertyKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2196:2: ( ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBehaviourLanguage.g:2197:2: ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBehaviourLanguage.g:2197:2: ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2198:3: () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2198:3: ()
            // InternalBehaviourLanguage.g:2199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyKeyAccess().getPropertyKeyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyKeyAccess().getPropertyKeyKeyword_1());
            		
            // InternalBehaviourLanguage.g:2209:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2210:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2210:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:2211:5: lv_name_2_0= ruleEString
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
    // InternalBehaviourLanguage.g:2232:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBehaviourLanguage.g:2232:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBehaviourLanguage.g:2233:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalBehaviourLanguage.g:2239:1: ruleStringValue returns [EObject current=null] : (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2245:2: ( (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalBehaviourLanguage.g:2246:2: (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalBehaviourLanguage.g:2246:2: (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalBehaviourLanguage.g:2247:3: otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStringValueAccess().getStringValueKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getValueKeyword_2());
            		
            // InternalBehaviourLanguage.g:2259:3: ( (lv_value_3_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2260:4: (lv_value_3_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2260:4: (lv_value_3_0= ruleEString )
            // InternalBehaviourLanguage.g:2261:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMessage"
    // InternalBehaviourLanguage.g:2286:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBehaviourLanguage.g:2286:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBehaviourLanguage.g:2287:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalBehaviourLanguage.g:2293:1: ruleMessage returns [EObject current=null] : ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' ) ;
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
            // InternalBehaviourLanguage.g:2299:2: ( ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' ) )
            // InternalBehaviourLanguage.g:2300:2: ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' )
            {
            // InternalBehaviourLanguage.g:2300:2: ( ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}' )
            // InternalBehaviourLanguage.g:2301:3: ( (lv_needResponse_0_0= 'needResponse' ) ) otherlv_1= 'Message' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )? (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'follows' ( ( ruleEString ) ) )? (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )? (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )? otherlv_28= '}'
            {
            // InternalBehaviourLanguage.g:2301:3: ( (lv_needResponse_0_0= 'needResponse' ) )
            // InternalBehaviourLanguage.g:2302:4: (lv_needResponse_0_0= 'needResponse' )
            {
            // InternalBehaviourLanguage.g:2302:4: (lv_needResponse_0_0= 'needResponse' )
            // InternalBehaviourLanguage.g:2303:5: lv_needResponse_0_0= 'needResponse'
            {
            lv_needResponse_0_0=(Token)match(input,66,FOLLOW_67); 

            					newLeafNode(lv_needResponse_0_0, grammarAccess.getMessageAccess().getNeedResponseNeedResponseKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(current, "needResponse", true, "needResponse");
            				

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getMessageKeyword_1());
            		
            // InternalBehaviourLanguage.g:2319:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2320:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2320:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:2321:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:2342:3: (otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==68) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBehaviourLanguage.g:2343:4: otherlv_4= 'timestamp' ( (lv_timestamp_5_0= ruleEDate ) )
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_69); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getTimestampKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:2347:4: ( (lv_timestamp_5_0= ruleEDate ) )
                    // InternalBehaviourLanguage.g:2348:5: (lv_timestamp_5_0= ruleEDate )
                    {
                    // InternalBehaviourLanguage.g:2348:5: (lv_timestamp_5_0= ruleEDate )
                    // InternalBehaviourLanguage.g:2349:6: lv_timestamp_5_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getTimestampEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_70);
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

            // InternalBehaviourLanguage.g:2367:3: (otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==69) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBehaviourLanguage.g:2368:4: otherlv_6= 'involvedTaskExecutions' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:2376:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:2377:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:2377:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:2378:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2392:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==15) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2393:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2397:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:2398:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:2398:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:2399:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMessageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_71); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2419:3: (otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==70) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBehaviourLanguage.g:2420:4: otherlv_12= 'referredObjects' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,70,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getReferredObjectsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalBehaviourLanguage.g:2428:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:2429:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:2429:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:2430:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2444:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==15) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2445:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2449:5: ( ( ruleEString ) )
                    	    // InternalBehaviourLanguage.g:2450:6: ( ruleEString )
                    	    {
                    	    // InternalBehaviourLanguage.g:2450:6: ( ruleEString )
                    	    // InternalBehaviourLanguage.g:2451:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMessageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,25,FOLLOW_72); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2471:3: (otherlv_18= 'follows' ( ( ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==71) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBehaviourLanguage.g:2472:4: otherlv_18= 'follows' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,71,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getFollowsKeyword_7_0());
                    			
                    // InternalBehaviourLanguage.g:2476:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:2477:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:2477:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:2478:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getFollowsMessageCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2493:3: (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==40) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBehaviourLanguage.g:2494:4: otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleProperty ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getPropertiesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:2502:4: ( (lv_properties_22_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2503:5: (lv_properties_22_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2503:5: (lv_properties_22_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2504:6: lv_properties_22_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getPropertiesPropertyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:2521:4: (otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2522:5: otherlv_23= ',' ( (lv_properties_24_0= ruleProperty ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2526:5: ( (lv_properties_24_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2527:6: (lv_properties_24_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2527:6: (lv_properties_24_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2528:7: lv_properties_24_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getPropertiesPropertyParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,16,FOLLOW_74); 

                    				newLeafNode(otherlv_25, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2551:3: (otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==72) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBehaviourLanguage.g:2552:4: otherlv_26= 'TTL' ( (lv_TTL_27_0= ruleMeasureValue ) )
                    {
                    otherlv_26=(Token)match(input,72,FOLLOW_37); 

                    				newLeafNode(otherlv_26, grammarAccess.getMessageAccess().getTTLKeyword_9_0());
                    			
                    // InternalBehaviourLanguage.g:2556:4: ( (lv_TTL_27_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:2557:5: (lv_TTL_27_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:2557:5: (lv_TTL_27_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:2558:6: lv_TTL_27_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getTTLMeasureValueParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_28=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:2584:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalBehaviourLanguage.g:2584:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalBehaviourLanguage.g:2585:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalBehaviourLanguage.g:2591:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2597:2: (kw= 'EDate' )
            // InternalBehaviourLanguage.g:2598:2: kw= 'EDate'
            {
            kw=(Token)match(input,73,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:2606:1: entryRuleUnicastCommunication returns [EObject current=null] : iv_ruleUnicastCommunication= ruleUnicastCommunication EOF ;
    public final EObject entryRuleUnicastCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnicastCommunication = null;


        try {
            // InternalBehaviourLanguage.g:2606:61: (iv_ruleUnicastCommunication= ruleUnicastCommunication EOF )
            // InternalBehaviourLanguage.g:2607:2: iv_ruleUnicastCommunication= ruleUnicastCommunication EOF
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
    // InternalBehaviourLanguage.g:2613:1: ruleUnicastCommunication returns [EObject current=null] : (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalBehaviourLanguage.g:2619:2: ( (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalBehaviourLanguage.g:2620:2: (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalBehaviourLanguage.g:2620:2: (otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalBehaviourLanguage.g:2621:3: otherlv_0= 'UnicastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getUnicastCommunicationAccess().getUnicastCommunicationKeyword_0());
            		
            // InternalBehaviourLanguage.g:2625:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2626:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2626:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:2627:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getUnicastCommunicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:2648:3: (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==52) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBehaviourLanguage.g:2649:4: otherlv_3= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnicastCommunicationAccess().getCurrentTaskExecutionKeyword_3_0());
                    			
                    // InternalBehaviourLanguage.g:2653:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:2654:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:2654:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:2655:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnicastCommunicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getCurrentTaskExecutionTaskExecutionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getUnicastCommunicationAccess().getMessageKeyword_4());
            		
            // InternalBehaviourLanguage.g:2674:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2675:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2675:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2676:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnicastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getMessageMessageCrossReference_5_0());
            				
            pushFollow(FOLLOW_77);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,76,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getUnicastCommunicationAccess().getTargetKeyword_6());
            		
            // InternalBehaviourLanguage.g:2694:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2695:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2695:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2696:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnicastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getTargetDynamicRobotCrossReference_7_0());
            				
            pushFollow(FOLLOW_52);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:2710:3: (otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==40) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBehaviourLanguage.g:2711:4: otherlv_9= 'properties' otherlv_10= '{' ( (lv_properties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnicastCommunicationAccess().getPropertiesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnicastCommunicationAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:2719:4: ( (lv_properties_11_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2720:5: (lv_properties_11_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2720:5: (lv_properties_11_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2721:6: lv_properties_11_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getPropertiesPropertyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:2738:4: (otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2739:5: otherlv_12= ',' ( (lv_properties_13_0= ruleProperty ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getUnicastCommunicationAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2743:5: ( (lv_properties_13_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2744:6: (lv_properties_13_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2744:6: (lv_properties_13_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2745:7: lv_properties_13_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnicastCommunicationAccess().getPropertiesPropertyParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getUnicastCommunicationAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:2776:1: entryRuleMulticastCommunication returns [EObject current=null] : iv_ruleMulticastCommunication= ruleMulticastCommunication EOF ;
    public final EObject entryRuleMulticastCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulticastCommunication = null;


        try {
            // InternalBehaviourLanguage.g:2776:63: (iv_ruleMulticastCommunication= ruleMulticastCommunication EOF )
            // InternalBehaviourLanguage.g:2777:2: iv_ruleMulticastCommunication= ruleMulticastCommunication EOF
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
    // InternalBehaviourLanguage.g:2783:1: ruleMulticastCommunication returns [EObject current=null] : (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
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
            // InternalBehaviourLanguage.g:2789:2: ( (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalBehaviourLanguage.g:2790:2: (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalBehaviourLanguage.g:2790:2: (otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalBehaviourLanguage.g:2791:3: otherlv_0= 'MulticastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMulticastCommunicationAccess().getMulticastCommunicationKeyword_0());
            		
            // InternalBehaviourLanguage.g:2795:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2796:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2796:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:2797:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getMulticastCommunicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:2818:3: (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==52) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBehaviourLanguage.g:2819:4: otherlv_3= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getMulticastCommunicationAccess().getCurrentTaskExecutionKeyword_3_0());
                    			
                    // InternalBehaviourLanguage.g:2823:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:2824:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:2824:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:2825:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMulticastCommunicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getCurrentTaskExecutionTaskExecutionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getMulticastCommunicationAccess().getMessageKeyword_4());
            		
            // InternalBehaviourLanguage.g:2844:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2845:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2845:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2846:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMulticastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getMessageMessageCrossReference_5_0());
            				
            pushFollow(FOLLOW_78);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,78,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getMulticastCommunicationAccess().getTargetsKeyword_6());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getMulticastCommunicationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalBehaviourLanguage.g:2868:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:2869:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:2869:4: ( ruleEString )
            // InternalBehaviourLanguage.g:2870:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMulticastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getTargetsDynamicRobotCrossReference_8_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:2884:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==15) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:2885:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_16); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMulticastCommunicationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalBehaviourLanguage.g:2889:4: ( ( ruleEString ) )
            	    // InternalBehaviourLanguage.g:2890:5: ( ruleEString )
            	    {
            	    // InternalBehaviourLanguage.g:2890:5: ( ruleEString )
            	    // InternalBehaviourLanguage.g:2891:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMulticastCommunicationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getTargetsDynamicRobotCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_12=(Token)match(input,25,FOLLOW_52); 

            			newLeafNode(otherlv_12, grammarAccess.getMulticastCommunicationAccess().getRightParenthesisKeyword_10());
            		
            // InternalBehaviourLanguage.g:2910:3: (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==40) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBehaviourLanguage.g:2911:4: otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getMulticastCommunicationAccess().getPropertiesKeyword_11_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_14, grammarAccess.getMulticastCommunicationAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalBehaviourLanguage.g:2919:4: ( (lv_properties_15_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2920:5: (lv_properties_15_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2920:5: (lv_properties_15_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2921:6: lv_properties_15_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:2938:4: (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==15) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2939:5: otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getMulticastCommunicationAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2943:5: ( (lv_properties_17_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2944:6: (lv_properties_17_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2944:6: (lv_properties_17_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2945:7: lv_properties_17_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMulticastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getMulticastCommunicationAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:2976:1: entryRuleBroadcastCommunication returns [EObject current=null] : iv_ruleBroadcastCommunication= ruleBroadcastCommunication EOF ;
    public final EObject entryRuleBroadcastCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcastCommunication = null;


        try {
            // InternalBehaviourLanguage.g:2976:63: (iv_ruleBroadcastCommunication= ruleBroadcastCommunication EOF )
            // InternalBehaviourLanguage.g:2977:2: iv_ruleBroadcastCommunication= ruleBroadcastCommunication EOF
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
    // InternalBehaviourLanguage.g:2983:1: ruleBroadcastCommunication returns [EObject current=null] : (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
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
            // InternalBehaviourLanguage.g:2989:2: ( (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalBehaviourLanguage.g:2990:2: (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalBehaviourLanguage.g:2990:2: (otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalBehaviourLanguage.g:2991:3: otherlv_0= 'BroadcastCommunication' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )? otherlv_5= 'message' ( ( ruleEString ) ) otherlv_7= 'targets' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBroadcastCommunicationAccess().getBroadcastCommunicationKeyword_0());
            		
            // InternalBehaviourLanguage.g:2995:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2996:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2996:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:2997:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getBroadcastCommunicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:3018:3: (otherlv_3= 'currentTaskExecution' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==52) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalBehaviourLanguage.g:3019:4: otherlv_3= 'currentTaskExecution' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getBroadcastCommunicationAccess().getCurrentTaskExecutionKeyword_3_0());
                    			
                    // InternalBehaviourLanguage.g:3023:4: ( ( ruleEString ) )
                    // InternalBehaviourLanguage.g:3024:5: ( ruleEString )
                    {
                    // InternalBehaviourLanguage.g:3024:5: ( ruleEString )
                    // InternalBehaviourLanguage.g:3025:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getCurrentTaskExecutionTaskExecutionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getBroadcastCommunicationAccess().getMessageKeyword_4());
            		
            // InternalBehaviourLanguage.g:3044:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3045:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3045:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3046:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getMessageMessageCrossReference_5_0());
            				
            pushFollow(FOLLOW_78);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,78,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getBroadcastCommunicationAccess().getTargetsKeyword_6());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getBroadcastCommunicationAccess().getLeftParenthesisKeyword_7());
            		
            // InternalBehaviourLanguage.g:3068:3: ( ( ruleEString ) )
            // InternalBehaviourLanguage.g:3069:4: ( ruleEString )
            {
            // InternalBehaviourLanguage.g:3069:4: ( ruleEString )
            // InternalBehaviourLanguage.g:3070:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getTargetsDynamicRobotCrossReference_8_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:3084:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==15) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:3085:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_16); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBroadcastCommunicationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalBehaviourLanguage.g:3089:4: ( ( ruleEString ) )
            	    // InternalBehaviourLanguage.g:3090:5: ( ruleEString )
            	    {
            	    // InternalBehaviourLanguage.g:3090:5: ( ruleEString )
            	    // InternalBehaviourLanguage.g:3091:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBroadcastCommunicationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getTargetsDynamicRobotCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_12=(Token)match(input,25,FOLLOW_52); 

            			newLeafNode(otherlv_12, grammarAccess.getBroadcastCommunicationAccess().getRightParenthesisKeyword_10());
            		
            // InternalBehaviourLanguage.g:3110:3: (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==40) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBehaviourLanguage.g:3111:4: otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getBroadcastCommunicationAccess().getPropertiesKeyword_11_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_14, grammarAccess.getBroadcastCommunicationAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalBehaviourLanguage.g:3119:4: ( (lv_properties_15_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:3120:5: (lv_properties_15_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:3120:5: (lv_properties_15_0= ruleProperty )
                    // InternalBehaviourLanguage.g:3121:6: lv_properties_15_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBehaviourLanguage.g:3138:4: (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==15) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:3139:5: otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBroadcastCommunicationAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:3143:5: ( (lv_properties_17_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:3144:6: (lv_properties_17_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:3144:6: (lv_properties_17_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:3145:7: lv_properties_17_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getBroadcastCommunicationAccess().getPropertiesPropertyParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getBroadcastCommunicationAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:3176:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBehaviourLanguage.g:3176:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBehaviourLanguage.g:3177:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBehaviourLanguage.g:3183:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3189:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBehaviourLanguage.g:3190:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBehaviourLanguage.g:3190:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBehaviourLanguage.g:3191:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBehaviourLanguage.g:3191:3: (kw= '-' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==60) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBehaviourLanguage.g:3192:4: kw= '-'
                    {
                    kw=(Token)match(input,60,FOLLOW_65); 

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
    // InternalBehaviourLanguage.g:3209:1: ruleRobotStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) ) ;
    public final Enumerator ruleRobotStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3215:2: ( ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) ) )
            // InternalBehaviourLanguage.g:3216:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) )
            {
            // InternalBehaviourLanguage.g:3216:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt69=1;
                }
                break;
            case 81:
                {
                alt69=2;
                }
                break;
            case 82:
                {
                alt69=3;
                }
                break;
            case 83:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalBehaviourLanguage.g:3217:3: (enumLiteral_0= 'Ready' )
                    {
                    // InternalBehaviourLanguage.g:3217:3: (enumLiteral_0= 'Ready' )
                    // InternalBehaviourLanguage.g:3218:4: enumLiteral_0= 'Ready'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:3225:3: (enumLiteral_1= 'TurnedOff' )
                    {
                    // InternalBehaviourLanguage.g:3225:3: (enumLiteral_1= 'TurnedOff' )
                    // InternalBehaviourLanguage.g:3226:4: enumLiteral_1= 'TurnedOff'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:3233:3: (enumLiteral_2= 'Waiting' )
                    {
                    // InternalBehaviourLanguage.g:3233:3: (enumLiteral_2= 'Waiting' )
                    // InternalBehaviourLanguage.g:3234:4: enumLiteral_2= 'Waiting'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:3241:3: (enumLiteral_3= 'Executing' )
                    {
                    // InternalBehaviourLanguage.g:3241:3: (enumLiteral_3= 'Executing' )
                    // InternalBehaviourLanguage.g:3242:4: enumLiteral_3= 'Executing'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:3252:1: ruleTaskExecutionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) ;
    public final Enumerator ruleTaskExecutionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3258:2: ( ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) )
            // InternalBehaviourLanguage.g:3259:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            {
            // InternalBehaviourLanguage.g:3259:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            int alt70=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt70=1;
                }
                break;
            case 84:
                {
                alt70=2;
                }
                break;
            case 85:
                {
                alt70=3;
                }
                break;
            case 86:
                {
                alt70=4;
                }
                break;
            case 82:
                {
                alt70=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalBehaviourLanguage.g:3260:3: (enumLiteral_0= 'Ready' )
                    {
                    // InternalBehaviourLanguage.g:3260:3: (enumLiteral_0= 'Ready' )
                    // InternalBehaviourLanguage.g:3261:4: enumLiteral_0= 'Ready'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:3268:3: (enumLiteral_1= 'Finished' )
                    {
                    // InternalBehaviourLanguage.g:3268:3: (enumLiteral_1= 'Finished' )
                    // InternalBehaviourLanguage.g:3269:4: enumLiteral_1= 'Finished'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:3276:3: (enumLiteral_2= 'Suspended' )
                    {
                    // InternalBehaviourLanguage.g:3276:3: (enumLiteral_2= 'Suspended' )
                    // InternalBehaviourLanguage.g:3277:4: enumLiteral_2= 'Suspended'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:3284:3: (enumLiteral_3= 'InProgress' )
                    {
                    // InternalBehaviourLanguage.g:3284:3: (enumLiteral_3= 'InProgress' )
                    // InternalBehaviourLanguage.g:3285:4: enumLiteral_3= 'InProgress'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:3292:3: (enumLiteral_4= 'Waiting' )
                    {
                    // InternalBehaviourLanguage.g:3292:3: (enumLiteral_4= 'Waiting' )
                    // InternalBehaviourLanguage.g:3293:4: enumLiteral_4= 'Waiting'
                    {
                    enumLiteral_4=(Token)match(input,82,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000F4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003C810000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000003C010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000038010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000030010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L,0x000000000000A400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000750000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000600010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000003C000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000038000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000030000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010010000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x3000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000010000010000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000010000010000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000010000010000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000010000010000L,0x0000000000000180L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000010000010000L,0x0000000000000100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}