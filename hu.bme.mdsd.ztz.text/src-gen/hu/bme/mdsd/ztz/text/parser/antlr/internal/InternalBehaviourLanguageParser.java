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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Declaration'", "'{'", "'DynamicRobots'", "','", "'}'", "'TaskExecutions'", "'TaskRequirements'", "'Keys'", "':'", "'if'", "'or'", "'then'", "'else'", "'sync'", "'action'", "'do'", "'->'", "'('", "')'", "'send'", "'know'", "'detect'", "'obstacle'", "'exec'", "'set'", "'*'", "'.'", "'status'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'executionTime'", "'requirement'", "'name'", "'participants'", "'taskExecution'", "'prerequisite'", "'requiredCapabilities'", "'properties'", "'capabilityProperties'", "'['", "'='", "']'", "'measure '", "'in'", "'CapabilityProperties'", "'capability'", "'-'", "'E'", "'e'", "'Objects'", "'Follows'", "'Properties'", "'TTL'", "'RobotReady'", "'RobotTurnedOff'", "'RobotWaiting'", "'RobotExecuting'", "'TaskReady'", "'TaskFinished'", "'TaskSuspended'", "'TaskInProgress'", "'TaskWaiting'"
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
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalBehaviourLanguage.g:72:1: ruleBehaviourLanguage returns [EObject current=null] : ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) ( (lv_statements_2_0= ruleStatement ) )* ) ;
    public final EObject ruleBehaviourLanguage() throws RecognitionException {
        EObject current = null;

        EObject lv_importModel_0_0 = null;

        EObject lv_container_1_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:78:2: ( ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) ( (lv_statements_2_0= ruleStatement ) )* ) )
            // InternalBehaviourLanguage.g:79:2: ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) ( (lv_statements_2_0= ruleStatement ) )* )
            {
            // InternalBehaviourLanguage.g:79:2: ( ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) ( (lv_statements_2_0= ruleStatement ) )* )
            // InternalBehaviourLanguage.g:80:3: ( (lv_importModel_0_0= ruleImport ) ) ( (lv_container_1_0= ruleBehaviourContainer ) ) ( (lv_statements_2_0= ruleStatement ) )*
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
            				
            pushFollow(FOLLOW_4);
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

            // InternalBehaviourLanguage.g:118:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==21||(LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:119:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalBehaviourLanguage.g:119:4: (lv_statements_2_0= ruleStatement )
            	    // InternalBehaviourLanguage.g:120:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviourLanguageAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviourLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalBehaviourLanguage.g:141:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBehaviourLanguage.g:141:47: (iv_ruleImport= ruleImport EOF )
            // InternalBehaviourLanguage.g:142:2: iv_ruleImport= ruleImport EOF
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
    // InternalBehaviourLanguage.g:148:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:154:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalBehaviourLanguage.g:155:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalBehaviourLanguage.g:155:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalBehaviourLanguage.g:156:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalBehaviourLanguage.g:160:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalBehaviourLanguage.g:161:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalBehaviourLanguage.g:161:4: (lv_importURI_1_0= RULE_STRING )
            // InternalBehaviourLanguage.g:162:5: lv_importURI_1_0= RULE_STRING
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
    // InternalBehaviourLanguage.g:182:1: entryRuleBehaviourContainer returns [EObject current=null] : iv_ruleBehaviourContainer= ruleBehaviourContainer EOF ;
    public final EObject entryRuleBehaviourContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourContainer = null;


        try {
            // InternalBehaviourLanguage.g:182:59: (iv_ruleBehaviourContainer= ruleBehaviourContainer EOF )
            // InternalBehaviourLanguage.g:183:2: iv_ruleBehaviourContainer= ruleBehaviourContainer EOF
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
    // InternalBehaviourLanguage.g:189:1: ruleBehaviourContainer returns [EObject current=null] : ( () otherlv_1= 'Declaration' otherlv_2= '{' (otherlv_3= 'DynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'TaskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'TaskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'Keys' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' ) ;
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
            // InternalBehaviourLanguage.g:195:2: ( ( () otherlv_1= 'Declaration' otherlv_2= '{' (otherlv_3= 'DynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'TaskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'TaskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'Keys' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' ) )
            // InternalBehaviourLanguage.g:196:2: ( () otherlv_1= 'Declaration' otherlv_2= '{' (otherlv_3= 'DynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'TaskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'TaskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'Keys' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' )
            {
            // InternalBehaviourLanguage.g:196:2: ( () otherlv_1= 'Declaration' otherlv_2= '{' (otherlv_3= 'DynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'TaskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'TaskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'Keys' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}' )
            // InternalBehaviourLanguage.g:197:3: () otherlv_1= 'Declaration' otherlv_2= '{' (otherlv_3= 'DynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )? (otherlv_9= 'TaskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )? (otherlv_15= 'TaskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )? (otherlv_21= 'Keys' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )? otherlv_23= '}'
            {
            // InternalBehaviourLanguage.g:197:3: ()
            // InternalBehaviourLanguage.g:198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourContainerAccess().getBehaviourContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourContainerAccess().getDeclarationKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehaviourLanguage.g:212:3: (otherlv_3= 'DynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBehaviourLanguage.g:213:4: otherlv_3= 'DynamicRobots' otherlv_4= '{' ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) ) (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourContainerAccess().getDynamicRobotsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBehaviourLanguage.g:221:4: ( (lv_dynamicRobots_5_0= ruleDynamicRobot ) )
                    // InternalBehaviourLanguage.g:222:5: (lv_dynamicRobots_5_0= ruleDynamicRobot )
                    {
                    // InternalBehaviourLanguage.g:222:5: (lv_dynamicRobots_5_0= ruleDynamicRobot )
                    // InternalBehaviourLanguage.g:223:6: lv_dynamicRobots_5_0= ruleDynamicRobot
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsDynamicRobotParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBehaviourLanguage.g:240:4: (otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:241:5: otherlv_6= ',' ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:245:5: ( (lv_dynamicRobots_7_0= ruleDynamicRobot ) )
                    	    // InternalBehaviourLanguage.g:246:6: (lv_dynamicRobots_7_0= ruleDynamicRobot )
                    	    {
                    	    // InternalBehaviourLanguage.g:246:6: (lv_dynamicRobots_7_0= ruleDynamicRobot )
                    	    // InternalBehaviourLanguage.g:247:7: lv_dynamicRobots_7_0= ruleDynamicRobot
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsDynamicRobotParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:270:3: (otherlv_9= 'TaskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBehaviourLanguage.g:271:4: otherlv_9= 'TaskExecutions' otherlv_10= '{' ( (lv_taskExecutions_11_0= ruleTaskExecution ) ) (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviourContainerAccess().getTaskExecutionsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:279:4: ( (lv_taskExecutions_11_0= ruleTaskExecution ) )
                    // InternalBehaviourLanguage.g:280:5: (lv_taskExecutions_11_0= ruleTaskExecution )
                    {
                    // InternalBehaviourLanguage.g:280:5: (lv_taskExecutions_11_0= ruleTaskExecution )
                    // InternalBehaviourLanguage.g:281:6: lv_taskExecutions_11_0= ruleTaskExecution
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsTaskExecutionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBehaviourLanguage.g:298:4: (otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:299:5: otherlv_12= ',' ( (lv_taskExecutions_13_0= ruleTaskExecution ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:303:5: ( (lv_taskExecutions_13_0= ruleTaskExecution ) )
                    	    // InternalBehaviourLanguage.g:304:6: (lv_taskExecutions_13_0= ruleTaskExecution )
                    	    {
                    	    // InternalBehaviourLanguage.g:304:6: (lv_taskExecutions_13_0= ruleTaskExecution )
                    	    // InternalBehaviourLanguage.g:305:7: lv_taskExecutions_13_0= ruleTaskExecution
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsTaskExecutionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:328:3: (otherlv_15= 'TaskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBehaviourLanguage.g:329:4: otherlv_15= 'TaskRequirements' otherlv_16= '{' ( (lv_taskRequirements_17_0= ruleTaskRequirement ) ) (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getBehaviourContainerAccess().getTaskRequirementsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviourContainerAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:337:4: ( (lv_taskRequirements_17_0= ruleTaskRequirement ) )
                    // InternalBehaviourLanguage.g:338:5: (lv_taskRequirements_17_0= ruleTaskRequirement )
                    {
                    // InternalBehaviourLanguage.g:338:5: (lv_taskRequirements_17_0= ruleTaskRequirement )
                    // InternalBehaviourLanguage.g:339:6: lv_taskRequirements_17_0= ruleTaskRequirement
                    {

                    						newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsTaskRequirementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBehaviourLanguage.g:356:4: (otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:357:5: otherlv_18= ',' ( (lv_taskRequirements_19_0= ruleTaskRequirement ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBehaviourContainerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:361:5: ( (lv_taskRequirements_19_0= ruleTaskRequirement ) )
                    	    // InternalBehaviourLanguage.g:362:6: (lv_taskRequirements_19_0= ruleTaskRequirement )
                    	    {
                    	    // InternalBehaviourLanguage.g:362:6: (lv_taskRequirements_19_0= ruleTaskRequirement )
                    	    // InternalBehaviourLanguage.g:363:7: lv_taskRequirements_19_0= ruleTaskRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsTaskRequirementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getBehaviourContainerAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:386:3: (otherlv_21= 'Keys' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBehaviourLanguage.g:387:4: otherlv_21= 'Keys' ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) )
                    {
                    otherlv_21=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviourContainerAccess().getKeysKeyword_6_0());
                    			
                    // InternalBehaviourLanguage.g:391:4: ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) )
                    // InternalBehaviourLanguage.g:392:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    {
                    // InternalBehaviourLanguage.g:392:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    // InternalBehaviourLanguage.g:393:6: lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer
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


    // $ANTLR start "entryRulePropertyValue"
    // InternalBehaviourLanguage.g:419:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalBehaviourLanguage.g:419:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalBehaviourLanguage.g:420:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalBehaviourLanguage.g:426:1: rulePropertyValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_MeasureValue_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:432:2: ( (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue ) )
            // InternalBehaviourLanguage.g:433:2: (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue )
            {
            // InternalBehaviourLanguage.g:433:2: (this_StringValue_0= ruleStringValue | this_MeasureValue_1= ruleMeasureValue )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            else if ( (LA9_0==58) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBehaviourLanguage.g:434:3: this_StringValue_0= ruleStringValue
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
                    // InternalBehaviourLanguage.g:443:3: this_MeasureValue_1= ruleMeasureValue
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
    // InternalBehaviourLanguage.g:455:1: entryRuleDynamicRobot returns [EObject current=null] : iv_ruleDynamicRobot= ruleDynamicRobot EOF ;
    public final EObject entryRuleDynamicRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicRobot = null;


        try {
            // InternalBehaviourLanguage.g:455:53: (iv_ruleDynamicRobot= ruleDynamicRobot EOF )
            // InternalBehaviourLanguage.g:456:2: iv_ruleDynamicRobot= ruleDynamicRobot EOF
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
    // InternalBehaviourLanguage.g:462:1: ruleDynamicRobot returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDynamicRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:468:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:469:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:469:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:470:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:470:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:471:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:471:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:472:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDynamicRobotAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamicRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicRobotAccess().getColonKeyword_1());
            		
            // InternalBehaviourLanguage.g:493:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:494:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:494:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:495:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDynamicRobotRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDynamicRobotAccess().getRobotRobotCrossReference_2_0());
            				

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
    // $ANTLR end "ruleDynamicRobot"


    // $ANTLR start "entryRuleStatement"
    // InternalBehaviourLanguage.g:510:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBehaviourLanguage.g:510:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBehaviourLanguage.g:511:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalBehaviourLanguage.g:517:1: ruleStatement returns [EObject current=null] : (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement | this_SynchronousStatement_2= ruleSynchronousStatement | this_ActionDeclarationStatement_3= ruleActionDeclarationStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicStatement_0 = null;

        EObject this_ConditionalStatement_1 = null;

        EObject this_SynchronousStatement_2 = null;

        EObject this_ActionDeclarationStatement_3 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:523:2: ( (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement | this_SynchronousStatement_2= ruleSynchronousStatement | this_ActionDeclarationStatement_3= ruleActionDeclarationStatement ) )
            // InternalBehaviourLanguage.g:524:2: (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement | this_SynchronousStatement_2= ruleSynchronousStatement | this_ActionDeclarationStatement_3= ruleActionDeclarationStatement )
            {
            // InternalBehaviourLanguage.g:524:2: (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement | this_SynchronousStatement_2= ruleSynchronousStatement | this_ActionDeclarationStatement_3= ruleActionDeclarationStatement )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBehaviourLanguage.g:525:3: this_AtomicStatement_0= ruleAtomicStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAtomicStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicStatement_0=ruleAtomicStatement();

                    state._fsp--;


                    			current = this_AtomicStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:534:3: this_ConditionalStatement_1= ruleConditionalStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalStatement_1=ruleConditionalStatement();

                    state._fsp--;


                    			current = this_ConditionalStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:543:3: this_SynchronousStatement_2= ruleSynchronousStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSynchronousStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SynchronousStatement_2=ruleSynchronousStatement();

                    state._fsp--;


                    			current = this_SynchronousStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:552:3: this_ActionDeclarationStatement_3= ruleActionDeclarationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getActionDeclarationStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionDeclarationStatement_3=ruleActionDeclarationStatement();

                    state._fsp--;


                    			current = this_ActionDeclarationStatement_3;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAtomicStatement"
    // InternalBehaviourLanguage.g:564:1: entryRuleAtomicStatement returns [EObject current=null] : iv_ruleAtomicStatement= ruleAtomicStatement EOF ;
    public final EObject entryRuleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicStatement = null;


        try {
            // InternalBehaviourLanguage.g:564:56: (iv_ruleAtomicStatement= ruleAtomicStatement EOF )
            // InternalBehaviourLanguage.g:565:2: iv_ruleAtomicStatement= ruleAtomicStatement EOF
            {
             newCompositeNode(grammarAccess.getAtomicStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicStatement=ruleAtomicStatement();

            state._fsp--;

             current =iv_ruleAtomicStatement; 
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
    // $ANTLR end "entryRuleAtomicStatement"


    // $ANTLR start "ruleAtomicStatement"
    // InternalBehaviourLanguage.g:571:1: ruleAtomicStatement returns [EObject current=null] : (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement ) ;
    public final EObject ruleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionStatement_0 = null;

        EObject this_MessageStatement_1 = null;

        EObject this_CollaborationStatement_2 = null;

        EObject this_DetectionStatement_3 = null;

        EObject this_ExecutionStatement_4 = null;

        EObject this_StatusStatement_5 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:577:2: ( (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement ) )
            // InternalBehaviourLanguage.g:578:2: (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement )
            {
            // InternalBehaviourLanguage.g:578:2: (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement )
            int alt11=6;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt11=4;
                    }
                    break;
                case 35:
                    {
                    alt11=5;
                    }
                    break;
                case 36:
                    {
                    alt11=6;
                    }
                    break;
                case 27:
                    {
                    alt11=1;
                    }
                    break;
                case 32:
                    {
                    alt11=3;
                    }
                    break;
                case 31:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBehaviourLanguage.g:579:3: this_ActionStatement_0= ruleActionStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicStatementAccess().getActionStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionStatement_0=ruleActionStatement();

                    state._fsp--;


                    			current = this_ActionStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:588:3: this_MessageStatement_1= ruleMessageStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicStatementAccess().getMessageStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageStatement_1=ruleMessageStatement();

                    state._fsp--;


                    			current = this_MessageStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:597:3: this_CollaborationStatement_2= ruleCollaborationStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicStatementAccess().getCollaborationStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollaborationStatement_2=ruleCollaborationStatement();

                    state._fsp--;


                    			current = this_CollaborationStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:606:3: this_DetectionStatement_3= ruleDetectionStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicStatementAccess().getDetectionStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DetectionStatement_3=ruleDetectionStatement();

                    state._fsp--;


                    			current = this_DetectionStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:615:3: this_ExecutionStatement_4= ruleExecutionStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicStatementAccess().getExecutionStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecutionStatement_4=ruleExecutionStatement();

                    state._fsp--;


                    			current = this_ExecutionStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBehaviourLanguage.g:624:3: this_StatusStatement_5= ruleStatusStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicStatementAccess().getStatusStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StatusStatement_5=ruleStatusStatement();

                    state._fsp--;


                    			current = this_StatusStatement_5;
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
    // $ANTLR end "ruleAtomicStatement"


    // $ANTLR start "entryRuleConditionalStatement"
    // InternalBehaviourLanguage.g:636:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalBehaviourLanguage.g:636:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalBehaviourLanguage.g:637:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;

             current =iv_ruleConditionalStatement; 
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
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // InternalBehaviourLanguage.g:643:1: ruleConditionalStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) (otherlv_2= 'or' ( (lv_condition_3_0= ruleCondition ) ) )* otherlv_4= 'then' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_otherStatements_10_0= ruleStatement ) )+ otherlv_11= '}' )? ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_condition_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_otherStatements_10_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:649:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) (otherlv_2= 'or' ( (lv_condition_3_0= ruleCondition ) ) )* otherlv_4= 'then' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_otherStatements_10_0= ruleStatement ) )+ otherlv_11= '}' )? ) )
            // InternalBehaviourLanguage.g:650:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) (otherlv_2= 'or' ( (lv_condition_3_0= ruleCondition ) ) )* otherlv_4= 'then' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_otherStatements_10_0= ruleStatement ) )+ otherlv_11= '}' )? )
            {
            // InternalBehaviourLanguage.g:650:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) (otherlv_2= 'or' ( (lv_condition_3_0= ruleCondition ) ) )* otherlv_4= 'then' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_otherStatements_10_0= ruleStatement ) )+ otherlv_11= '}' )? )
            // InternalBehaviourLanguage.g:651:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) (otherlv_2= 'or' ( (lv_condition_3_0= ruleCondition ) ) )* otherlv_4= 'then' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_otherStatements_10_0= ruleStatement ) )+ otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getIfKeyword_0());
            		
            // InternalBehaviourLanguage.g:655:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalBehaviourLanguage.g:656:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalBehaviourLanguage.g:656:4: (lv_condition_1_0= ruleCondition )
            // InternalBehaviourLanguage.g:657:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					add(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:674:3: (otherlv_2= 'or' ( (lv_condition_3_0= ruleCondition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:675:4: otherlv_2= 'or' ( (lv_condition_3_0= ruleCondition ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionalStatementAccess().getOrKeyword_2_0());
            	    			
            	    // InternalBehaviourLanguage.g:679:4: ( (lv_condition_3_0= ruleCondition ) )
            	    // InternalBehaviourLanguage.g:680:5: (lv_condition_3_0= ruleCondition )
            	    {
            	    // InternalBehaviourLanguage.g:680:5: (lv_condition_3_0= ruleCondition )
            	    // InternalBehaviourLanguage.g:681:6: lv_condition_3_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_condition_3_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"condition",
            	    							lv_condition_3_0,
            	    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalStatementAccess().getThenKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalStatementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBehaviourLanguage.g:707:3: ( (lv_statements_6_0= ruleStatement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==21||(LA13_0>=25 && LA13_0<=26)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:708:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalBehaviourLanguage.g:708:4: (lv_statements_6_0= ruleStatement )
            	    // InternalBehaviourLanguage.g:709:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalStatementAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
            	    						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalStatementAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalBehaviourLanguage.g:730:3: (otherlv_8= 'else' otherlv_9= '{' ( (lv_otherStatements_10_0= ruleStatement ) )+ otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBehaviourLanguage.g:731:4: otherlv_8= 'else' otherlv_9= '{' ( (lv_otherStatements_10_0= ruleStatement ) )+ otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionalStatementAccess().getElseKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionalStatementAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBehaviourLanguage.g:739:4: ( (lv_otherStatements_10_0= ruleStatement ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||LA14_0==21||(LA14_0>=25 && LA14_0<=26)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:740:5: (lv_otherStatements_10_0= ruleStatement )
                    	    {
                    	    // InternalBehaviourLanguage.g:740:5: (lv_otherStatements_10_0= ruleStatement )
                    	    // InternalBehaviourLanguage.g:741:6: lv_otherStatements_10_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getOtherStatementsStatementParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_otherStatements_10_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"otherStatements",
                    	    							lv_otherStatements_10_0,
                    	    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getConditionalStatementAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleSynchronousStatement"
    // InternalBehaviourLanguage.g:767:1: entryRuleSynchronousStatement returns [EObject current=null] : iv_ruleSynchronousStatement= ruleSynchronousStatement EOF ;
    public final EObject entryRuleSynchronousStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronousStatement = null;


        try {
            // InternalBehaviourLanguage.g:767:61: (iv_ruleSynchronousStatement= ruleSynchronousStatement EOF )
            // InternalBehaviourLanguage.g:768:2: iv_ruleSynchronousStatement= ruleSynchronousStatement EOF
            {
             newCompositeNode(grammarAccess.getSynchronousStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSynchronousStatement=ruleSynchronousStatement();

            state._fsp--;

             current =iv_ruleSynchronousStatement; 
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
    // $ANTLR end "entryRuleSynchronousStatement"


    // $ANTLR start "ruleSynchronousStatement"
    // InternalBehaviourLanguage.g:774:1: ruleSynchronousStatement returns [EObject current=null] : (otherlv_0= 'sync' otherlv_1= '{' ( ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) ) )+ otherlv_3= '}' ) ;
    public final EObject ruleSynchronousStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_1 = null;

        EObject lv_statements_2_2 = null;

        EObject lv_statements_2_3 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:780:2: ( (otherlv_0= 'sync' otherlv_1= '{' ( ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) ) )+ otherlv_3= '}' ) )
            // InternalBehaviourLanguage.g:781:2: (otherlv_0= 'sync' otherlv_1= '{' ( ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) ) )+ otherlv_3= '}' )
            {
            // InternalBehaviourLanguage.g:781:2: (otherlv_0= 'sync' otherlv_1= '{' ( ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) ) )+ otherlv_3= '}' )
            // InternalBehaviourLanguage.g:782:3: otherlv_0= 'sync' otherlv_1= '{' ( ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSynchronousStatementAccess().getSyncKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSynchronousStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:790:3: ( ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:791:4: ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) )
            	    {
            	    // InternalBehaviourLanguage.g:791:4: ( (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement ) )
            	    // InternalBehaviourLanguage.g:792:5: (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement )
            	    {
            	    // InternalBehaviourLanguage.g:792:5: (lv_statements_2_1= ruleActionStatement | lv_statements_2_2= ruleMessageStatement | lv_statements_2_3= ruleDetectionStatement )
            	    int alt16=3;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_ID) ) {
            	        switch ( input.LA(2) ) {
            	        case 31:
            	            {
            	            alt16=2;
            	            }
            	            break;
            	        case 33:
            	            {
            	            alt16=3;
            	            }
            	            break;
            	        case 27:
            	            {
            	            alt16=1;
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 16, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalBehaviourLanguage.g:793:6: lv_statements_2_1= ruleActionStatement
            	            {

            	            						newCompositeNode(grammarAccess.getSynchronousStatementAccess().getStatementsActionStatementParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_statements_2_1=ruleActionStatement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSynchronousStatementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_2_1,
            	            							"hu.bme.mdsd.ztz.text.BehaviourLanguage.ActionStatement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalBehaviourLanguage.g:809:6: lv_statements_2_2= ruleMessageStatement
            	            {

            	            						newCompositeNode(grammarAccess.getSynchronousStatementAccess().getStatementsMessageStatementParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_statements_2_2=ruleMessageStatement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSynchronousStatementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_2_2,
            	            							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MessageStatement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalBehaviourLanguage.g:825:6: lv_statements_2_3= ruleDetectionStatement
            	            {

            	            						newCompositeNode(grammarAccess.getSynchronousStatementAccess().getStatementsDetectionStatementParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_statements_2_3=ruleDetectionStatement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSynchronousStatementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_2_3,
            	            							"hu.bme.mdsd.ztz.text.BehaviourLanguage.DetectionStatement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSynchronousStatementAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSynchronousStatement"


    // $ANTLR start "entryRuleActionDeclarationStatement"
    // InternalBehaviourLanguage.g:851:1: entryRuleActionDeclarationStatement returns [EObject current=null] : iv_ruleActionDeclarationStatement= ruleActionDeclarationStatement EOF ;
    public final EObject entryRuleActionDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDeclarationStatement = null;


        try {
            // InternalBehaviourLanguage.g:851:67: (iv_ruleActionDeclarationStatement= ruleActionDeclarationStatement EOF )
            // InternalBehaviourLanguage.g:852:2: iv_ruleActionDeclarationStatement= ruleActionDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getActionDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDeclarationStatement=ruleActionDeclarationStatement();

            state._fsp--;

             current =iv_ruleActionDeclarationStatement; 
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
    // $ANTLR end "entryRuleActionDeclarationStatement"


    // $ANTLR start "ruleActionDeclarationStatement"
    // InternalBehaviourLanguage.g:858:1: ruleActionDeclarationStatement returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleActionDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:864:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )? ) )
            // InternalBehaviourLanguage.g:865:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )? )
            {
            // InternalBehaviourLanguage.g:865:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )? )
            // InternalBehaviourLanguage.g:866:3: otherlv_0= 'action' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDeclarationStatementAccess().getActionKeyword_0());
            		
            // InternalBehaviourLanguage.g:870:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:871:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:871:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:872:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionDeclarationStatementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionDeclarationStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:889:3: (otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBehaviourLanguage.g:890:4: otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionDeclarationStatementAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:894:4: ( (otherlv_3= RULE_ID ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:895:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalBehaviourLanguage.g:895:5: (otherlv_3= RULE_ID )
                    	    // InternalBehaviourLanguage.g:896:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getActionDeclarationStatementRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getActionDeclarationStatementAccess().getPropertiesPropertyKeyCrossReference_2_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionDeclarationStatementAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleActionDeclarationStatement"


    // $ANTLR start "entryRuleActionStatement"
    // InternalBehaviourLanguage.g:916:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // InternalBehaviourLanguage.g:916:56: (iv_ruleActionStatement= ruleActionStatement EOF )
            // InternalBehaviourLanguage.g:917:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
             newCompositeNode(grammarAccess.getActionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;

             current =iv_ruleActionStatement; 
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
    // $ANTLR end "entryRuleActionStatement"


    // $ANTLR start "ruleActionStatement"
    // InternalBehaviourLanguage.g:923:1: ruleActionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleActionImplementation ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleActionImplementation ) ) )* ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_action_2_0 = null;

        EObject lv_moreactions_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:929:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleActionImplementation ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleActionImplementation ) ) )* ) )
            // InternalBehaviourLanguage.g:930:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleActionImplementation ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleActionImplementation ) ) )* )
            {
            // InternalBehaviourLanguage.g:930:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleActionImplementation ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleActionImplementation ) ) )* )
            // InternalBehaviourLanguage.g:931:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleActionImplementation ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleActionImplementation ) ) )*
            {
            // InternalBehaviourLanguage.g:931:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:932:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:932:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:933:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getActionStatementAccess().getDoKeyword_1());
            		
            // InternalBehaviourLanguage.g:948:3: ( (lv_action_2_0= ruleActionImplementation ) )
            // InternalBehaviourLanguage.g:949:4: (lv_action_2_0= ruleActionImplementation )
            {
            // InternalBehaviourLanguage.g:949:4: (lv_action_2_0= ruleActionImplementation )
            // InternalBehaviourLanguage.g:950:5: lv_action_2_0= ruleActionImplementation
            {

            					newCompositeNode(grammarAccess.getActionStatementAccess().getActionActionImplementationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_action_2_0=ruleActionImplementation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionStatementRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.ActionImplementation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:967:3: (otherlv_3= '->' ( (lv_moreactions_4_0= ruleActionImplementation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:968:4: otherlv_3= '->' ( (lv_moreactions_4_0= ruleActionImplementation ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:972:4: ( (lv_moreactions_4_0= ruleActionImplementation ) )
            	    // InternalBehaviourLanguage.g:973:5: (lv_moreactions_4_0= ruleActionImplementation )
            	    {
            	    // InternalBehaviourLanguage.g:973:5: (lv_moreactions_4_0= ruleActionImplementation )
            	    // InternalBehaviourLanguage.g:974:6: lv_moreactions_4_0= ruleActionImplementation
            	    {

            	    						newCompositeNode(grammarAccess.getActionStatementAccess().getMoreactionsActionImplementationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_moreactions_4_0=ruleActionImplementation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"moreactions",
            	    							lv_moreactions_4_0,
            	    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.ActionImplementation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRuleActionImplementation"
    // InternalBehaviourLanguage.g:996:1: entryRuleActionImplementation returns [EObject current=null] : iv_ruleActionImplementation= ruleActionImplementation EOF ;
    public final EObject entryRuleActionImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionImplementation = null;


        try {
            // InternalBehaviourLanguage.g:996:61: (iv_ruleActionImplementation= ruleActionImplementation EOF )
            // InternalBehaviourLanguage.g:997:2: iv_ruleActionImplementation= ruleActionImplementation EOF
            {
             newCompositeNode(grammarAccess.getActionImplementationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionImplementation=ruleActionImplementation();

            state._fsp--;

             current =iv_ruleActionImplementation; 
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
    // $ANTLR end "entryRuleActionImplementation"


    // $ANTLR start "ruleActionImplementation"
    // InternalBehaviourLanguage.g:1003:1: ruleActionImplementation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleActionImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1009:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? ) )
            // InternalBehaviourLanguage.g:1010:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? )
            {
            // InternalBehaviourLanguage.g:1010:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? )
            // InternalBehaviourLanguage.g:1011:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )?
            {
            // InternalBehaviourLanguage.g:1011:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1012:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1012:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1013:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionImplementationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getActionImplementationAccess().getDeclarationActionDeclarationStatementCrossReference_0_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1024:3: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBehaviourLanguage.g:1025:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionImplementationAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBehaviourLanguage.g:1029:4: ( (otherlv_2= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1030:5: (otherlv_2= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1030:5: (otherlv_2= RULE_ID )
                    // InternalBehaviourLanguage.g:1031:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionImplementationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_2, grammarAccess.getActionImplementationAccess().getCurrentTaskExecutionTaskExecutionCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionImplementationAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1047:3: (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBehaviourLanguage.g:1048:4: otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionImplementationAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:1052:4: ( (lv_properties_5_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1053:5: (lv_properties_5_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1053:5: (lv_properties_5_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1054:6: lv_properties_5_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getActionImplementationAccess().getPropertiesPropertyParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_5_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionImplementationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_5_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1071:4: (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1072:5: otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getActionImplementationAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1076:5: ( (lv_properties_7_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1077:6: (lv_properties_7_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1077:6: (lv_properties_7_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1078:7: lv_properties_7_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionImplementationAccess().getPropertiesPropertyParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_properties_7_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionImplementationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_7_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionImplementationAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleActionImplementation"


    // $ANTLR start "entryRuleMessageStatement"
    // InternalBehaviourLanguage.g:1105:1: entryRuleMessageStatement returns [EObject current=null] : iv_ruleMessageStatement= ruleMessageStatement EOF ;
    public final EObject entryRuleMessageStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStatement = null;


        try {
            // InternalBehaviourLanguage.g:1105:57: (iv_ruleMessageStatement= ruleMessageStatement EOF )
            // InternalBehaviourLanguage.g:1106:2: iv_ruleMessageStatement= ruleMessageStatement EOF
            {
             newCompositeNode(grammarAccess.getMessageStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageStatement=ruleMessageStatement();

            state._fsp--;

             current =iv_ruleMessageStatement; 
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
    // $ANTLR end "entryRuleMessageStatement"


    // $ANTLR start "ruleMessageStatement"
    // InternalBehaviourLanguage.g:1112:1: ruleMessageStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) ;
    public final EObject ruleMessageStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_target_2_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1118:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) )
            // InternalBehaviourLanguage.g:1119:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            {
            // InternalBehaviourLanguage.g:1119:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            // InternalBehaviourLanguage.g:1120:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) )
            {
            // InternalBehaviourLanguage.g:1120:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1121:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1121:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1122:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getMessageStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageStatementAccess().getSendKeyword_1());
            		
            // InternalBehaviourLanguage.g:1137:3: ( (lv_target_2_0= ruleMessageTarget ) )
            // InternalBehaviourLanguage.g:1138:4: (lv_target_2_0= ruleMessageTarget )
            {
            // InternalBehaviourLanguage.g:1138:4: (lv_target_2_0= ruleMessageTarget )
            // InternalBehaviourLanguage.g:1139:5: lv_target_2_0= ruleMessageTarget
            {

            					newCompositeNode(grammarAccess.getMessageStatementAccess().getTargetMessageTargetParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_target_2_0=ruleMessageTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageStatementRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.MessageTarget");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:1156:3: ( (lv_message_3_0= ruleMessage ) )
            // InternalBehaviourLanguage.g:1157:4: (lv_message_3_0= ruleMessage )
            {
            // InternalBehaviourLanguage.g:1157:4: (lv_message_3_0= ruleMessage )
            // InternalBehaviourLanguage.g:1158:5: lv_message_3_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getMessageStatementAccess().getMessageMessageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_message_3_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageStatementRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_3_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Message");
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
    // $ANTLR end "ruleMessageStatement"


    // $ANTLR start "entryRuleCollaborationStatement"
    // InternalBehaviourLanguage.g:1179:1: entryRuleCollaborationStatement returns [EObject current=null] : iv_ruleCollaborationStatement= ruleCollaborationStatement EOF ;
    public final EObject entryRuleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollaborationStatement = null;


        try {
            // InternalBehaviourLanguage.g:1179:63: (iv_ruleCollaborationStatement= ruleCollaborationStatement EOF )
            // InternalBehaviourLanguage.g:1180:2: iv_ruleCollaborationStatement= ruleCollaborationStatement EOF
            {
             newCompositeNode(grammarAccess.getCollaborationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollaborationStatement=ruleCollaborationStatement();

            state._fsp--;

             current =iv_ruleCollaborationStatement; 
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
    // $ANTLR end "entryRuleCollaborationStatement"


    // $ANTLR start "ruleCollaborationStatement"
    // InternalBehaviourLanguage.g:1186:1: ruleCollaborationStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) ;
    public final EObject ruleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collaboration_2_0 = null;

        EObject lv_collaboration_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1192:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) )
            // InternalBehaviourLanguage.g:1193:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            {
            // InternalBehaviourLanguage.g:1193:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            // InternalBehaviourLanguage.g:1194:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            {
            // InternalBehaviourLanguage.g:1194:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1195:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1195:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1196:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollaborationStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getCollaborationStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCollaborationStatementAccess().getKnowKeyword_1());
            		
            // InternalBehaviourLanguage.g:1211:3: ( (lv_collaboration_2_0= ruleRobotCollaboration ) )
            // InternalBehaviourLanguage.g:1212:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            {
            // InternalBehaviourLanguage.g:1212:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            // InternalBehaviourLanguage.g:1213:5: lv_collaboration_2_0= ruleRobotCollaboration
            {

            					newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_collaboration_2_0=ruleRobotCollaboration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollaborationStatementRule());
            					}
            					add(
            						current,
            						"collaboration",
            						lv_collaboration_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.RobotCollaboration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:1230:3: (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:1231:4: otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCollaborationStatementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:1235:4: ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    // InternalBehaviourLanguage.g:1236:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    {
            	    // InternalBehaviourLanguage.g:1236:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    // InternalBehaviourLanguage.g:1237:6: lv_collaboration_4_0= ruleRobotCollaboration
            	    {

            	    						newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_collaboration_4_0=ruleRobotCollaboration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCollaborationStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"collaboration",
            	    							lv_collaboration_4_0,
            	    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.RobotCollaboration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end "ruleCollaborationStatement"


    // $ANTLR start "entryRuleDetectionStatement"
    // InternalBehaviourLanguage.g:1259:1: entryRuleDetectionStatement returns [EObject current=null] : iv_ruleDetectionStatement= ruleDetectionStatement EOF ;
    public final EObject entryRuleDetectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectionStatement = null;


        try {
            // InternalBehaviourLanguage.g:1259:59: (iv_ruleDetectionStatement= ruleDetectionStatement EOF )
            // InternalBehaviourLanguage.g:1260:2: iv_ruleDetectionStatement= ruleDetectionStatement EOF
            {
             newCompositeNode(grammarAccess.getDetectionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetectionStatement=ruleDetectionStatement();

            state._fsp--;

             current =iv_ruleDetectionStatement; 
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
    // $ANTLR end "entryRuleDetectionStatement"


    // $ANTLR start "ruleDetectionStatement"
    // InternalBehaviourLanguage.g:1266:1: ruleDetectionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) ;
    public final EObject ruleDetectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_obstacle_3_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1272:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) )
            // InternalBehaviourLanguage.g:1273:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            {
            // InternalBehaviourLanguage.g:1273:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            // InternalBehaviourLanguage.g:1274:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )?
            {
            // InternalBehaviourLanguage.g:1274:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1275:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1275:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1276:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_0, grammarAccess.getDetectionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDetectionStatementAccess().getDetectKeyword_1());
            		
            // InternalBehaviourLanguage.g:1291:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:1292:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1292:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:1293:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_2, grammarAccess.getDetectionStatementAccess().getObjectAreaObjectCrossReference_2_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1304:3: ( (lv_obstacle_3_0= 'obstacle' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBehaviourLanguage.g:1305:4: (lv_obstacle_3_0= 'obstacle' )
                    {
                    // InternalBehaviourLanguage.g:1305:4: (lv_obstacle_3_0= 'obstacle' )
                    // InternalBehaviourLanguage.g:1306:5: lv_obstacle_3_0= 'obstacle'
                    {
                    lv_obstacle_3_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_obstacle_3_0, grammarAccess.getDetectionStatementAccess().getObstacleObstacleKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDetectionStatementRule());
                    					}
                    					setWithLastConsumed(current, "obstacle", true, "obstacle");
                    				

                    }


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
    // $ANTLR end "ruleDetectionStatement"


    // $ANTLR start "entryRuleExecutionStatement"
    // InternalBehaviourLanguage.g:1322:1: entryRuleExecutionStatement returns [EObject current=null] : iv_ruleExecutionStatement= ruleExecutionStatement EOF ;
    public final EObject entryRuleExecutionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionStatement = null;


        try {
            // InternalBehaviourLanguage.g:1322:59: (iv_ruleExecutionStatement= ruleExecutionStatement EOF )
            // InternalBehaviourLanguage.g:1323:2: iv_ruleExecutionStatement= ruleExecutionStatement EOF
            {
             newCompositeNode(grammarAccess.getExecutionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutionStatement=ruleExecutionStatement();

            state._fsp--;

             current =iv_ruleExecutionStatement; 
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
    // $ANTLR end "entryRuleExecutionStatement"


    // $ANTLR start "ruleExecutionStatement"
    // InternalBehaviourLanguage.g:1329:1: ruleExecutionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExecutionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1335:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:1336:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:1336:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:1337:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:1337:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1338:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1338:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1339:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getExecutionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getExecutionStatementAccess().getExecKeyword_1());
            		
            // InternalBehaviourLanguage.g:1354:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:1355:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1355:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:1356:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getExecutionStatementAccess().getExecutionTaskExecutionCrossReference_2_0());
            				

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
    // $ANTLR end "ruleExecutionStatement"


    // $ANTLR start "entryRuleStatusStatement"
    // InternalBehaviourLanguage.g:1371:1: entryRuleStatusStatement returns [EObject current=null] : iv_ruleStatusStatement= ruleStatusStatement EOF ;
    public final EObject entryRuleStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1371:56: (iv_ruleStatusStatement= ruleStatusStatement EOF )
            // InternalBehaviourLanguage.g:1372:2: iv_ruleStatusStatement= ruleStatusStatement EOF
            {
             newCompositeNode(grammarAccess.getStatusStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatusStatement=ruleStatusStatement();

            state._fsp--;

             current =iv_ruleStatusStatement; 
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
    // $ANTLR end "entryRuleStatusStatement"


    // $ANTLR start "ruleStatusStatement"
    // InternalBehaviourLanguage.g:1378:1: ruleStatusStatement returns [EObject current=null] : (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement ) ;
    public final EObject ruleStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject this_RobotStatusStatement_0 = null;

        EObject this_TaskStatusStatement_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1384:2: ( (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement ) )
            // InternalBehaviourLanguage.g:1385:2: (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement )
            {
            // InternalBehaviourLanguage.g:1385:2: (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==36) ) {
                    int LA26_2 = input.LA(3);

                    if ( ((LA26_2>=73 && LA26_2<=77)) ) {
                        alt26=2;
                    }
                    else if ( ((LA26_2>=69 && LA26_2<=72)) ) {
                        alt26=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBehaviourLanguage.g:1386:3: this_RobotStatusStatement_0= ruleRobotStatusStatement
                    {

                    			newCompositeNode(grammarAccess.getStatusStatementAccess().getRobotStatusStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RobotStatusStatement_0=ruleRobotStatusStatement();

                    state._fsp--;


                    			current = this_RobotStatusStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1395:3: this_TaskStatusStatement_1= ruleTaskStatusStatement
                    {

                    			newCompositeNode(grammarAccess.getStatusStatementAccess().getTaskStatusStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskStatusStatement_1=ruleTaskStatusStatement();

                    state._fsp--;


                    			current = this_TaskStatusStatement_1;
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
    // $ANTLR end "ruleStatusStatement"


    // $ANTLR start "entryRuleRobotStatusStatement"
    // InternalBehaviourLanguage.g:1407:1: entryRuleRobotStatusStatement returns [EObject current=null] : iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF ;
    public final EObject entryRuleRobotStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1407:61: (iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF )
            // InternalBehaviourLanguage.g:1408:2: iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF
            {
             newCompositeNode(grammarAccess.getRobotStatusStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotStatusStatement=ruleRobotStatusStatement();

            state._fsp--;

             current =iv_ruleRobotStatusStatement; 
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
    // $ANTLR end "entryRuleRobotStatusStatement"


    // $ANTLR start "ruleRobotStatusStatement"
    // InternalBehaviourLanguage.g:1414:1: ruleRobotStatusStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) ) ;
    public final EObject ruleRobotStatusStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1420:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) ) )
            // InternalBehaviourLanguage.g:1421:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1421:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) )
            // InternalBehaviourLanguage.g:1422:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) )
            {
            // InternalBehaviourLanguage.g:1422:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1423:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1423:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1424:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotStatusStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getRobotStatusStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotStatusStatementAccess().getSetKeyword_1());
            		
            // InternalBehaviourLanguage.g:1439:3: ( (lv_status_2_0= ruleRobotStatus ) )
            // InternalBehaviourLanguage.g:1440:4: (lv_status_2_0= ruleRobotStatus )
            {
            // InternalBehaviourLanguage.g:1440:4: (lv_status_2_0= ruleRobotStatus )
            // InternalBehaviourLanguage.g:1441:5: lv_status_2_0= ruleRobotStatus
            {

            					newCompositeNode(grammarAccess.getRobotStatusStatementAccess().getStatusRobotStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_status_2_0=ruleRobotStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotStatusStatementRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.RobotStatus");
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
    // $ANTLR end "ruleRobotStatusStatement"


    // $ANTLR start "entryRuleTaskStatusStatement"
    // InternalBehaviourLanguage.g:1462:1: entryRuleTaskStatusStatement returns [EObject current=null] : iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF ;
    public final EObject entryRuleTaskStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1462:60: (iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF )
            // InternalBehaviourLanguage.g:1463:2: iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF
            {
             newCompositeNode(grammarAccess.getTaskStatusStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskStatusStatement=ruleTaskStatusStatement();

            state._fsp--;

             current =iv_ruleTaskStatusStatement; 
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
    // $ANTLR end "entryRuleTaskStatusStatement"


    // $ANTLR start "ruleTaskStatusStatement"
    // InternalBehaviourLanguage.g:1469:1: ruleTaskStatusStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) ) ;
    public final EObject ruleTaskStatusStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1475:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) ) )
            // InternalBehaviourLanguage.g:1476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) )
            // InternalBehaviourLanguage.g:1477:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) )
            {
            // InternalBehaviourLanguage.g:1477:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1478:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1478:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1479:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskStatusStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getTaskStatusStatementAccess().getTaskTaskExecutionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskStatusStatementAccess().getSetKeyword_1());
            		
            // InternalBehaviourLanguage.g:1494:3: ( (lv_status_2_0= ruleTaskExecutionStatus ) )
            // InternalBehaviourLanguage.g:1495:4: (lv_status_2_0= ruleTaskExecutionStatus )
            {
            // InternalBehaviourLanguage.g:1495:4: (lv_status_2_0= ruleTaskExecutionStatus )
            // InternalBehaviourLanguage.g:1496:5: lv_status_2_0= ruleTaskExecutionStatus
            {

            					newCompositeNode(grammarAccess.getTaskStatusStatementAccess().getStatusTaskExecutionStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_status_2_0=ruleTaskExecutionStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskStatusStatementRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskExecutionStatus");
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
    // $ANTLR end "ruleTaskStatusStatement"


    // $ANTLR start "entryRuleMessageTarget"
    // InternalBehaviourLanguage.g:1517:1: entryRuleMessageTarget returns [EObject current=null] : iv_ruleMessageTarget= ruleMessageTarget EOF ;
    public final EObject entryRuleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTarget = null;


        try {
            // InternalBehaviourLanguage.g:1517:54: (iv_ruleMessageTarget= ruleMessageTarget EOF )
            // InternalBehaviourLanguage.g:1518:2: iv_ruleMessageTarget= ruleMessageTarget EOF
            {
             newCompositeNode(grammarAccess.getMessageTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageTarget=ruleMessageTarget();

            state._fsp--;

             current =iv_ruleMessageTarget; 
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
    // $ANTLR end "entryRuleMessageTarget"


    // $ANTLR start "ruleMessageTarget"
    // InternalBehaviourLanguage.g:1524:1: ruleMessageTarget returns [EObject current=null] : (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) ;
    public final EObject ruleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject this_UniTarget_0 = null;

        EObject this_MultiTarget_1 = null;

        EObject this_AllTarget_2 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1530:2: ( (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) )
            // InternalBehaviourLanguage.g:1531:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            {
            // InternalBehaviourLanguage.g:1531:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case 29:
                {
                alt27=2;
                }
                break;
            case 37:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalBehaviourLanguage.g:1532:3: this_UniTarget_0= ruleUniTarget
                    {

                    			newCompositeNode(grammarAccess.getMessageTargetAccess().getUniTargetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UniTarget_0=ruleUniTarget();

                    state._fsp--;


                    			current = this_UniTarget_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1541:3: this_MultiTarget_1= ruleMultiTarget
                    {

                    			newCompositeNode(grammarAccess.getMessageTargetAccess().getMultiTargetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiTarget_1=ruleMultiTarget();

                    state._fsp--;


                    			current = this_MultiTarget_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:1550:3: this_AllTarget_2= ruleAllTarget
                    {

                    			newCompositeNode(grammarAccess.getMessageTargetAccess().getAllTargetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllTarget_2=ruleAllTarget();

                    state._fsp--;


                    			current = this_AllTarget_2;
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
    // $ANTLR end "ruleMessageTarget"


    // $ANTLR start "entryRuleUniTarget"
    // InternalBehaviourLanguage.g:1562:1: entryRuleUniTarget returns [EObject current=null] : iv_ruleUniTarget= ruleUniTarget EOF ;
    public final EObject entryRuleUniTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniTarget = null;


        try {
            // InternalBehaviourLanguage.g:1562:50: (iv_ruleUniTarget= ruleUniTarget EOF )
            // InternalBehaviourLanguage.g:1563:2: iv_ruleUniTarget= ruleUniTarget EOF
            {
             newCompositeNode(grammarAccess.getUniTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniTarget=ruleUniTarget();

            state._fsp--;

             current =iv_ruleUniTarget; 
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
    // $ANTLR end "entryRuleUniTarget"


    // $ANTLR start "ruleUniTarget"
    // InternalBehaviourLanguage.g:1569:1: ruleUniTarget returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUniTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1575:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:1576:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:1576:2: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1577:3: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1577:3: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1578:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUniTargetRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getUniTargetAccess().getTargetDynamicRobotCrossReference_0());
            			

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
    // $ANTLR end "ruleUniTarget"


    // $ANTLR start "entryRuleMultiTarget"
    // InternalBehaviourLanguage.g:1592:1: entryRuleMultiTarget returns [EObject current=null] : iv_ruleMultiTarget= ruleMultiTarget EOF ;
    public final EObject entryRuleMultiTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiTarget = null;


        try {
            // InternalBehaviourLanguage.g:1592:52: (iv_ruleMultiTarget= ruleMultiTarget EOF )
            // InternalBehaviourLanguage.g:1593:2: iv_ruleMultiTarget= ruleMultiTarget EOF
            {
             newCompositeNode(grammarAccess.getMultiTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiTarget=ruleMultiTarget();

            state._fsp--;

             current =iv_ruleMultiTarget; 
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
    // $ANTLR end "entryRuleMultiTarget"


    // $ANTLR start "ruleMultiTarget"
    // InternalBehaviourLanguage.g:1599:1: ruleMultiTarget returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleMultiTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1605:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) )
            // InternalBehaviourLanguage.g:1606:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            {
            // InternalBehaviourLanguage.g:1606:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            // InternalBehaviourLanguage.g:1607:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiTargetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBehaviourLanguage.g:1611:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1612:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1612:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:1613:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_1, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1624:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:1625:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiTargetAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBehaviourLanguage.g:1629:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBehaviourLanguage.g:1630:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBehaviourLanguage.g:1630:5: (otherlv_3= RULE_ID )
            	    // InternalBehaviourLanguage.g:1631:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMultiTargetRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiTargetAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleMultiTarget"


    // $ANTLR start "entryRuleAllTarget"
    // InternalBehaviourLanguage.g:1651:1: entryRuleAllTarget returns [EObject current=null] : iv_ruleAllTarget= ruleAllTarget EOF ;
    public final EObject entryRuleAllTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllTarget = null;


        try {
            // InternalBehaviourLanguage.g:1651:50: (iv_ruleAllTarget= ruleAllTarget EOF )
            // InternalBehaviourLanguage.g:1652:2: iv_ruleAllTarget= ruleAllTarget EOF
            {
             newCompositeNode(grammarAccess.getAllTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllTarget=ruleAllTarget();

            state._fsp--;

             current =iv_ruleAllTarget; 
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
    // $ANTLR end "entryRuleAllTarget"


    // $ANTLR start "ruleAllTarget"
    // InternalBehaviourLanguage.g:1658:1: ruleAllTarget returns [EObject current=null] : ( (lv_target_0_0= '*' ) ) ;
    public final EObject ruleAllTarget() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1664:2: ( ( (lv_target_0_0= '*' ) ) )
            // InternalBehaviourLanguage.g:1665:2: ( (lv_target_0_0= '*' ) )
            {
            // InternalBehaviourLanguage.g:1665:2: ( (lv_target_0_0= '*' ) )
            // InternalBehaviourLanguage.g:1666:3: (lv_target_0_0= '*' )
            {
            // InternalBehaviourLanguage.g:1666:3: (lv_target_0_0= '*' )
            // InternalBehaviourLanguage.g:1667:4: lv_target_0_0= '*'
            {
            lv_target_0_0=(Token)match(input,37,FOLLOW_2); 

            				newLeafNode(lv_target_0_0, grammarAccess.getAllTargetAccess().getTargetAsteriskKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAllTargetRule());
            				}
            				setWithLastConsumed(current, "target", lv_target_0_0, "*");
            			

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
    // $ANTLR end "ruleAllTarget"


    // $ANTLR start "entryRuleCondition"
    // InternalBehaviourLanguage.g:1682:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBehaviourLanguage.g:1682:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBehaviourLanguage.g:1683:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalBehaviourLanguage.g:1689:1: ruleCondition returns [EObject current=null] : ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_compare_4_1=null;
        Token lv_compare_4_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_compare_9_1=null;
        Token lv_compare_9_2=null;
        Token lv_compare_12_1=null;
        Token lv_compare_12_2=null;
        Token lv_compare_12_3=null;
        Token lv_compare_12_4=null;
        Token lv_compare_12_5=null;
        Token lv_compare_12_6=null;
        Enumerator lv_rightStatus_5_0 = null;

        Enumerator lv_rightStatus_10_0 = null;

        EObject lv_leftMeasure_11_0 = null;

        EObject lv_rightMeasure_13_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1695:2: ( ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) ) )
            // InternalBehaviourLanguage.g:1696:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) )
            {
            // InternalBehaviourLanguage.g:1696:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1>=40 && LA32_1<=45)) ) {
                    alt32=3;
                }
                else if ( (LA32_1==38) ) {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==39) ) {
                        int LA32_4 = input.LA(4);

                        if ( (LA32_4==40) ) {
                            int LA32_5 = input.LA(5);

                            if ( ((LA32_5>=69 && LA32_5<=72)) ) {
                                alt32=2;
                            }
                            else if ( ((LA32_5>=73 && LA32_5<=77)) ) {
                                alt32=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA32_4==41) ) {
                            int LA32_6 = input.LA(5);

                            if ( ((LA32_6>=73 && LA32_6<=77)) ) {
                                alt32=1;
                            }
                            else if ( ((LA32_6>=69 && LA32_6<=72)) ) {
                                alt32=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA32_3==RULE_ID) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA32_0==RULE_STRING||LA32_0==58) ) {
                alt32=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalBehaviourLanguage.g:1697:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) )
                    {
                    // InternalBehaviourLanguage.g:1697:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) )
                    // InternalBehaviourLanguage.g:1698:4: () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) )
                    {
                    // InternalBehaviourLanguage.g:1698:4: ()
                    // InternalBehaviourLanguage.g:1699:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionAccess().getConditionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBehaviourLanguage.g:1705:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) )
                    // InternalBehaviourLanguage.g:1706:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) )
                    {
                    // InternalBehaviourLanguage.g:1706:5: ( (otherlv_1= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1707:6: (otherlv_1= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1707:6: (otherlv_1= RULE_ID )
                    // InternalBehaviourLanguage.g:1708:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConditionRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_39); 

                    							newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftTaskTaskExecutionCrossReference_0_1_0_0());
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_40); 

                    					newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getFullStopKeyword_0_1_1());
                    				
                    otherlv_3=(Token)match(input,39,FOLLOW_41); 

                    					newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getStatusKeyword_0_1_2());
                    				
                    // InternalBehaviourLanguage.g:1727:5: ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) )
                    // InternalBehaviourLanguage.g:1728:6: ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1728:6: ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) )
                    // InternalBehaviourLanguage.g:1729:7: (lv_compare_4_1= '==' | lv_compare_4_2= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1729:7: (lv_compare_4_1= '==' | lv_compare_4_2= '!=' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==40) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==41) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalBehaviourLanguage.g:1730:8: lv_compare_4_1= '=='
                            {
                            lv_compare_4_1=(Token)match(input,40,FOLLOW_37); 

                            								newLeafNode(lv_compare_4_1, grammarAccess.getConditionAccess().getCompareEqualsSignEqualsSignKeyword_0_1_3_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getConditionRule());
                            								}
                            								setWithLastConsumed(current, "compare", lv_compare_4_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:1741:8: lv_compare_4_2= '!='
                            {
                            lv_compare_4_2=(Token)match(input,41,FOLLOW_37); 

                            								newLeafNode(lv_compare_4_2, grammarAccess.getConditionAccess().getCompareExclamationMarkEqualsSignKeyword_0_1_3_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getConditionRule());
                            								}
                            								setWithLastConsumed(current, "compare", lv_compare_4_2, null);
                            							

                            }
                            break;

                    }


                    }


                    }

                    // InternalBehaviourLanguage.g:1754:5: ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) )
                    // InternalBehaviourLanguage.g:1755:6: (lv_rightStatus_5_0= ruleTaskExecutionStatus )
                    {
                    // InternalBehaviourLanguage.g:1755:6: (lv_rightStatus_5_0= ruleTaskExecutionStatus )
                    // InternalBehaviourLanguage.g:1756:7: lv_rightStatus_5_0= ruleTaskExecutionStatus
                    {

                    							newCompositeNode(grammarAccess.getConditionAccess().getRightStatusTaskExecutionStatusEnumRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_rightStatus_5_0=ruleTaskExecutionStatus();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    							}
                    							set(
                    								current,
                    								"rightStatus",
                    								lv_rightStatus_5_0,
                    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskExecutionStatus");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1776:3: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) )
                    {
                    // InternalBehaviourLanguage.g:1776:3: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) )
                    // InternalBehaviourLanguage.g:1777:4: ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) )
                    {
                    // InternalBehaviourLanguage.g:1777:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1778:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1778:5: (otherlv_6= RULE_ID )
                    // InternalBehaviourLanguage.g:1779:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getLeftRobotDynamicRobotCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getFullStopKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,39,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getStatusKeyword_1_2());
                    			
                    // InternalBehaviourLanguage.g:1798:4: ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) )
                    // InternalBehaviourLanguage.g:1799:5: ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1799:5: ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) )
                    // InternalBehaviourLanguage.g:1800:6: (lv_compare_9_1= '==' | lv_compare_9_2= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1800:6: (lv_compare_9_1= '==' | lv_compare_9_2= '!=' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==40) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==41) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalBehaviourLanguage.g:1801:7: lv_compare_9_1= '=='
                            {
                            lv_compare_9_1=(Token)match(input,40,FOLLOW_36); 

                            							newLeafNode(lv_compare_9_1, grammarAccess.getConditionAccess().getCompareEqualsSignEqualsSignKeyword_1_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:1812:7: lv_compare_9_2= '!='
                            {
                            lv_compare_9_2=(Token)match(input,41,FOLLOW_36); 

                            							newLeafNode(lv_compare_9_2, grammarAccess.getConditionAccess().getCompareExclamationMarkEqualsSignKeyword_1_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_9_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalBehaviourLanguage.g:1825:4: ( (lv_rightStatus_10_0= ruleRobotStatus ) )
                    // InternalBehaviourLanguage.g:1826:5: (lv_rightStatus_10_0= ruleRobotStatus )
                    {
                    // InternalBehaviourLanguage.g:1826:5: (lv_rightStatus_10_0= ruleRobotStatus )
                    // InternalBehaviourLanguage.g:1827:6: lv_rightStatus_10_0= ruleRobotStatus
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRightStatusRobotStatusEnumRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightStatus_10_0=ruleRobotStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"rightStatus",
                    							lv_rightStatus_10_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.RobotStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:1846:3: ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) )
                    {
                    // InternalBehaviourLanguage.g:1846:3: ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) )
                    // InternalBehaviourLanguage.g:1847:4: ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) )
                    {
                    // InternalBehaviourLanguage.g:1847:4: ( (lv_leftMeasure_11_0= ruleMeasureComparable ) )
                    // InternalBehaviourLanguage.g:1848:5: (lv_leftMeasure_11_0= ruleMeasureComparable )
                    {
                    // InternalBehaviourLanguage.g:1848:5: (lv_leftMeasure_11_0= ruleMeasureComparable )
                    // InternalBehaviourLanguage.g:1849:6: lv_leftMeasure_11_0= ruleMeasureComparable
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getLeftMeasureMeasureComparableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_leftMeasure_11_0=ruleMeasureComparable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"leftMeasure",
                    							lv_leftMeasure_11_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureComparable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1866:4: ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) )
                    // InternalBehaviourLanguage.g:1867:5: ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1867:5: ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) )
                    // InternalBehaviourLanguage.g:1868:6: (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1868:6: (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' )
                    int alt31=6;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt31=1;
                        }
                        break;
                    case 43:
                        {
                        alt31=2;
                        }
                        break;
                    case 44:
                        {
                        alt31=3;
                        }
                        break;
                    case 45:
                        {
                        alt31=4;
                        }
                        break;
                    case 40:
                        {
                        alt31=5;
                        }
                        break;
                    case 41:
                        {
                        alt31=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // InternalBehaviourLanguage.g:1869:7: lv_compare_12_1= '>'
                            {
                            lv_compare_12_1=(Token)match(input,42,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_1, grammarAccess.getConditionAccess().getCompareGreaterThanSignKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:1880:7: lv_compare_12_2= '<'
                            {
                            lv_compare_12_2=(Token)match(input,43,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_2, grammarAccess.getConditionAccess().getCompareLessThanSignKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalBehaviourLanguage.g:1891:7: lv_compare_12_3= '>='
                            {
                            lv_compare_12_3=(Token)match(input,44,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_3, grammarAccess.getConditionAccess().getCompareGreaterThanSignEqualsSignKeyword_2_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalBehaviourLanguage.g:1902:7: lv_compare_12_4= '<='
                            {
                            lv_compare_12_4=(Token)match(input,45,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_4, grammarAccess.getConditionAccess().getCompareLessThanSignEqualsSignKeyword_2_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalBehaviourLanguage.g:1913:7: lv_compare_12_5= '=='
                            {
                            lv_compare_12_5=(Token)match(input,40,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_5, grammarAccess.getConditionAccess().getCompareEqualsSignEqualsSignKeyword_2_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalBehaviourLanguage.g:1924:7: lv_compare_12_6= '!='
                            {
                            lv_compare_12_6=(Token)match(input,41,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_6, grammarAccess.getConditionAccess().getCompareExclamationMarkEqualsSignKeyword_2_1_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalBehaviourLanguage.g:1937:4: ( (lv_rightMeasure_13_0= ruleMeasureComparable ) )
                    // InternalBehaviourLanguage.g:1938:5: (lv_rightMeasure_13_0= ruleMeasureComparable )
                    {
                    // InternalBehaviourLanguage.g:1938:5: (lv_rightMeasure_13_0= ruleMeasureComparable )
                    // InternalBehaviourLanguage.g:1939:6: lv_rightMeasure_13_0= ruleMeasureComparable
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRightMeasureMeasureComparableParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightMeasure_13_0=ruleMeasureComparable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"rightMeasure",
                    							lv_rightMeasure_13_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureComparable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleMeasureComparable"
    // InternalBehaviourLanguage.g:1961:1: entryRuleMeasureComparable returns [EObject current=null] : iv_ruleMeasureComparable= ruleMeasureComparable EOF ;
    public final EObject entryRuleMeasureComparable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureComparable = null;


        try {
            // InternalBehaviourLanguage.g:1961:58: (iv_ruleMeasureComparable= ruleMeasureComparable EOF )
            // InternalBehaviourLanguage.g:1962:2: iv_ruleMeasureComparable= ruleMeasureComparable EOF
            {
             newCompositeNode(grammarAccess.getMeasureComparableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureComparable=ruleMeasureComparable();

            state._fsp--;

             current =iv_ruleMeasureComparable; 
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
    // $ANTLR end "entryRuleMeasureComparable"


    // $ANTLR start "ruleMeasureComparable"
    // InternalBehaviourLanguage.g:1968:1: ruleMeasureComparable returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) ) ;
    public final EObject ruleMeasureComparable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1974:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) ) )
            // InternalBehaviourLanguage.g:1975:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) )
            {
            // InternalBehaviourLanguage.g:1975:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EOF||(LA33_1>=22 && LA33_1<=23)||(LA33_1>=40 && LA33_1<=45)) ) {
                    alt33=2;
                }
                else if ( (LA33_1==38) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==RULE_STRING||LA33_0==58) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalBehaviourLanguage.g:1976:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalBehaviourLanguage.g:1976:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    // InternalBehaviourLanguage.g:1977:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalBehaviourLanguage.g:1977:4: ( (otherlv_0= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1978:5: (otherlv_0= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1978:5: (otherlv_0= RULE_ID )
                    // InternalBehaviourLanguage.g:1979:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureComparableRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_0, grammarAccess.getMeasureComparableAccess().getContainerDynamicRobotCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,38,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getMeasureComparableAccess().getFullStopKeyword_0_1());
                    			
                    // InternalBehaviourLanguage.g:1994:4: ( (otherlv_2= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1995:5: (otherlv_2= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1995:5: (otherlv_2= RULE_ID )
                    // InternalBehaviourLanguage.g:1996:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureComparableRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getMeasureComparableAccess().getMemberPropertyKeyCrossReference_0_2_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:2009:3: ( (lv_value_3_0= rulePropertyValue ) )
                    {
                    // InternalBehaviourLanguage.g:2009:3: ( (lv_value_3_0= rulePropertyValue ) )
                    // InternalBehaviourLanguage.g:2010:4: (lv_value_3_0= rulePropertyValue )
                    {
                    // InternalBehaviourLanguage.g:2010:4: (lv_value_3_0= rulePropertyValue )
                    // InternalBehaviourLanguage.g:2011:5: lv_value_3_0= rulePropertyValue
                    {

                    					newCompositeNode(grammarAccess.getMeasureComparableAccess().getValuePropertyValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=rulePropertyValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMeasureComparableRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"hu.bme.mdsd.ztz.text.BehaviourLanguage.PropertyValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleMeasureComparable"


    // $ANTLR start "entryRuleTaskExecution"
    // InternalBehaviourLanguage.g:2032:1: entryRuleTaskExecution returns [EObject current=null] : iv_ruleTaskExecution= ruleTaskExecution EOF ;
    public final EObject entryRuleTaskExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskExecution = null;


        try {
            // InternalBehaviourLanguage.g:2032:54: (iv_ruleTaskExecution= ruleTaskExecution EOF )
            // InternalBehaviourLanguage.g:2033:2: iv_ruleTaskExecution= ruleTaskExecution EOF
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
    // InternalBehaviourLanguage.g:2039:1: ruleTaskExecution returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleTaskExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_executionTime_5_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2045:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalBehaviourLanguage.g:2046:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalBehaviourLanguage.g:2046:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalBehaviourLanguage.g:2047:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalBehaviourLanguage.g:2047:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2048:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2048:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:2049:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskExecutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskExecutionAccess().getColonKeyword_1());
            		
            // InternalBehaviourLanguage.g:2070:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:2071:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2071:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:2072:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskExecutionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getTaskExecutionAccess().getTaskTaskCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:2087:3: (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBehaviourLanguage.g:2088:4: otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskExecutionAccess().getExecutionTimeKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:2092:4: ( (lv_executionTime_5_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:2093:5: (lv_executionTime_5_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:2093:5: (lv_executionTime_5_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:2094:6: lv_executionTime_5_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutionTimeMeasureValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_executionTime_5_0=ruleMeasureValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskExecutionRule());
                    						}
                    						set(
                    							current,
                    							"executionTime",
                    							lv_executionTime_5_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2112:3: (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBehaviourLanguage.g:2113:4: otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskExecutionAccess().getRequirementKeyword_5_0());
                    			
                    // InternalBehaviourLanguage.g:2117:4: ( (otherlv_7= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2118:5: (otherlv_7= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2118:5: (otherlv_7= RULE_ID )
                    // InternalBehaviourLanguage.g:2119:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskExecutionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_7, grammarAccess.getTaskExecutionAccess().getRequirementTaskRequirementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskExecutionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalBehaviourLanguage.g:2139:1: entryRuleTaskRequirement returns [EObject current=null] : iv_ruleTaskRequirement= ruleTaskRequirement EOF ;
    public final EObject entryRuleTaskRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequirement = null;


        try {
            // InternalBehaviourLanguage.g:2139:56: (iv_ruleTaskRequirement= ruleTaskRequirement EOF )
            // InternalBehaviourLanguage.g:2140:2: iv_ruleTaskRequirement= ruleTaskRequirement EOF
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
    // InternalBehaviourLanguage.g:2146:1: ruleTaskRequirement returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleTaskRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_participants_4_0 = null;

        EObject lv_properties_17_0 = null;

        EObject lv_properties_19_0 = null;

        EObject lv_capabilityProperties_23_0 = null;

        EObject lv_capabilityProperties_25_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2152:2: ( (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalBehaviourLanguage.g:2153:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalBehaviourLanguage.g:2153:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalBehaviourLanguage.g:2154:3: otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRequirementAccess().getNameKeyword_1());
            		
            // InternalBehaviourLanguage.g:2162:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2163:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2163:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:2164:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRequirementAccess().getParticipantsKeyword_3());
            		
            // InternalBehaviourLanguage.g:2185:3: ( (lv_participants_4_0= ruleEInt ) )
            // InternalBehaviourLanguage.g:2186:4: (lv_participants_4_0= ruleEInt )
            {
            // InternalBehaviourLanguage.g:2186:4: (lv_participants_4_0= ruleEInt )
            // InternalBehaviourLanguage.g:2187:5: lv_participants_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getParticipantsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_48);
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

            otherlv_5=(Token)match(input,50,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskRequirementAccess().getTaskExecutionKeyword_5());
            		
            // InternalBehaviourLanguage.g:2208:3: ( (otherlv_6= RULE_ID ) )
            // InternalBehaviourLanguage.g:2209:4: (otherlv_6= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2209:4: (otherlv_6= RULE_ID )
            // InternalBehaviourLanguage.g:2210:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRequirementRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_6, grammarAccess.getTaskRequirementAccess().getTaskExecutionTaskExecutionCrossReference_6_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2221:3: (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBehaviourLanguage.g:2222:4: otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskRequirementAccess().getPrerequisiteKeyword_7_0());
                    			
                    // InternalBehaviourLanguage.g:2226:4: ( (otherlv_8= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2227:5: (otherlv_8= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2227:5: (otherlv_8= RULE_ID )
                    // InternalBehaviourLanguage.g:2228:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_50); 

                    						newLeafNode(otherlv_8, grammarAccess.getTaskRequirementAccess().getPrerequisiteTaskExecutionCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2240:3: (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBehaviourLanguage.g:2241:4: otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,52,FOLLOW_51); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskRequirementAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:2249:4: ( (otherlv_11= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2250:5: (otherlv_11= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2250:5: (otherlv_11= RULE_ID )
                    // InternalBehaviourLanguage.g:2251:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(otherlv_11, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_2_0());
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2262:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2263:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTaskRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2267:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalBehaviourLanguage.g:2268:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalBehaviourLanguage.g:2268:6: (otherlv_13= RULE_ID )
                    	    // InternalBehaviourLanguage.g:2269:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_38); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,30,FOLLOW_52); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskRequirementAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2286:3: (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBehaviourLanguage.g:2287:4: otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,53,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskRequirementAccess().getPropertiesKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBehaviourLanguage.g:2295:4: ( (lv_properties_17_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2296:5: (lv_properties_17_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2296:5: (lv_properties_17_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2297:6: lv_properties_17_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBehaviourLanguage.g:2314:4: (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2315:5: otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getTaskRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2319:5: ( (lv_properties_19_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2320:6: (lv_properties_19_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2320:6: (lv_properties_19_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2321:7: lv_properties_19_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_53); 

                    				newLeafNode(otherlv_20, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2344:3: (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBehaviourLanguage.g:2345:4: otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,54,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,13,FOLLOW_54); 

                    				newLeafNode(otherlv_22, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBehaviourLanguage.g:2353:4: ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) )
                    // InternalBehaviourLanguage.g:2354:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    {
                    // InternalBehaviourLanguage.g:2354:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    // InternalBehaviourLanguage.g:2355:6: lv_capabilityProperties_23_0= ruleCapabilityProperties
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBehaviourLanguage.g:2372:4: (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2373:5: otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_54); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getTaskRequirementAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2377:5: ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    // InternalBehaviourLanguage.g:2378:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    {
                    	    // InternalBehaviourLanguage.g:2378:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    // InternalBehaviourLanguage.g:2379:7: lv_capabilityProperties_25_0= ruleCapabilityProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_13); 

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
    // InternalBehaviourLanguage.g:2410:1: entryRuleBehaviouralPropertyKeyContainer returns [EObject current=null] : iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF ;
    public final EObject entryRuleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralPropertyKeyContainer = null;


        try {
            // InternalBehaviourLanguage.g:2410:72: (iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF )
            // InternalBehaviourLanguage.g:2411:2: iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF
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
    // InternalBehaviourLanguage.g:2417:1: ruleBehaviouralPropertyKeyContainer returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keys_2_0 = null;

        EObject lv_keys_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2423:2: ( ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' ) )
            // InternalBehaviourLanguage.g:2424:2: ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' )
            {
            // InternalBehaviourLanguage.g:2424:2: ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' )
            // InternalBehaviourLanguage.g:2425:3: () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}'
            {
            // InternalBehaviourLanguage.g:2425:3: ()
            // InternalBehaviourLanguage.g:2426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:2436:3: ( (lv_keys_2_0= rulePropertyKey ) )
            // InternalBehaviourLanguage.g:2437:4: (lv_keys_2_0= rulePropertyKey )
            {
            // InternalBehaviourLanguage.g:2437:4: (lv_keys_2_0= rulePropertyKey )
            // InternalBehaviourLanguage.g:2438:5: lv_keys_2_0= rulePropertyKey
            {

            					newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_keys_2_0=rulePropertyKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviouralPropertyKeyContainerRule());
            					}
            					add(
            						current,
            						"keys",
            						lv_keys_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.PropertyKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:2455:3: (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==15) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:2456:4: otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:2460:4: ( (lv_keys_4_0= rulePropertyKey ) )
            	    // InternalBehaviourLanguage.g:2461:5: (lv_keys_4_0= rulePropertyKey )
            	    {
            	    // InternalBehaviourLanguage.g:2461:5: (lv_keys_4_0= rulePropertyKey )
            	    // InternalBehaviourLanguage.g:2462:6: lv_keys_4_0= rulePropertyKey
            	    {

            	    						newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_keys_4_0=rulePropertyKey();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBehaviouralPropertyKeyContainerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"keys",
            	    							lv_keys_4_0,
            	    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.PropertyKey");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalBehaviourLanguage.g:2488:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBehaviourLanguage.g:2488:47: (iv_ruleEString= ruleEString EOF )
            // InternalBehaviourLanguage.g:2489:2: iv_ruleEString= ruleEString EOF
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
    // InternalBehaviourLanguage.g:2495:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2501:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2502:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2502:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalBehaviourLanguage.g:2503:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:2511:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRobotCollaboration"
    // InternalBehaviourLanguage.g:2522:1: entryRuleRobotCollaboration returns [EObject current=null] : iv_ruleRobotCollaboration= ruleRobotCollaboration EOF ;
    public final EObject entryRuleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotCollaboration = null;


        try {
            // InternalBehaviourLanguage.g:2522:59: (iv_ruleRobotCollaboration= ruleRobotCollaboration EOF )
            // InternalBehaviourLanguage.g:2523:2: iv_ruleRobotCollaboration= ruleRobotCollaboration EOF
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
    // InternalBehaviourLanguage.g:2529:1: ruleRobotCollaboration returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_3_0 = null;

        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2535:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? ) )
            // InternalBehaviourLanguage.g:2536:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? )
            {
            // InternalBehaviourLanguage.g:2536:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? )
            // InternalBehaviourLanguage.g:2537:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )?
            {
            // InternalBehaviourLanguage.g:2537:3: ()
            // InternalBehaviourLanguage.g:2538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotCollaborationAccess().getRobotCollaborationAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:2544:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2545:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2545:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:2546:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotCollaborationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getRobotCollaborationAccess().getCollaboratorDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2557:3: (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==13) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBehaviourLanguage.g:2558:4: otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:2562:4: ( (lv_properties_3_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2563:5: (lv_properties_3_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2563:5: (lv_properties_3_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2564:6: lv_properties_3_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_3_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotCollaborationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_3_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2581:4: (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==15) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2582:5: otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRobotCollaborationAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2586:5: ( (lv_properties_5_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2587:6: (lv_properties_5_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2587:6: (lv_properties_5_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2588:7: lv_properties_5_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_properties_5_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotCollaborationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_5_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRobotCollaborationAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleRobotCollaboration"


    // $ANTLR start "entryRuleProperty"
    // InternalBehaviourLanguage.g:2615:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBehaviourLanguage.g:2615:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBehaviourLanguage.g:2616:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalBehaviourLanguage.g:2622:1: ruleProperty returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2628:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' ) )
            // InternalBehaviourLanguage.g:2629:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' )
            {
            // InternalBehaviourLanguage.g:2629:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' )
            // InternalBehaviourLanguage.g:2630:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBehaviourLanguage.g:2634:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2635:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2635:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:2636:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getKeyPropertyKeyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
            		
            // InternalBehaviourLanguage.g:2651:3: ( (lv_value_3_0= rulePropertyValue ) )
            // InternalBehaviourLanguage.g:2652:4: (lv_value_3_0= rulePropertyValue )
            {
            // InternalBehaviourLanguage.g:2652:4: (lv_value_3_0= rulePropertyValue )
            // InternalBehaviourLanguage.g:2653:5: lv_value_3_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
            lv_value_3_0=rulePropertyValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.PropertyValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getRightSquareBracketKeyword_4());
            		

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
    // InternalBehaviourLanguage.g:2678:1: entryRuleMeasureValue returns [EObject current=null] : iv_ruleMeasureValue= ruleMeasureValue EOF ;
    public final EObject entryRuleMeasureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue = null;


        try {
            // InternalBehaviourLanguage.g:2678:53: (iv_ruleMeasureValue= ruleMeasureValue EOF )
            // InternalBehaviourLanguage.g:2679:2: iv_ruleMeasureValue= ruleMeasureValue EOF
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
    // InternalBehaviourLanguage.g:2685:1: ruleMeasureValue returns [EObject current=null] : (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMeasureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2691:2: ( (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:2692:2: (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:2692:2: (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:2693:3: otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureValueAccess().getMeasureKeyword_0());
            		
            // InternalBehaviourLanguage.g:2697:3: ( (lv_value_1_0= ruleEFloat ) )
            // InternalBehaviourLanguage.g:2698:4: (lv_value_1_0= ruleEFloat )
            {
            // InternalBehaviourLanguage.g:2698:4: (lv_value_1_0= ruleEFloat )
            // InternalBehaviourLanguage.g:2699:5: lv_value_1_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getMeasureValueAccess().getValueEFloatParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
            lv_value_1_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasureValueAccess().getInKeyword_2());
            		
            // InternalBehaviourLanguage.g:2720:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:2721:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2721:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:2722:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureValueRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getMeasureValueAccess().getDimensionMeasureDimensionCrossReference_3_0());
            				

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
    // $ANTLR end "ruleMeasureValue"


    // $ANTLR start "entryRuleCapabilityProperties"
    // InternalBehaviourLanguage.g:2737:1: entryRuleCapabilityProperties returns [EObject current=null] : iv_ruleCapabilityProperties= ruleCapabilityProperties EOF ;
    public final EObject entryRuleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperties = null;


        try {
            // InternalBehaviourLanguage.g:2737:61: (iv_ruleCapabilityProperties= ruleCapabilityProperties EOF )
            // InternalBehaviourLanguage.g:2738:2: iv_ruleCapabilityProperties= ruleCapabilityProperties EOF
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
    // InternalBehaviourLanguage.g:2744:1: ruleCapabilityProperties returns [EObject current=null] : (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2750:2: ( (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalBehaviourLanguage.g:2751:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalBehaviourLanguage.g:2751:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalBehaviourLanguage.g:2752:3: otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertiesAccess().getCapabilityPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,61,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertiesAccess().getCapabilityKeyword_2());
            		
            // InternalBehaviourLanguage.g:2764:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:2765:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2765:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:2766:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityPropertiesRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_3, grammarAccess.getCapabilityPropertiesAccess().getCapabilityCapabilityCrossReference_3_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2777:3: (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBehaviourLanguage.g:2778:4: otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:2782:4: ( (lv_properties_5_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2783:5: (lv_properties_5_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2783:5: (lv_properties_5_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2784:6: lv_properties_5_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_5_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityPropertiesRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_5_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2801:4: (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==15) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2802:5: otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertiesAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2806:5: ( (lv_properties_7_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2807:6: (lv_properties_7_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2807:6: (lv_properties_7_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2808:7: lv_properties_7_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_properties_7_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCapabilityPropertiesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_7_0,
                    	    								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertiesAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCapabilityPropertiesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalBehaviourLanguage.g:2839:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBehaviourLanguage.g:2839:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBehaviourLanguage.g:2840:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBehaviourLanguage.g:2846:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2852:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBehaviourLanguage.g:2853:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBehaviourLanguage.g:2853:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBehaviourLanguage.g:2854:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBehaviourLanguage.g:2854:3: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==62) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBehaviourLanguage.g:2855:4: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_61); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2861:3: (this_INT_1= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBehaviourLanguage.g:2862:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_39); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,38,FOLLOW_62); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_63); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBehaviourLanguage.g:2882:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=63 && LA53_0<=64)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBehaviourLanguage.g:2883:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBehaviourLanguage.g:2883:4: (kw= 'E' | kw= 'e' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==63) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==64) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2884:5: kw= 'E'
                            {
                            kw=(Token)match(input,63,FOLLOW_47); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:2890:5: kw= 'e'
                            {
                            kw=(Token)match(input,64,FOLLOW_47); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2896:4: (kw= '-' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==62) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2897:5: kw= '-'
                            {
                            kw=(Token)match(input,62,FOLLOW_62); 

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
    // InternalBehaviourLanguage.g:2922:1: rulePropertyKey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePropertyKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2928:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBehaviourLanguage.g:2929:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBehaviourLanguage.g:2929:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2930:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2930:3: ()
            // InternalBehaviourLanguage.g:2931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyKeyAccess().getPropertyKeyAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:2937:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2938:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2938:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:2939:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyKeyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyKeyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalBehaviourLanguage.g:2960:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBehaviourLanguage.g:2960:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBehaviourLanguage.g:2961:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalBehaviourLanguage.g:2967:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2973:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2974:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2974:2: ( (lv_value_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2975:3: (lv_value_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2975:3: (lv_value_0_0= ruleEString )
            // InternalBehaviourLanguage.g:2976:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleMessage"
    // InternalBehaviourLanguage.g:2996:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBehaviourLanguage.g:2996:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBehaviourLanguage.g:2997:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalBehaviourLanguage.g:3003:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_properties_18_0 = null;

        EObject lv_properties_20_0 = null;

        EObject lv_TTL_23_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3009:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) )
            // InternalBehaviourLanguage.g:3010:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            {
            // InternalBehaviourLanguage.g:3010:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            // InternalBehaviourLanguage.g:3011:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            {
            // InternalBehaviourLanguage.g:3011:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:3012:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:3012:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:3013:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:3030:3: (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==13) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBehaviourLanguage.g:3031:4: otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_64); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalBehaviourLanguage.g:3035:4: (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==17) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3036:5: otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_51); 

                            					newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getTaskExecutionsKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,29,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_1_1());
                            				
                            // InternalBehaviourLanguage.g:3044:5: ( (otherlv_4= RULE_ID ) )
                            // InternalBehaviourLanguage.g:3045:6: (otherlv_4= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:3045:6: (otherlv_4= RULE_ID )
                            // InternalBehaviourLanguage.g:3046:7: otherlv_4= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

                            							newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:3057:5: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==15) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:3058:6: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                            	    {
                            	    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getCommaKeyword_1_1_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:3062:6: ( (otherlv_6= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:3063:7: (otherlv_6= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:3063:7: (otherlv_6= RULE_ID )
                            	    // InternalBehaviourLanguage.g:3064:8: otherlv_6= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_38); 

                            	    								newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,30,FOLLOW_65); 

                            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_1_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3081:4: (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==65) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3082:5: otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
                            {
                            otherlv_8=(Token)match(input,65,FOLLOW_51); 

                            					newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getObjectsKeyword_1_2_0());
                            				
                            otherlv_9=(Token)match(input,29,FOLLOW_15); 

                            					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_2_1());
                            				
                            // InternalBehaviourLanguage.g:3090:5: ( (otherlv_10= RULE_ID ) )
                            // InternalBehaviourLanguage.g:3091:6: (otherlv_10= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:3091:6: (otherlv_10= RULE_ID )
                            // InternalBehaviourLanguage.g:3092:7: otherlv_10= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_38); 

                            							newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:3103:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==15) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:3104:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                            	    {
                            	    otherlv_11=(Token)match(input,15,FOLLOW_15); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getCommaKeyword_1_2_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:3108:6: ( (otherlv_12= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:3109:7: (otherlv_12= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:3109:7: (otherlv_12= RULE_ID )
                            	    // InternalBehaviourLanguage.g:3110:8: otherlv_12= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_38); 

                            	    								newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,30,FOLLOW_66); 

                            					newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_2_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3127:4: (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==66) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3128:5: otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) )
                            {
                            otherlv_14=(Token)match(input,66,FOLLOW_15); 

                            					newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getFollowsKeyword_1_3_0());
                            				
                            // InternalBehaviourLanguage.g:3132:5: ( (otherlv_15= RULE_ID ) )
                            // InternalBehaviourLanguage.g:3133:6: (otherlv_15= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:3133:6: (otherlv_15= RULE_ID )
                            // InternalBehaviourLanguage.g:3134:7: otherlv_15= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_67); 

                            							newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getFollowsMessageCrossReference_1_3_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3146:4: (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==67) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3147:5: otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}'
                            {
                            otherlv_16=(Token)match(input,67,FOLLOW_6); 

                            					newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getPropertiesKeyword_1_4_0());
                            				
                            otherlv_17=(Token)match(input,13,FOLLOW_27); 

                            					newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_4_1());
                            				
                            // InternalBehaviourLanguage.g:3155:5: ( (lv_properties_18_0= ruleProperty ) )
                            // InternalBehaviourLanguage.g:3156:6: (lv_properties_18_0= ruleProperty )
                            {
                            // InternalBehaviourLanguage.g:3156:6: (lv_properties_18_0= ruleProperty )
                            // InternalBehaviourLanguage.g:3157:7: lv_properties_18_0= ruleProperty
                            {

                            							newCompositeNode(grammarAccess.getMessageAccess().getPropertiesPropertyParserRuleCall_1_4_2_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_properties_18_0=ruleProperty();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageRule());
                            							}
                            							add(
                            								current,
                            								"properties",
                            								lv_properties_18_0,
                            								"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:3174:5: (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==15) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:3175:6: otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) )
                            	    {
                            	    otherlv_19=(Token)match(input,15,FOLLOW_27); 

                            	    						newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getCommaKeyword_1_4_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:3179:6: ( (lv_properties_20_0= ruleProperty ) )
                            	    // InternalBehaviourLanguage.g:3180:7: (lv_properties_20_0= ruleProperty )
                            	    {
                            	    // InternalBehaviourLanguage.g:3180:7: (lv_properties_20_0= ruleProperty )
                            	    // InternalBehaviourLanguage.g:3181:8: lv_properties_20_0= ruleProperty
                            	    {

                            	    								newCompositeNode(grammarAccess.getMessageAccess().getPropertiesPropertyParserRuleCall_1_4_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_properties_20_0=ruleProperty();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMessageRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"properties",
                            	    									lv_properties_20_0,
                            	    									"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop59;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,16,FOLLOW_68); 

                            					newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_1_4_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3204:4: (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==68) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3205:5: otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) )
                            {
                            otherlv_22=(Token)match(input,68,FOLLOW_16); 

                            					newLeafNode(otherlv_22, grammarAccess.getMessageAccess().getTTLKeyword_1_5_0());
                            				
                            // InternalBehaviourLanguage.g:3209:5: ( (lv_TTL_23_0= ruleMeasureValue ) )
                            // InternalBehaviourLanguage.g:3210:6: (lv_TTL_23_0= ruleMeasureValue )
                            {
                            // InternalBehaviourLanguage.g:3210:6: (lv_TTL_23_0= ruleMeasureValue )
                            // InternalBehaviourLanguage.g:3211:7: lv_TTL_23_0= ruleMeasureValue
                            {

                            							newCompositeNode(grammarAccess.getMessageAccess().getTTLMeasureValueParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_TTL_23_0=ruleMeasureValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageRule());
                            							}
                            							set(
                            								current,
                            								"TTL",
                            								lv_TTL_23_0,
                            								"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_1_6());
                    			

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleEInt"
    // InternalBehaviourLanguage.g:3238:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBehaviourLanguage.g:3238:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBehaviourLanguage.g:3239:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBehaviourLanguage.g:3245:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3251:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBehaviourLanguage.g:3252:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBehaviourLanguage.g:3252:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBehaviourLanguage.g:3253:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBehaviourLanguage.g:3253:3: (kw= '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==62) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBehaviourLanguage.g:3254:4: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_62); 

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
    // InternalBehaviourLanguage.g:3271:1: ruleRobotStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) ) ;
    public final Enumerator ruleRobotStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3277:2: ( ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) ) )
            // InternalBehaviourLanguage.g:3278:2: ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) )
            {
            // InternalBehaviourLanguage.g:3278:2: ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt64=1;
                }
                break;
            case 70:
                {
                alt64=2;
                }
                break;
            case 71:
                {
                alt64=3;
                }
                break;
            case 72:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalBehaviourLanguage.g:3279:3: (enumLiteral_0= 'RobotReady' )
                    {
                    // InternalBehaviourLanguage.g:3279:3: (enumLiteral_0= 'RobotReady' )
                    // InternalBehaviourLanguage.g:3280:4: enumLiteral_0= 'RobotReady'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:3287:3: (enumLiteral_1= 'RobotTurnedOff' )
                    {
                    // InternalBehaviourLanguage.g:3287:3: (enumLiteral_1= 'RobotTurnedOff' )
                    // InternalBehaviourLanguage.g:3288:4: enumLiteral_1= 'RobotTurnedOff'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:3295:3: (enumLiteral_2= 'RobotWaiting' )
                    {
                    // InternalBehaviourLanguage.g:3295:3: (enumLiteral_2= 'RobotWaiting' )
                    // InternalBehaviourLanguage.g:3296:4: enumLiteral_2= 'RobotWaiting'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:3303:3: (enumLiteral_3= 'RobotExecuting' )
                    {
                    // InternalBehaviourLanguage.g:3303:3: (enumLiteral_3= 'RobotExecuting' )
                    // InternalBehaviourLanguage.g:3304:4: enumLiteral_3= 'RobotExecuting'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:3314:1: ruleTaskExecutionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) ) ;
    public final Enumerator ruleTaskExecutionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3320:2: ( ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) ) )
            // InternalBehaviourLanguage.g:3321:2: ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) )
            {
            // InternalBehaviourLanguage.g:3321:2: ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) )
            int alt65=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt65=1;
                }
                break;
            case 74:
                {
                alt65=2;
                }
                break;
            case 75:
                {
                alt65=3;
                }
                break;
            case 76:
                {
                alt65=4;
                }
                break;
            case 77:
                {
                alt65=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalBehaviourLanguage.g:3322:3: (enumLiteral_0= 'TaskReady' )
                    {
                    // InternalBehaviourLanguage.g:3322:3: (enumLiteral_0= 'TaskReady' )
                    // InternalBehaviourLanguage.g:3323:4: enumLiteral_0= 'TaskReady'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:3330:3: (enumLiteral_1= 'TaskFinished' )
                    {
                    // InternalBehaviourLanguage.g:3330:3: (enumLiteral_1= 'TaskFinished' )
                    // InternalBehaviourLanguage.g:3331:4: enumLiteral_1= 'TaskFinished'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:3338:3: (enumLiteral_2= 'TaskSuspended' )
                    {
                    // InternalBehaviourLanguage.g:3338:3: (enumLiteral_2= 'TaskSuspended' )
                    // InternalBehaviourLanguage.g:3339:4: enumLiteral_2= 'TaskSuspended'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:3346:3: (enumLiteral_3= 'TaskInProgress' )
                    {
                    // InternalBehaviourLanguage.g:3346:3: (enumLiteral_3= 'TaskInProgress' )
                    // InternalBehaviourLanguage.g:3347:4: enumLiteral_3= 'TaskInProgress'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:3354:3: (enumLiteral_4= 'TaskWaiting' )
                    {
                    // InternalBehaviourLanguage.g:3354:3: (enumLiteral_4= 'TaskWaiting' )
                    // InternalBehaviourLanguage.g:3355:4: enumLiteral_4= 'TaskWaiting'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000006200022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0400000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006200020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006210020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002020000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003E00L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000C00000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0078000000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0070000000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0060000000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000004000000040L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000030000L,0x000000000000001EL});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000010000L,0x000000000000001EL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000010000L,0x000000000000001CL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000018L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000010L});

}