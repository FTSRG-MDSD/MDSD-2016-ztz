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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Declaration'", "'{'", "'DynamicRobots'", "','", "'}'", "'TaskExecutions'", "'TaskRequirements'", "'Keys'", "':'", "'if'", "'or'", "'then'", "'else'", "'sync'", "'action'", "'do'", "'->'", "'('", "')'", "'['", "']'", "'send'", "'know'", "'detect'", "'obstacle'", "'exec'", "'set'", "'*'", "'.'", "'status'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'executionTime'", "'requirement'", "'name'", "'participants'", "'taskExecution'", "'prerequisite'", "'requiredCapabilities'", "'properties'", "'capabilityProperties'", "'='", "'measure '", "'in'", "'CapabilityProperties'", "'capability'", "'-'", "'E'", "'e'", "'Objects'", "'Follows'", "'Properties'", "'TTL'", "'RobotReady'", "'RobotTurnedOff'", "'RobotWaiting'", "'RobotExecuting'", "'TaskReady'", "'TaskFinished'", "'TaskSuspended'", "'TaskInProgress'", "'TaskWaiting'"
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
                case 35:
                    {
                    alt11=4;
                    }
                    break;
                case 38:
                    {
                    alt11=6;
                    }
                    break;
                case 37:
                    {
                    alt11=5;
                    }
                    break;
                case 27:
                    {
                    alt11=1;
                    }
                    break;
                case 34:
                    {
                    alt11=3;
                    }
                    break;
                case 33:
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
            	        case 33:
            	            {
            	            alt16=2;
            	            }
            	            break;
            	        case 35:
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
    // InternalBehaviourLanguage.g:1003:1: ruleActionImplementation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? ) ;
    public final EObject ruleActionImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1009:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? ) )
            // InternalBehaviourLanguage.g:1010:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? )
            {
            // InternalBehaviourLanguage.g:1010:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? )
            // InternalBehaviourLanguage.g:1011:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? (otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )?
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

                    otherlv_3=(Token)match(input,30,FOLLOW_27); 

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
                    otherlv_4=(Token)match(input,13,FOLLOW_28); 

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
                    	    otherlv_6=(Token)match(input,15,FOLLOW_28); 

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

                    otherlv_8=(Token)match(input,16,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionImplementationAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1101:3: (otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBehaviourLanguage.g:1102:4: otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']'
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionImplementationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalBehaviourLanguage.g:1106:4: ( (otherlv_10= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1107:5: (otherlv_10= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1107:5: (otherlv_10= RULE_ID )
                    // InternalBehaviourLanguage.g:1108:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionImplementationRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_10, grammarAccess.getActionImplementationAccess().getTargetsAreaObjectCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1119:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1120:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getActionImplementationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1124:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalBehaviourLanguage.g:1125:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalBehaviourLanguage.g:1125:6: (otherlv_12= RULE_ID )
                    	    // InternalBehaviourLanguage.g:1126:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActionImplementationRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_30); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getActionImplementationAccess().getTargetsAreaObjectCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionImplementationAccess().getRightSquareBracketKeyword_3_3());
                    			

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
    // InternalBehaviourLanguage.g:1147:1: entryRuleMessageStatement returns [EObject current=null] : iv_ruleMessageStatement= ruleMessageStatement EOF ;
    public final EObject entryRuleMessageStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStatement = null;


        try {
            // InternalBehaviourLanguage.g:1147:57: (iv_ruleMessageStatement= ruleMessageStatement EOF )
            // InternalBehaviourLanguage.g:1148:2: iv_ruleMessageStatement= ruleMessageStatement EOF
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
    // InternalBehaviourLanguage.g:1154:1: ruleMessageStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) ;
    public final EObject ruleMessageStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_target_2_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1160:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) )
            // InternalBehaviourLanguage.g:1161:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            {
            // InternalBehaviourLanguage.g:1161:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            // InternalBehaviourLanguage.g:1162:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) )
            {
            // InternalBehaviourLanguage.g:1162:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1163:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1163:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1164:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_0, grammarAccess.getMessageStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageStatementAccess().getSendKeyword_1());
            		
            // InternalBehaviourLanguage.g:1179:3: ( (lv_target_2_0= ruleMessageTarget ) )
            // InternalBehaviourLanguage.g:1180:4: (lv_target_2_0= ruleMessageTarget )
            {
            // InternalBehaviourLanguage.g:1180:4: (lv_target_2_0= ruleMessageTarget )
            // InternalBehaviourLanguage.g:1181:5: lv_target_2_0= ruleMessageTarget
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

            // InternalBehaviourLanguage.g:1198:3: ( (lv_message_3_0= ruleMessage ) )
            // InternalBehaviourLanguage.g:1199:4: (lv_message_3_0= ruleMessage )
            {
            // InternalBehaviourLanguage.g:1199:4: (lv_message_3_0= ruleMessage )
            // InternalBehaviourLanguage.g:1200:5: lv_message_3_0= ruleMessage
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
    // InternalBehaviourLanguage.g:1221:1: entryRuleCollaborationStatement returns [EObject current=null] : iv_ruleCollaborationStatement= ruleCollaborationStatement EOF ;
    public final EObject entryRuleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollaborationStatement = null;


        try {
            // InternalBehaviourLanguage.g:1221:63: (iv_ruleCollaborationStatement= ruleCollaborationStatement EOF )
            // InternalBehaviourLanguage.g:1222:2: iv_ruleCollaborationStatement= ruleCollaborationStatement EOF
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
    // InternalBehaviourLanguage.g:1228:1: ruleCollaborationStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) ;
    public final EObject ruleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collaboration_2_0 = null;

        EObject lv_collaboration_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1234:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) )
            // InternalBehaviourLanguage.g:1235:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            {
            // InternalBehaviourLanguage.g:1235:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            // InternalBehaviourLanguage.g:1236:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            {
            // InternalBehaviourLanguage.g:1236:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1237:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1237:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1238:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollaborationStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getCollaborationStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCollaborationStatementAccess().getKnowKeyword_1());
            		
            // InternalBehaviourLanguage.g:1253:3: ( (lv_collaboration_2_0= ruleRobotCollaboration ) )
            // InternalBehaviourLanguage.g:1254:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            {
            // InternalBehaviourLanguage.g:1254:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            // InternalBehaviourLanguage.g:1255:5: lv_collaboration_2_0= ruleRobotCollaboration
            {

            					newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalBehaviourLanguage.g:1272:3: (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:1273:4: otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCollaborationStatementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:1277:4: ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    // InternalBehaviourLanguage.g:1278:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    {
            	    // InternalBehaviourLanguage.g:1278:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    // InternalBehaviourLanguage.g:1279:6: lv_collaboration_4_0= ruleRobotCollaboration
            	    {

            	    						newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop26;
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
    // InternalBehaviourLanguage.g:1301:1: entryRuleDetectionStatement returns [EObject current=null] : iv_ruleDetectionStatement= ruleDetectionStatement EOF ;
    public final EObject entryRuleDetectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectionStatement = null;


        try {
            // InternalBehaviourLanguage.g:1301:59: (iv_ruleDetectionStatement= ruleDetectionStatement EOF )
            // InternalBehaviourLanguage.g:1302:2: iv_ruleDetectionStatement= ruleDetectionStatement EOF
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
    // InternalBehaviourLanguage.g:1308:1: ruleDetectionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) ;
    public final EObject ruleDetectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_obstacle_3_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1314:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) )
            // InternalBehaviourLanguage.g:1315:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            {
            // InternalBehaviourLanguage.g:1315:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            // InternalBehaviourLanguage.g:1316:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )?
            {
            // InternalBehaviourLanguage.g:1316:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1317:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1317:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1318:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getDetectionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDetectionStatementAccess().getDetectKeyword_1());
            		
            // InternalBehaviourLanguage.g:1333:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:1334:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1334:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:1335:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_2, grammarAccess.getDetectionStatementAccess().getObjectAreaObjectCrossReference_2_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1346:3: ( (lv_obstacle_3_0= 'obstacle' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBehaviourLanguage.g:1347:4: (lv_obstacle_3_0= 'obstacle' )
                    {
                    // InternalBehaviourLanguage.g:1347:4: (lv_obstacle_3_0= 'obstacle' )
                    // InternalBehaviourLanguage.g:1348:5: lv_obstacle_3_0= 'obstacle'
                    {
                    lv_obstacle_3_0=(Token)match(input,36,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1364:1: entryRuleExecutionStatement returns [EObject current=null] : iv_ruleExecutionStatement= ruleExecutionStatement EOF ;
    public final EObject entryRuleExecutionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionStatement = null;


        try {
            // InternalBehaviourLanguage.g:1364:59: (iv_ruleExecutionStatement= ruleExecutionStatement EOF )
            // InternalBehaviourLanguage.g:1365:2: iv_ruleExecutionStatement= ruleExecutionStatement EOF
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
    // InternalBehaviourLanguage.g:1371:1: ruleExecutionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExecutionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1377:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:1378:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:1378:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:1379:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:1379:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1380:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1380:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1381:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_0, grammarAccess.getExecutionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getExecutionStatementAccess().getExecKeyword_1());
            		
            // InternalBehaviourLanguage.g:1396:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:1397:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1397:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:1398:5: otherlv_2= RULE_ID
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
    // InternalBehaviourLanguage.g:1413:1: entryRuleStatusStatement returns [EObject current=null] : iv_ruleStatusStatement= ruleStatusStatement EOF ;
    public final EObject entryRuleStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1413:56: (iv_ruleStatusStatement= ruleStatusStatement EOF )
            // InternalBehaviourLanguage.g:1414:2: iv_ruleStatusStatement= ruleStatusStatement EOF
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
    // InternalBehaviourLanguage.g:1420:1: ruleStatusStatement returns [EObject current=null] : (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement ) ;
    public final EObject ruleStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject this_RobotStatusStatement_0 = null;

        EObject this_TaskStatusStatement_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1426:2: ( (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement ) )
            // InternalBehaviourLanguage.g:1427:2: (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement )
            {
            // InternalBehaviourLanguage.g:1427:2: (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==38) ) {
                    int LA28_2 = input.LA(3);

                    if ( ((LA28_2>=73 && LA28_2<=77)) ) {
                        alt28=2;
                    }
                    else if ( ((LA28_2>=69 && LA28_2<=72)) ) {
                        alt28=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalBehaviourLanguage.g:1428:3: this_RobotStatusStatement_0= ruleRobotStatusStatement
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
                    // InternalBehaviourLanguage.g:1437:3: this_TaskStatusStatement_1= ruleTaskStatusStatement
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
    // InternalBehaviourLanguage.g:1449:1: entryRuleRobotStatusStatement returns [EObject current=null] : iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF ;
    public final EObject entryRuleRobotStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1449:61: (iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF )
            // InternalBehaviourLanguage.g:1450:2: iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF
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
    // InternalBehaviourLanguage.g:1456:1: ruleRobotStatusStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) ) ;
    public final EObject ruleRobotStatusStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1462:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) ) )
            // InternalBehaviourLanguage.g:1463:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1463:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) )
            // InternalBehaviourLanguage.g:1464:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) )
            {
            // InternalBehaviourLanguage.g:1464:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1465:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1465:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1466:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotStatusStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_0, grammarAccess.getRobotStatusStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotStatusStatementAccess().getSetKeyword_1());
            		
            // InternalBehaviourLanguage.g:1481:3: ( (lv_status_2_0= ruleRobotStatus ) )
            // InternalBehaviourLanguage.g:1482:4: (lv_status_2_0= ruleRobotStatus )
            {
            // InternalBehaviourLanguage.g:1482:4: (lv_status_2_0= ruleRobotStatus )
            // InternalBehaviourLanguage.g:1483:5: lv_status_2_0= ruleRobotStatus
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
    // InternalBehaviourLanguage.g:1504:1: entryRuleTaskStatusStatement returns [EObject current=null] : iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF ;
    public final EObject entryRuleTaskStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1504:60: (iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF )
            // InternalBehaviourLanguage.g:1505:2: iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF
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
    // InternalBehaviourLanguage.g:1511:1: ruleTaskStatusStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) ) ;
    public final EObject ruleTaskStatusStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1517:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) ) )
            // InternalBehaviourLanguage.g:1518:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1518:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) )
            // InternalBehaviourLanguage.g:1519:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) )
            {
            // InternalBehaviourLanguage.g:1519:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1520:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1520:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1521:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskStatusStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_0, grammarAccess.getTaskStatusStatementAccess().getTaskTaskExecutionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskStatusStatementAccess().getSetKeyword_1());
            		
            // InternalBehaviourLanguage.g:1536:3: ( (lv_status_2_0= ruleTaskExecutionStatus ) )
            // InternalBehaviourLanguage.g:1537:4: (lv_status_2_0= ruleTaskExecutionStatus )
            {
            // InternalBehaviourLanguage.g:1537:4: (lv_status_2_0= ruleTaskExecutionStatus )
            // InternalBehaviourLanguage.g:1538:5: lv_status_2_0= ruleTaskExecutionStatus
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
    // InternalBehaviourLanguage.g:1559:1: entryRuleMessageTarget returns [EObject current=null] : iv_ruleMessageTarget= ruleMessageTarget EOF ;
    public final EObject entryRuleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTarget = null;


        try {
            // InternalBehaviourLanguage.g:1559:54: (iv_ruleMessageTarget= ruleMessageTarget EOF )
            // InternalBehaviourLanguage.g:1560:2: iv_ruleMessageTarget= ruleMessageTarget EOF
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
    // InternalBehaviourLanguage.g:1566:1: ruleMessageTarget returns [EObject current=null] : (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) ;
    public final EObject ruleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject this_UniTarget_0 = null;

        EObject this_MultiTarget_1 = null;

        EObject this_AllTarget_2 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1572:2: ( (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) )
            // InternalBehaviourLanguage.g:1573:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            {
            // InternalBehaviourLanguage.g:1573:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 29:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalBehaviourLanguage.g:1574:3: this_UniTarget_0= ruleUniTarget
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
                    // InternalBehaviourLanguage.g:1583:3: this_MultiTarget_1= ruleMultiTarget
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
                    // InternalBehaviourLanguage.g:1592:3: this_AllTarget_2= ruleAllTarget
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
    // InternalBehaviourLanguage.g:1604:1: entryRuleUniTarget returns [EObject current=null] : iv_ruleUniTarget= ruleUniTarget EOF ;
    public final EObject entryRuleUniTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniTarget = null;


        try {
            // InternalBehaviourLanguage.g:1604:50: (iv_ruleUniTarget= ruleUniTarget EOF )
            // InternalBehaviourLanguage.g:1605:2: iv_ruleUniTarget= ruleUniTarget EOF
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
    // InternalBehaviourLanguage.g:1611:1: ruleUniTarget returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUniTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1617:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:1618:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:1618:2: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1619:3: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1619:3: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1620:4: otherlv_0= RULE_ID
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
    // InternalBehaviourLanguage.g:1634:1: entryRuleMultiTarget returns [EObject current=null] : iv_ruleMultiTarget= ruleMultiTarget EOF ;
    public final EObject entryRuleMultiTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiTarget = null;


        try {
            // InternalBehaviourLanguage.g:1634:52: (iv_ruleMultiTarget= ruleMultiTarget EOF )
            // InternalBehaviourLanguage.g:1635:2: iv_ruleMultiTarget= ruleMultiTarget EOF
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
    // InternalBehaviourLanguage.g:1641:1: ruleMultiTarget returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleMultiTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1647:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) )
            // InternalBehaviourLanguage.g:1648:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            {
            // InternalBehaviourLanguage.g:1648:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            // InternalBehaviourLanguage.g:1649:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiTargetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBehaviourLanguage.g:1653:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1654:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1654:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:1655:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_1, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1666:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:1667:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiTargetAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBehaviourLanguage.g:1671:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBehaviourLanguage.g:1672:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBehaviourLanguage.g:1672:5: (otherlv_3= RULE_ID )
            	    // InternalBehaviourLanguage.g:1673:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMultiTargetRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalBehaviourLanguage.g:1693:1: entryRuleAllTarget returns [EObject current=null] : iv_ruleAllTarget= ruleAllTarget EOF ;
    public final EObject entryRuleAllTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllTarget = null;


        try {
            // InternalBehaviourLanguage.g:1693:50: (iv_ruleAllTarget= ruleAllTarget EOF )
            // InternalBehaviourLanguage.g:1694:2: iv_ruleAllTarget= ruleAllTarget EOF
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
    // InternalBehaviourLanguage.g:1700:1: ruleAllTarget returns [EObject current=null] : ( (lv_target_0_0= '*' ) ) ;
    public final EObject ruleAllTarget() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1706:2: ( ( (lv_target_0_0= '*' ) ) )
            // InternalBehaviourLanguage.g:1707:2: ( (lv_target_0_0= '*' ) )
            {
            // InternalBehaviourLanguage.g:1707:2: ( (lv_target_0_0= '*' ) )
            // InternalBehaviourLanguage.g:1708:3: (lv_target_0_0= '*' )
            {
            // InternalBehaviourLanguage.g:1708:3: (lv_target_0_0= '*' )
            // InternalBehaviourLanguage.g:1709:4: lv_target_0_0= '*'
            {
            lv_target_0_0=(Token)match(input,39,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1724:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBehaviourLanguage.g:1724:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBehaviourLanguage.g:1725:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalBehaviourLanguage.g:1731:1: ruleCondition returns [EObject current=null] : ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) ) ;
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
            // InternalBehaviourLanguage.g:1737:2: ( ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) ) )
            // InternalBehaviourLanguage.g:1738:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) )
            {
            // InternalBehaviourLanguage.g:1738:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) ) | ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) ) )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==40) ) {
                    int LA34_3 = input.LA(3);

                    if ( (LA34_3==RULE_ID) ) {
                        alt34=3;
                    }
                    else if ( (LA34_3==41) ) {
                        int LA34_4 = input.LA(4);

                        if ( (LA34_4==42) ) {
                            int LA34_5 = input.LA(5);

                            if ( ((LA34_5>=69 && LA34_5<=72)) ) {
                                alt34=2;
                            }
                            else if ( ((LA34_5>=73 && LA34_5<=77)) ) {
                                alt34=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA34_4==43) ) {
                            int LA34_6 = input.LA(5);

                            if ( ((LA34_6>=69 && LA34_6<=72)) ) {
                                alt34=2;
                            }
                            else if ( ((LA34_6>=73 && LA34_6<=77)) ) {
                                alt34=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA34_1>=42 && LA34_1<=47)) ) {
                    alt34=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA34_0==RULE_STRING||LA34_0==58) ) {
                alt34=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalBehaviourLanguage.g:1739:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) )
                    {
                    // InternalBehaviourLanguage.g:1739:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) ) )
                    // InternalBehaviourLanguage.g:1740:4: () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) )
                    {
                    // InternalBehaviourLanguage.g:1740:4: ()
                    // InternalBehaviourLanguage.g:1741:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionAccess().getConditionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBehaviourLanguage.g:1747:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) ) )
                    // InternalBehaviourLanguage.g:1748:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'status' ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) ) ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) )
                    {
                    // InternalBehaviourLanguage.g:1748:5: ( (otherlv_1= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1749:6: (otherlv_1= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1749:6: (otherlv_1= RULE_ID )
                    // InternalBehaviourLanguage.g:1750:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConditionRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_42); 

                    							newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftTaskTaskExecutionCrossReference_0_1_0_0());
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_43); 

                    					newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getFullStopKeyword_0_1_1());
                    				
                    otherlv_3=(Token)match(input,41,FOLLOW_44); 

                    					newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getStatusKeyword_0_1_2());
                    				
                    // InternalBehaviourLanguage.g:1769:5: ( ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) ) )
                    // InternalBehaviourLanguage.g:1770:6: ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1770:6: ( (lv_compare_4_1= '==' | lv_compare_4_2= '!=' ) )
                    // InternalBehaviourLanguage.g:1771:7: (lv_compare_4_1= '==' | lv_compare_4_2= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1771:7: (lv_compare_4_1= '==' | lv_compare_4_2= '!=' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==42) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==43) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalBehaviourLanguage.g:1772:8: lv_compare_4_1= '=='
                            {
                            lv_compare_4_1=(Token)match(input,42,FOLLOW_40); 

                            								newLeafNode(lv_compare_4_1, grammarAccess.getConditionAccess().getCompareEqualsSignEqualsSignKeyword_0_1_3_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getConditionRule());
                            								}
                            								setWithLastConsumed(current, "compare", lv_compare_4_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:1783:8: lv_compare_4_2= '!='
                            {
                            lv_compare_4_2=(Token)match(input,43,FOLLOW_40); 

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

                    // InternalBehaviourLanguage.g:1796:5: ( (lv_rightStatus_5_0= ruleTaskExecutionStatus ) )
                    // InternalBehaviourLanguage.g:1797:6: (lv_rightStatus_5_0= ruleTaskExecutionStatus )
                    {
                    // InternalBehaviourLanguage.g:1797:6: (lv_rightStatus_5_0= ruleTaskExecutionStatus )
                    // InternalBehaviourLanguage.g:1798:7: lv_rightStatus_5_0= ruleTaskExecutionStatus
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
                    // InternalBehaviourLanguage.g:1818:3: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) )
                    {
                    // InternalBehaviourLanguage.g:1818:3: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) ) )
                    // InternalBehaviourLanguage.g:1819:4: ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' otherlv_8= 'status' ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) ) ( (lv_rightStatus_10_0= ruleRobotStatus ) )
                    {
                    // InternalBehaviourLanguage.g:1819:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1820:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1820:5: (otherlv_6= RULE_ID )
                    // InternalBehaviourLanguage.g:1821:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_42); 

                    						newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getLeftRobotDynamicRobotCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,40,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getFullStopKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,41,FOLLOW_44); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getStatusKeyword_1_2());
                    			
                    // InternalBehaviourLanguage.g:1840:4: ( ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) ) )
                    // InternalBehaviourLanguage.g:1841:5: ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1841:5: ( (lv_compare_9_1= '==' | lv_compare_9_2= '!=' ) )
                    // InternalBehaviourLanguage.g:1842:6: (lv_compare_9_1= '==' | lv_compare_9_2= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1842:6: (lv_compare_9_1= '==' | lv_compare_9_2= '!=' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==42) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==43) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalBehaviourLanguage.g:1843:7: lv_compare_9_1= '=='
                            {
                            lv_compare_9_1=(Token)match(input,42,FOLLOW_39); 

                            							newLeafNode(lv_compare_9_1, grammarAccess.getConditionAccess().getCompareEqualsSignEqualsSignKeyword_1_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:1854:7: lv_compare_9_2= '!='
                            {
                            lv_compare_9_2=(Token)match(input,43,FOLLOW_39); 

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

                    // InternalBehaviourLanguage.g:1867:4: ( (lv_rightStatus_10_0= ruleRobotStatus ) )
                    // InternalBehaviourLanguage.g:1868:5: (lv_rightStatus_10_0= ruleRobotStatus )
                    {
                    // InternalBehaviourLanguage.g:1868:5: (lv_rightStatus_10_0= ruleRobotStatus )
                    // InternalBehaviourLanguage.g:1869:6: lv_rightStatus_10_0= ruleRobotStatus
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
                    // InternalBehaviourLanguage.g:1888:3: ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) )
                    {
                    // InternalBehaviourLanguage.g:1888:3: ( ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) ) )
                    // InternalBehaviourLanguage.g:1889:4: ( (lv_leftMeasure_11_0= ruleMeasureComparable ) ) ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) ) ( (lv_rightMeasure_13_0= ruleMeasureComparable ) )
                    {
                    // InternalBehaviourLanguage.g:1889:4: ( (lv_leftMeasure_11_0= ruleMeasureComparable ) )
                    // InternalBehaviourLanguage.g:1890:5: (lv_leftMeasure_11_0= ruleMeasureComparable )
                    {
                    // InternalBehaviourLanguage.g:1890:5: (lv_leftMeasure_11_0= ruleMeasureComparable )
                    // InternalBehaviourLanguage.g:1891:6: lv_leftMeasure_11_0= ruleMeasureComparable
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getLeftMeasureMeasureComparableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_45);
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

                    // InternalBehaviourLanguage.g:1908:4: ( ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) ) )
                    // InternalBehaviourLanguage.g:1909:5: ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1909:5: ( (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' ) )
                    // InternalBehaviourLanguage.g:1910:6: (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1910:6: (lv_compare_12_1= '>' | lv_compare_12_2= '<' | lv_compare_12_3= '>=' | lv_compare_12_4= '<=' | lv_compare_12_5= '==' | lv_compare_12_6= '!=' )
                    int alt33=6;
                    switch ( input.LA(1) ) {
                    case 44:
                        {
                        alt33=1;
                        }
                        break;
                    case 45:
                        {
                        alt33=2;
                        }
                        break;
                    case 46:
                        {
                        alt33=3;
                        }
                        break;
                    case 47:
                        {
                        alt33=4;
                        }
                        break;
                    case 42:
                        {
                        alt33=5;
                        }
                        break;
                    case 43:
                        {
                        alt33=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // InternalBehaviourLanguage.g:1911:7: lv_compare_12_1= '>'
                            {
                            lv_compare_12_1=(Token)match(input,44,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_1, grammarAccess.getConditionAccess().getCompareGreaterThanSignKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:1922:7: lv_compare_12_2= '<'
                            {
                            lv_compare_12_2=(Token)match(input,45,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_2, grammarAccess.getConditionAccess().getCompareLessThanSignKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalBehaviourLanguage.g:1933:7: lv_compare_12_3= '>='
                            {
                            lv_compare_12_3=(Token)match(input,46,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_3, grammarAccess.getConditionAccess().getCompareGreaterThanSignEqualsSignKeyword_2_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalBehaviourLanguage.g:1944:7: lv_compare_12_4= '<='
                            {
                            lv_compare_12_4=(Token)match(input,47,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_4, grammarAccess.getConditionAccess().getCompareLessThanSignEqualsSignKeyword_2_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalBehaviourLanguage.g:1955:7: lv_compare_12_5= '=='
                            {
                            lv_compare_12_5=(Token)match(input,42,FOLLOW_16); 

                            							newLeafNode(lv_compare_12_5, grammarAccess.getConditionAccess().getCompareEqualsSignEqualsSignKeyword_2_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "compare", lv_compare_12_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalBehaviourLanguage.g:1966:7: lv_compare_12_6= '!='
                            {
                            lv_compare_12_6=(Token)match(input,43,FOLLOW_16); 

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

                    // InternalBehaviourLanguage.g:1979:4: ( (lv_rightMeasure_13_0= ruleMeasureComparable ) )
                    // InternalBehaviourLanguage.g:1980:5: (lv_rightMeasure_13_0= ruleMeasureComparable )
                    {
                    // InternalBehaviourLanguage.g:1980:5: (lv_rightMeasure_13_0= ruleMeasureComparable )
                    // InternalBehaviourLanguage.g:1981:6: lv_rightMeasure_13_0= ruleMeasureComparable
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
    // InternalBehaviourLanguage.g:2003:1: entryRuleMeasureComparable returns [EObject current=null] : iv_ruleMeasureComparable= ruleMeasureComparable EOF ;
    public final EObject entryRuleMeasureComparable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureComparable = null;


        try {
            // InternalBehaviourLanguage.g:2003:58: (iv_ruleMeasureComparable= ruleMeasureComparable EOF )
            // InternalBehaviourLanguage.g:2004:2: iv_ruleMeasureComparable= ruleMeasureComparable EOF
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
    // InternalBehaviourLanguage.g:2010:1: ruleMeasureComparable returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) ) ;
    public final EObject ruleMeasureComparable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2016:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) ) )
            // InternalBehaviourLanguage.g:2017:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) )
            {
            // InternalBehaviourLanguage.g:2017:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= rulePropertyValue ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==40) ) {
                    alt35=1;
                }
                else if ( (LA35_1==EOF||(LA35_1>=22 && LA35_1<=23)||(LA35_1>=42 && LA35_1<=47)) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==RULE_STRING||LA35_0==58) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalBehaviourLanguage.g:2018:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalBehaviourLanguage.g:2018:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    // InternalBehaviourLanguage.g:2019:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalBehaviourLanguage.g:2019:4: ( (otherlv_0= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2020:5: (otherlv_0= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2020:5: (otherlv_0= RULE_ID )
                    // InternalBehaviourLanguage.g:2021:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureComparableRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); 

                    						newLeafNode(otherlv_0, grammarAccess.getMeasureComparableAccess().getContainerDynamicRobotCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getMeasureComparableAccess().getFullStopKeyword_0_1());
                    			
                    // InternalBehaviourLanguage.g:2036:4: ( (otherlv_2= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2037:5: (otherlv_2= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2037:5: (otherlv_2= RULE_ID )
                    // InternalBehaviourLanguage.g:2038:6: otherlv_2= RULE_ID
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
                    // InternalBehaviourLanguage.g:2051:3: ( (lv_value_3_0= rulePropertyValue ) )
                    {
                    // InternalBehaviourLanguage.g:2051:3: ( (lv_value_3_0= rulePropertyValue ) )
                    // InternalBehaviourLanguage.g:2052:4: (lv_value_3_0= rulePropertyValue )
                    {
                    // InternalBehaviourLanguage.g:2052:4: (lv_value_3_0= rulePropertyValue )
                    // InternalBehaviourLanguage.g:2053:5: lv_value_3_0= rulePropertyValue
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
    // InternalBehaviourLanguage.g:2074:1: entryRuleTaskExecution returns [EObject current=null] : iv_ruleTaskExecution= ruleTaskExecution EOF ;
    public final EObject entryRuleTaskExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskExecution = null;


        try {
            // InternalBehaviourLanguage.g:2074:54: (iv_ruleTaskExecution= ruleTaskExecution EOF )
            // InternalBehaviourLanguage.g:2075:2: iv_ruleTaskExecution= ruleTaskExecution EOF
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
    // InternalBehaviourLanguage.g:2081:1: ruleTaskExecution returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
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
            // InternalBehaviourLanguage.g:2087:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalBehaviourLanguage.g:2088:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalBehaviourLanguage.g:2088:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalBehaviourLanguage.g:2089:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalBehaviourLanguage.g:2089:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2090:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2090:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:2091:5: lv_name_0_0= ruleEString
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
            		
            // InternalBehaviourLanguage.g:2112:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:2113:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2113:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:2114:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskExecutionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getTaskExecutionAccess().getTaskTaskCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:2129:3: (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBehaviourLanguage.g:2130:4: otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskExecutionAccess().getExecutionTimeKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:2134:4: ( (lv_executionTime_5_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:2135:5: (lv_executionTime_5_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:2135:5: (lv_executionTime_5_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:2136:6: lv_executionTime_5_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutionTimeMeasureValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalBehaviourLanguage.g:2154:3: (otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBehaviourLanguage.g:2155:4: otherlv_6= 'requirement' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskExecutionAccess().getRequirementKeyword_5_0());
                    			
                    // InternalBehaviourLanguage.g:2159:4: ( (otherlv_7= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2160:5: (otherlv_7= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2160:5: (otherlv_7= RULE_ID )
                    // InternalBehaviourLanguage.g:2161:6: otherlv_7= RULE_ID
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
    // InternalBehaviourLanguage.g:2181:1: entryRuleTaskRequirement returns [EObject current=null] : iv_ruleTaskRequirement= ruleTaskRequirement EOF ;
    public final EObject entryRuleTaskRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequirement = null;


        try {
            // InternalBehaviourLanguage.g:2181:56: (iv_ruleTaskRequirement= ruleTaskRequirement EOF )
            // InternalBehaviourLanguage.g:2182:2: iv_ruleTaskRequirement= ruleTaskRequirement EOF
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
    // InternalBehaviourLanguage.g:2188:1: ruleTaskRequirement returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // InternalBehaviourLanguage.g:2194:2: ( (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalBehaviourLanguage.g:2195:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalBehaviourLanguage.g:2195:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalBehaviourLanguage.g:2196:3: otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRequirementAccess().getNameKeyword_1());
            		
            // InternalBehaviourLanguage.g:2204:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2205:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2205:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:2206:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_49);
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

            otherlv_3=(Token)match(input,51,FOLLOW_50); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRequirementAccess().getParticipantsKeyword_3());
            		
            // InternalBehaviourLanguage.g:2227:3: ( (lv_participants_4_0= ruleEInt ) )
            // InternalBehaviourLanguage.g:2228:4: (lv_participants_4_0= ruleEInt )
            {
            // InternalBehaviourLanguage.g:2228:4: (lv_participants_4_0= ruleEInt )
            // InternalBehaviourLanguage.g:2229:5: lv_participants_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getParticipantsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_51);
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

            otherlv_5=(Token)match(input,52,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskRequirementAccess().getTaskExecutionKeyword_5());
            		
            // InternalBehaviourLanguage.g:2250:3: ( (otherlv_6= RULE_ID ) )
            // InternalBehaviourLanguage.g:2251:4: (otherlv_6= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2251:4: (otherlv_6= RULE_ID )
            // InternalBehaviourLanguage.g:2252:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRequirementRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_52); 

            					newLeafNode(otherlv_6, grammarAccess.getTaskRequirementAccess().getTaskExecutionTaskExecutionCrossReference_6_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2263:3: (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBehaviourLanguage.g:2264:4: otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskRequirementAccess().getPrerequisiteKeyword_7_0());
                    			
                    // InternalBehaviourLanguage.g:2268:4: ( (otherlv_8= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2269:5: (otherlv_8= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2269:5: (otherlv_8= RULE_ID )
                    // InternalBehaviourLanguage.g:2270:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_8, grammarAccess.getTaskRequirementAccess().getPrerequisiteTaskExecutionCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2282:3: (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBehaviourLanguage.g:2283:4: otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_54); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskRequirementAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:2291:4: ( (otherlv_11= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2292:5: (otherlv_11= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2292:5: (otherlv_11= RULE_ID )
                    // InternalBehaviourLanguage.g:2293:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(otherlv_11, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_2_0());
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:2304:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2305:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTaskRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2309:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalBehaviourLanguage.g:2310:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalBehaviourLanguage.g:2310:6: (otherlv_13= RULE_ID )
                    	    // InternalBehaviourLanguage.g:2311:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_41); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,30,FOLLOW_55); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskRequirementAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2328:3: (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBehaviourLanguage.g:2329:4: otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,55,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskRequirementAccess().getPropertiesKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBehaviourLanguage.g:2337:4: ( (lv_properties_17_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2338:5: (lv_properties_17_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2338:5: (lv_properties_17_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2339:6: lv_properties_17_0= ruleProperty
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

                    // InternalBehaviourLanguage.g:2356:4: (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2357:5: otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_28); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getTaskRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2361:5: ( (lv_properties_19_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2362:6: (lv_properties_19_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2362:6: (lv_properties_19_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2363:7: lv_properties_19_0= ruleProperty
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_56); 

                    				newLeafNode(otherlv_20, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2386:3: (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBehaviourLanguage.g:2387:4: otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,56,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,13,FOLLOW_57); 

                    				newLeafNode(otherlv_22, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBehaviourLanguage.g:2395:4: ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) )
                    // InternalBehaviourLanguage.g:2396:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    {
                    // InternalBehaviourLanguage.g:2396:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    // InternalBehaviourLanguage.g:2397:6: lv_capabilityProperties_23_0= ruleCapabilityProperties
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

                    // InternalBehaviourLanguage.g:2414:4: (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==15) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2415:5: otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_57); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getTaskRequirementAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2419:5: ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    // InternalBehaviourLanguage.g:2420:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    {
                    	    // InternalBehaviourLanguage.g:2420:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    // InternalBehaviourLanguage.g:2421:7: lv_capabilityProperties_25_0= ruleCapabilityProperties
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
                    	    break loop43;
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
    // InternalBehaviourLanguage.g:2452:1: entryRuleBehaviouralPropertyKeyContainer returns [EObject current=null] : iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF ;
    public final EObject entryRuleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralPropertyKeyContainer = null;


        try {
            // InternalBehaviourLanguage.g:2452:72: (iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF )
            // InternalBehaviourLanguage.g:2453:2: iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF
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
    // InternalBehaviourLanguage.g:2459:1: ruleBehaviouralPropertyKeyContainer returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keys_2_0 = null;

        EObject lv_keys_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2465:2: ( ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' ) )
            // InternalBehaviourLanguage.g:2466:2: ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' )
            {
            // InternalBehaviourLanguage.g:2466:2: ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' )
            // InternalBehaviourLanguage.g:2467:3: () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}'
            {
            // InternalBehaviourLanguage.g:2467:3: ()
            // InternalBehaviourLanguage.g:2468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:2478:3: ( (lv_keys_2_0= rulePropertyKey ) )
            // InternalBehaviourLanguage.g:2479:4: (lv_keys_2_0= rulePropertyKey )
            {
            // InternalBehaviourLanguage.g:2479:4: (lv_keys_2_0= rulePropertyKey )
            // InternalBehaviourLanguage.g:2480:5: lv_keys_2_0= rulePropertyKey
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

            // InternalBehaviourLanguage.g:2497:3: (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==15) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:2498:4: otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:2502:4: ( (lv_keys_4_0= rulePropertyKey ) )
            	    // InternalBehaviourLanguage.g:2503:5: (lv_keys_4_0= rulePropertyKey )
            	    {
            	    // InternalBehaviourLanguage.g:2503:5: (lv_keys_4_0= rulePropertyKey )
            	    // InternalBehaviourLanguage.g:2504:6: lv_keys_4_0= rulePropertyKey
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
            	    break loop45;
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
    // InternalBehaviourLanguage.g:2530:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBehaviourLanguage.g:2530:47: (iv_ruleEString= ruleEString EOF )
            // InternalBehaviourLanguage.g:2531:2: iv_ruleEString= ruleEString EOF
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
    // InternalBehaviourLanguage.g:2537:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2543:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2544:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2544:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalBehaviourLanguage.g:2545:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:2553:3: this_ID_1= RULE_ID
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
    // InternalBehaviourLanguage.g:2564:1: entryRuleRobotCollaboration returns [EObject current=null] : iv_ruleRobotCollaboration= ruleRobotCollaboration EOF ;
    public final EObject entryRuleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotCollaboration = null;


        try {
            // InternalBehaviourLanguage.g:2564:59: (iv_ruleRobotCollaboration= ruleRobotCollaboration EOF )
            // InternalBehaviourLanguage.g:2565:2: iv_ruleRobotCollaboration= ruleRobotCollaboration EOF
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
    // InternalBehaviourLanguage.g:2571:1: ruleRobotCollaboration returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? ) ;
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
            // InternalBehaviourLanguage.g:2577:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? ) )
            // InternalBehaviourLanguage.g:2578:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? )
            {
            // InternalBehaviourLanguage.g:2578:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? )
            // InternalBehaviourLanguage.g:2579:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )?
            {
            // InternalBehaviourLanguage.g:2579:3: ()
            // InternalBehaviourLanguage.g:2580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotCollaborationAccess().getRobotCollaborationAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:2586:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2587:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2587:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:2588:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotCollaborationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getRobotCollaborationAccess().getCollaboratorDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2599:3: (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBehaviourLanguage.g:2600:4: otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:2604:4: ( (lv_properties_3_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2605:5: (lv_properties_3_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2605:5: (lv_properties_3_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2606:6: lv_properties_3_0= ruleProperty
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

                    // InternalBehaviourLanguage.g:2623:4: (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==15) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2624:5: otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_28); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRobotCollaborationAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2628:5: ( (lv_properties_5_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2629:6: (lv_properties_5_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2629:6: (lv_properties_5_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2630:7: lv_properties_5_0= ruleProperty
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
                    	    break loop47;
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
    // InternalBehaviourLanguage.g:2657:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBehaviourLanguage.g:2657:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBehaviourLanguage.g:2658:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalBehaviourLanguage.g:2664:1: ruleProperty returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2670:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' ) )
            // InternalBehaviourLanguage.g:2671:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' )
            {
            // InternalBehaviourLanguage.g:2671:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' )
            // InternalBehaviourLanguage.g:2672:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBehaviourLanguage.g:2676:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2677:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2677:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:2678:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getKeyPropertyKeyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
            		
            // InternalBehaviourLanguage.g:2693:3: ( (lv_value_3_0= rulePropertyValue ) )
            // InternalBehaviourLanguage.g:2694:4: (lv_value_3_0= rulePropertyValue )
            {
            // InternalBehaviourLanguage.g:2694:4: (lv_value_3_0= rulePropertyValue )
            // InternalBehaviourLanguage.g:2695:5: lv_value_3_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:2720:1: entryRuleMeasureValue returns [EObject current=null] : iv_ruleMeasureValue= ruleMeasureValue EOF ;
    public final EObject entryRuleMeasureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue = null;


        try {
            // InternalBehaviourLanguage.g:2720:53: (iv_ruleMeasureValue= ruleMeasureValue EOF )
            // InternalBehaviourLanguage.g:2721:2: iv_ruleMeasureValue= ruleMeasureValue EOF
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
    // InternalBehaviourLanguage.g:2727:1: ruleMeasureValue returns [EObject current=null] : (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMeasureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2733:2: ( (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:2734:2: (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:2734:2: (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:2735:3: otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureValueAccess().getMeasureKeyword_0());
            		
            // InternalBehaviourLanguage.g:2739:3: ( (lv_value_1_0= ruleEFloat ) )
            // InternalBehaviourLanguage.g:2740:4: (lv_value_1_0= ruleEFloat )
            {
            // InternalBehaviourLanguage.g:2740:4: (lv_value_1_0= ruleEFloat )
            // InternalBehaviourLanguage.g:2741:5: lv_value_1_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getMeasureValueAccess().getValueEFloatParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_61);
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
            		
            // InternalBehaviourLanguage.g:2762:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:2763:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2763:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:2764:5: otherlv_3= RULE_ID
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
    // InternalBehaviourLanguage.g:2779:1: entryRuleCapabilityProperties returns [EObject current=null] : iv_ruleCapabilityProperties= ruleCapabilityProperties EOF ;
    public final EObject entryRuleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperties = null;


        try {
            // InternalBehaviourLanguage.g:2779:61: (iv_ruleCapabilityProperties= ruleCapabilityProperties EOF )
            // InternalBehaviourLanguage.g:2780:2: iv_ruleCapabilityProperties= ruleCapabilityProperties EOF
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
    // InternalBehaviourLanguage.g:2786:1: ruleCapabilityProperties returns [EObject current=null] : (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalBehaviourLanguage.g:2792:2: ( (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalBehaviourLanguage.g:2793:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalBehaviourLanguage.g:2793:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalBehaviourLanguage.g:2794:3: otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertiesAccess().getCapabilityPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,61,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertiesAccess().getCapabilityKeyword_2());
            		
            // InternalBehaviourLanguage.g:2806:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:2807:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2807:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:2808:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityPropertiesRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(otherlv_3, grammarAccess.getCapabilityPropertiesAccess().getCapabilityCapabilityCrossReference_3_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2819:3: (otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==13) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBehaviourLanguage.g:2820:4: otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:2824:4: ( (lv_properties_5_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2825:5: (lv_properties_5_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2825:5: (lv_properties_5_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2826:6: lv_properties_5_0= ruleProperty
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

                    // InternalBehaviourLanguage.g:2843:4: (otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==15) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2844:5: otherlv_6= ',' ( (lv_properties_7_0= ruleProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_28); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertiesAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2848:5: ( (lv_properties_7_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2849:6: (lv_properties_7_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2849:6: (lv_properties_7_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2850:7: lv_properties_7_0= ruleProperty
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
                    	    break loop49;
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
    // InternalBehaviourLanguage.g:2881:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBehaviourLanguage.g:2881:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBehaviourLanguage.g:2882:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBehaviourLanguage.g:2888:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2894:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBehaviourLanguage.g:2895:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBehaviourLanguage.g:2895:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBehaviourLanguage.g:2896:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBehaviourLanguage.g:2896:3: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==62) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBehaviourLanguage.g:2897:4: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_64); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2903:3: (this_INT_1= RULE_INT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBehaviourLanguage.g:2904:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_42); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,40,FOLLOW_65); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_66); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBehaviourLanguage.g:2924:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=63 && LA55_0<=64)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBehaviourLanguage.g:2925:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBehaviourLanguage.g:2925:4: (kw= 'E' | kw= 'e' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==63) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==64) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2926:5: kw= 'E'
                            {
                            kw=(Token)match(input,63,FOLLOW_50); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:2932:5: kw= 'e'
                            {
                            kw=(Token)match(input,64,FOLLOW_50); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2938:4: (kw= '-' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==62) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2939:5: kw= '-'
                            {
                            kw=(Token)match(input,62,FOLLOW_65); 

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
    // InternalBehaviourLanguage.g:2957:1: entryRulePropertyKey returns [EObject current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final EObject entryRulePropertyKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKey = null;


        try {
            // InternalBehaviourLanguage.g:2957:52: (iv_rulePropertyKey= rulePropertyKey EOF )
            // InternalBehaviourLanguage.g:2958:2: iv_rulePropertyKey= rulePropertyKey EOF
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
    // InternalBehaviourLanguage.g:2964:1: rulePropertyKey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePropertyKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2970:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBehaviourLanguage.g:2971:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBehaviourLanguage.g:2971:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2972:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2972:3: ()
            // InternalBehaviourLanguage.g:2973:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyKeyAccess().getPropertyKeyAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:2979:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2980:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2980:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:2981:5: lv_name_1_0= ruleEString
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
    // InternalBehaviourLanguage.g:3002:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBehaviourLanguage.g:3002:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBehaviourLanguage.g:3003:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalBehaviourLanguage.g:3009:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3015:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:3016:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:3016:2: ( (lv_value_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:3017:3: (lv_value_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:3017:3: (lv_value_0_0= ruleEString )
            // InternalBehaviourLanguage.g:3018:4: lv_value_0_0= ruleEString
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
    // InternalBehaviourLanguage.g:3038:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBehaviourLanguage.g:3038:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBehaviourLanguage.g:3039:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalBehaviourLanguage.g:3045:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) ;
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
            // InternalBehaviourLanguage.g:3051:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) )
            // InternalBehaviourLanguage.g:3052:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            {
            // InternalBehaviourLanguage.g:3052:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            // InternalBehaviourLanguage.g:3053:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            {
            // InternalBehaviourLanguage.g:3053:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:3054:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:3054:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:3055:5: lv_name_0_0= ruleEString
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

            // InternalBehaviourLanguage.g:3072:3: (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==13) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalBehaviourLanguage.g:3073:4: otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_67); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalBehaviourLanguage.g:3077:4: (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==17) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3078:5: otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_54); 

                            					newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getTaskExecutionsKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,29,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_1_1());
                            				
                            // InternalBehaviourLanguage.g:3086:5: ( (otherlv_4= RULE_ID ) )
                            // InternalBehaviourLanguage.g:3087:6: (otherlv_4= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:3087:6: (otherlv_4= RULE_ID )
                            // InternalBehaviourLanguage.g:3088:7: otherlv_4= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_41); 

                            							newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:3099:5: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==15) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:3100:6: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                            	    {
                            	    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getCommaKeyword_1_1_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:3104:6: ( (otherlv_6= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:3105:7: (otherlv_6= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:3105:7: (otherlv_6= RULE_ID )
                            	    // InternalBehaviourLanguage.g:3106:8: otherlv_6= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_41); 

                            	    								newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,30,FOLLOW_68); 

                            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_1_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3123:4: (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==65) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3124:5: otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
                            {
                            otherlv_8=(Token)match(input,65,FOLLOW_54); 

                            					newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getObjectsKeyword_1_2_0());
                            				
                            otherlv_9=(Token)match(input,29,FOLLOW_15); 

                            					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_2_1());
                            				
                            // InternalBehaviourLanguage.g:3132:5: ( (otherlv_10= RULE_ID ) )
                            // InternalBehaviourLanguage.g:3133:6: (otherlv_10= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:3133:6: (otherlv_10= RULE_ID )
                            // InternalBehaviourLanguage.g:3134:7: otherlv_10= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_41); 

                            							newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:3145:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==15) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:3146:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                            	    {
                            	    otherlv_11=(Token)match(input,15,FOLLOW_15); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getCommaKeyword_1_2_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:3150:6: ( (otherlv_12= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:3151:7: (otherlv_12= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:3151:7: (otherlv_12= RULE_ID )
                            	    // InternalBehaviourLanguage.g:3152:8: otherlv_12= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_41); 

                            	    								newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,30,FOLLOW_69); 

                            					newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_2_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3169:4: (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==66) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3170:5: otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) )
                            {
                            otherlv_14=(Token)match(input,66,FOLLOW_15); 

                            					newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getFollowsKeyword_1_3_0());
                            				
                            // InternalBehaviourLanguage.g:3174:5: ( (otherlv_15= RULE_ID ) )
                            // InternalBehaviourLanguage.g:3175:6: (otherlv_15= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:3175:6: (otherlv_15= RULE_ID )
                            // InternalBehaviourLanguage.g:3176:7: otherlv_15= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_70); 

                            							newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getFollowsMessageCrossReference_1_3_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3188:4: (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==67) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3189:5: otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}'
                            {
                            otherlv_16=(Token)match(input,67,FOLLOW_6); 

                            					newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getPropertiesKeyword_1_4_0());
                            				
                            otherlv_17=(Token)match(input,13,FOLLOW_28); 

                            					newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_4_1());
                            				
                            // InternalBehaviourLanguage.g:3197:5: ( (lv_properties_18_0= ruleProperty ) )
                            // InternalBehaviourLanguage.g:3198:6: (lv_properties_18_0= ruleProperty )
                            {
                            // InternalBehaviourLanguage.g:3198:6: (lv_properties_18_0= ruleProperty )
                            // InternalBehaviourLanguage.g:3199:7: lv_properties_18_0= ruleProperty
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

                            // InternalBehaviourLanguage.g:3216:5: (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==15) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:3217:6: otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) )
                            	    {
                            	    otherlv_19=(Token)match(input,15,FOLLOW_28); 

                            	    						newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getCommaKeyword_1_4_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:3221:6: ( (lv_properties_20_0= ruleProperty ) )
                            	    // InternalBehaviourLanguage.g:3222:7: (lv_properties_20_0= ruleProperty )
                            	    {
                            	    // InternalBehaviourLanguage.g:3222:7: (lv_properties_20_0= ruleProperty )
                            	    // InternalBehaviourLanguage.g:3223:8: lv_properties_20_0= ruleProperty
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
                            	    break loop61;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,16,FOLLOW_71); 

                            					newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_1_4_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:3246:4: (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==68) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalBehaviourLanguage.g:3247:5: otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) )
                            {
                            otherlv_22=(Token)match(input,68,FOLLOW_16); 

                            					newLeafNode(otherlv_22, grammarAccess.getMessageAccess().getTTLKeyword_1_5_0());
                            				
                            // InternalBehaviourLanguage.g:3251:5: ( (lv_TTL_23_0= ruleMeasureValue ) )
                            // InternalBehaviourLanguage.g:3252:6: (lv_TTL_23_0= ruleMeasureValue )
                            {
                            // InternalBehaviourLanguage.g:3252:6: (lv_TTL_23_0= ruleMeasureValue )
                            // InternalBehaviourLanguage.g:3253:7: lv_TTL_23_0= ruleMeasureValue
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
    // InternalBehaviourLanguage.g:3280:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBehaviourLanguage.g:3280:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBehaviourLanguage.g:3281:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBehaviourLanguage.g:3287:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3293:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBehaviourLanguage.g:3294:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBehaviourLanguage.g:3294:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBehaviourLanguage.g:3295:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBehaviourLanguage.g:3295:3: (kw= '-' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBehaviourLanguage.g:3296:4: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_65); 

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
    // InternalBehaviourLanguage.g:3313:1: ruleRobotStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) ) ;
    public final Enumerator ruleRobotStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3319:2: ( ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) ) )
            // InternalBehaviourLanguage.g:3320:2: ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) )
            {
            // InternalBehaviourLanguage.g:3320:2: ( (enumLiteral_0= 'RobotReady' ) | (enumLiteral_1= 'RobotTurnedOff' ) | (enumLiteral_2= 'RobotWaiting' ) | (enumLiteral_3= 'RobotExecuting' ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt66=1;
                }
                break;
            case 70:
                {
                alt66=2;
                }
                break;
            case 71:
                {
                alt66=3;
                }
                break;
            case 72:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalBehaviourLanguage.g:3321:3: (enumLiteral_0= 'RobotReady' )
                    {
                    // InternalBehaviourLanguage.g:3321:3: (enumLiteral_0= 'RobotReady' )
                    // InternalBehaviourLanguage.g:3322:4: enumLiteral_0= 'RobotReady'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:3329:3: (enumLiteral_1= 'RobotTurnedOff' )
                    {
                    // InternalBehaviourLanguage.g:3329:3: (enumLiteral_1= 'RobotTurnedOff' )
                    // InternalBehaviourLanguage.g:3330:4: enumLiteral_1= 'RobotTurnedOff'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:3337:3: (enumLiteral_2= 'RobotWaiting' )
                    {
                    // InternalBehaviourLanguage.g:3337:3: (enumLiteral_2= 'RobotWaiting' )
                    // InternalBehaviourLanguage.g:3338:4: enumLiteral_2= 'RobotWaiting'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:3345:3: (enumLiteral_3= 'RobotExecuting' )
                    {
                    // InternalBehaviourLanguage.g:3345:3: (enumLiteral_3= 'RobotExecuting' )
                    // InternalBehaviourLanguage.g:3346:4: enumLiteral_3= 'RobotExecuting'
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
    // InternalBehaviourLanguage.g:3356:1: ruleTaskExecutionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) ) ;
    public final Enumerator ruleTaskExecutionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:3362:2: ( ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) ) )
            // InternalBehaviourLanguage.g:3363:2: ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) )
            {
            // InternalBehaviourLanguage.g:3363:2: ( (enumLiteral_0= 'TaskReady' ) | (enumLiteral_1= 'TaskFinished' ) | (enumLiteral_2= 'TaskSuspended' ) | (enumLiteral_3= 'TaskInProgress' ) | (enumLiteral_4= 'TaskWaiting' ) )
            int alt67=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt67=1;
                }
                break;
            case 74:
                {
                alt67=2;
                }
                break;
            case 75:
                {
                alt67=3;
                }
                break;
            case 76:
                {
                alt67=4;
                }
                break;
            case 77:
                {
                alt67=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalBehaviourLanguage.g:3364:3: (enumLiteral_0= 'TaskReady' )
                    {
                    // InternalBehaviourLanguage.g:3364:3: (enumLiteral_0= 'TaskReady' )
                    // InternalBehaviourLanguage.g:3365:4: enumLiteral_0= 'TaskReady'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:3372:3: (enumLiteral_1= 'TaskFinished' )
                    {
                    // InternalBehaviourLanguage.g:3372:3: (enumLiteral_1= 'TaskFinished' )
                    // InternalBehaviourLanguage.g:3373:4: enumLiteral_1= 'TaskFinished'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:3380:3: (enumLiteral_2= 'TaskSuspended' )
                    {
                    // InternalBehaviourLanguage.g:3380:3: (enumLiteral_2= 'TaskSuspended' )
                    // InternalBehaviourLanguage.g:3381:4: enumLiteral_2= 'TaskSuspended'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:3388:3: (enumLiteral_3= 'TaskInProgress' )
                    {
                    // InternalBehaviourLanguage.g:3388:3: (enumLiteral_3= 'TaskInProgress' )
                    // InternalBehaviourLanguage.g:3389:4: enumLiteral_3= 'TaskInProgress'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:3396:3: (enumLiteral_4= 'TaskWaiting' )
                    {
                    // InternalBehaviourLanguage.g:3396:3: (enumLiteral_4= 'TaskWaiting' )
                    // InternalBehaviourLanguage.g:3397:4: enumLiteral_4= 'TaskWaiting'
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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000A0002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080002002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008020000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003E00L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003000000010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x01E0000000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x01C0000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0180000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x4000010000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000030000L,0x000000000000001EL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000010000L,0x000000000000001EL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000010000L,0x000000000000001CL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000018L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000010L});

}