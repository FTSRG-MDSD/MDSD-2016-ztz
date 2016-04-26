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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Declaration'", "'{'", "'DynamicRobots'", "','", "'}'", "'TaskExecutions'", "'TaskRequirements'", "'Keys'", "':'", "'do'", "'->'", "'send'", "'know'", "'detect'", "'obstacle'", "'exec'", "'('", "')'", "'*'", "'status'", "'executors'", "'executionTime'", "'TaskRequirement'", "'participants'", "'taskExecution'", "'prerequisite'", "'requiredCapabilities'", "'properties'", "'capabilityProperties'", "'BehaviouralPropertyKeyContainer'", "'keys'", "'Property'", "'key'", "'value'", "'MeasureValue'", "'dimension'", "'CapabilityProperties'", "'capability'", "'-'", "'.'", "'E'", "'e'", "'PropertyKey'", "'StringValue'", "'ReferredObjects'", "'Follows'", "'Properties'", "'TTL'", "'Ready'", "'Finished'", "'Suspended'", "'InProgress'", "'Waiting'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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

                if ( (LA1_0==RULE_ID) ) {
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
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_12); 

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
                    	    otherlv_18=(Token)match(input,15,FOLLOW_12); 

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

                    otherlv_20=(Token)match(input,16,FOLLOW_13); 

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
                    otherlv_21=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviourContainerAccess().getKeysKeyword_6_0());
                    			
                    // InternalBehaviourLanguage.g:391:4: ( (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer ) )
                    // InternalBehaviourLanguage.g:392:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    {
                    // InternalBehaviourLanguage.g:392:5: (lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer )
                    // InternalBehaviourLanguage.g:393:6: lv_behaviourKeysContainer_22_0= ruleBehaviouralPropertyKeyContainer
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

            if ( (LA9_0==55) ) {
                alt9=1;
            }
            else if ( (LA9_0==46) ) {
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
            				
            pushFollow(FOLLOW_16);
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

            otherlv_1=(Token)match(input,20,FOLLOW_17); 

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
    // InternalBehaviourLanguage.g:517:1: ruleStatement returns [EObject current=null] : (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionStatement_0 = null;

        EObject this_MessageStatement_1 = null;

        EObject this_CollaborationStatement_2 = null;

        EObject this_DetectionStatement_3 = null;

        EObject this_ExecutionStatement_4 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:523:2: ( (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement ) )
            // InternalBehaviourLanguage.g:524:2: (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement )
            {
            // InternalBehaviourLanguage.g:524:2: (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt10=4;
                    }
                    break;
                case 21:
                    {
                    alt10=1;
                    }
                    break;
                case 27:
                    {
                    alt10=5;
                    }
                    break;
                case 24:
                    {
                    alt10=3;
                    }
                    break;
                case 23:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBehaviourLanguage.g:525:3: this_ActionStatement_0= ruleActionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getActionStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionStatement_0=ruleActionStatement();

                    state._fsp--;


                    			current = this_ActionStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:534:3: this_MessageStatement_1= ruleMessageStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMessageStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageStatement_1=ruleMessageStatement();

                    state._fsp--;


                    			current = this_MessageStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:543:3: this_CollaborationStatement_2= ruleCollaborationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCollaborationStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollaborationStatement_2=ruleCollaborationStatement();

                    state._fsp--;


                    			current = this_CollaborationStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:552:3: this_DetectionStatement_3= ruleDetectionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDetectionStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DetectionStatement_3=ruleDetectionStatement();

                    state._fsp--;


                    			current = this_DetectionStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:561:3: this_ExecutionStatement_4= ruleExecutionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExecutionStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecutionStatement_4=ruleExecutionStatement();

                    state._fsp--;


                    			current = this_ExecutionStatement_4;
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


    // $ANTLR start "entryRuleActionStatement"
    // InternalBehaviourLanguage.g:573:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // InternalBehaviourLanguage.g:573:56: (iv_ruleActionStatement= ruleActionStatement EOF )
            // InternalBehaviourLanguage.g:574:2: iv_ruleActionStatement= ruleActionStatement EOF
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
    // InternalBehaviourLanguage.g:580:1: ruleActionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_action_2_0 = null;

        EObject lv_moreactions_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:586:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* ) )
            // InternalBehaviourLanguage.g:587:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* )
            {
            // InternalBehaviourLanguage.g:587:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* )
            // InternalBehaviourLanguage.g:588:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )*
            {
            // InternalBehaviourLanguage.g:588:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:589:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:589:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:590:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActionStatementAccess().getDoKeyword_1());
            		
            // InternalBehaviourLanguage.g:605:3: ( (lv_action_2_0= ruleAction_Impl ) )
            // InternalBehaviourLanguage.g:606:4: (lv_action_2_0= ruleAction_Impl )
            {
            // InternalBehaviourLanguage.g:606:4: (lv_action_2_0= ruleAction_Impl )
            // InternalBehaviourLanguage.g:607:5: lv_action_2_0= ruleAction_Impl
            {

            					newCompositeNode(grammarAccess.getActionStatementAccess().getActionAction_ImplParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_action_2_0=ruleAction_Impl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionStatementRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Action_Impl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:624:3: (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:625:4: otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:629:4: ( (lv_moreactions_4_0= ruleAction_Impl ) )
            	    // InternalBehaviourLanguage.g:630:5: (lv_moreactions_4_0= ruleAction_Impl )
            	    {
            	    // InternalBehaviourLanguage.g:630:5: (lv_moreactions_4_0= ruleAction_Impl )
            	    // InternalBehaviourLanguage.g:631:6: lv_moreactions_4_0= ruleAction_Impl
            	    {

            	    						newCompositeNode(grammarAccess.getActionStatementAccess().getMoreactionsAction_ImplParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_moreactions_4_0=ruleAction_Impl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"moreactions",
            	    							lv_moreactions_4_0,
            	    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Action_Impl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleMessageStatement"
    // InternalBehaviourLanguage.g:653:1: entryRuleMessageStatement returns [EObject current=null] : iv_ruleMessageStatement= ruleMessageStatement EOF ;
    public final EObject entryRuleMessageStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStatement = null;


        try {
            // InternalBehaviourLanguage.g:653:57: (iv_ruleMessageStatement= ruleMessageStatement EOF )
            // InternalBehaviourLanguage.g:654:2: iv_ruleMessageStatement= ruleMessageStatement EOF
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
    // InternalBehaviourLanguage.g:660:1: ruleMessageStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) ;
    public final EObject ruleMessageStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_target_2_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:666:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) )
            // InternalBehaviourLanguage.g:667:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            {
            // InternalBehaviourLanguage.g:667:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            // InternalBehaviourLanguage.g:668:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) )
            {
            // InternalBehaviourLanguage.g:668:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:669:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:669:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:670:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getMessageStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageStatementAccess().getSendKeyword_1());
            		
            // InternalBehaviourLanguage.g:685:3: ( (lv_target_2_0= ruleMessageTarget ) )
            // InternalBehaviourLanguage.g:686:4: (lv_target_2_0= ruleMessageTarget )
            {
            // InternalBehaviourLanguage.g:686:4: (lv_target_2_0= ruleMessageTarget )
            // InternalBehaviourLanguage.g:687:5: lv_target_2_0= ruleMessageTarget
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

            // InternalBehaviourLanguage.g:704:3: ( (lv_message_3_0= ruleMessage ) )
            // InternalBehaviourLanguage.g:705:4: (lv_message_3_0= ruleMessage )
            {
            // InternalBehaviourLanguage.g:705:4: (lv_message_3_0= ruleMessage )
            // InternalBehaviourLanguage.g:706:5: lv_message_3_0= ruleMessage
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
    // InternalBehaviourLanguage.g:727:1: entryRuleCollaborationStatement returns [EObject current=null] : iv_ruleCollaborationStatement= ruleCollaborationStatement EOF ;
    public final EObject entryRuleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollaborationStatement = null;


        try {
            // InternalBehaviourLanguage.g:727:63: (iv_ruleCollaborationStatement= ruleCollaborationStatement EOF )
            // InternalBehaviourLanguage.g:728:2: iv_ruleCollaborationStatement= ruleCollaborationStatement EOF
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
    // InternalBehaviourLanguage.g:734:1: ruleCollaborationStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) ;
    public final EObject ruleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collaboration_2_0 = null;

        EObject lv_collaboration_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:740:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) )
            // InternalBehaviourLanguage.g:741:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            {
            // InternalBehaviourLanguage.g:741:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            // InternalBehaviourLanguage.g:742:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            {
            // InternalBehaviourLanguage.g:742:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:743:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:743:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:744:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollaborationStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getCollaborationStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCollaborationStatementAccess().getKnowKeyword_1());
            		
            // InternalBehaviourLanguage.g:759:3: ( (lv_collaboration_2_0= ruleRobotCollaboration ) )
            // InternalBehaviourLanguage.g:760:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            {
            // InternalBehaviourLanguage.g:760:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            // InternalBehaviourLanguage.g:761:5: lv_collaboration_2_0= ruleRobotCollaboration
            {

            					newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalBehaviourLanguage.g:778:3: (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:779:4: otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCollaborationStatementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:783:4: ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    // InternalBehaviourLanguage.g:784:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    {
            	    // InternalBehaviourLanguage.g:784:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    // InternalBehaviourLanguage.g:785:6: lv_collaboration_4_0= ruleRobotCollaboration
            	    {

            	    						newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop12;
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
    // InternalBehaviourLanguage.g:807:1: entryRuleDetectionStatement returns [EObject current=null] : iv_ruleDetectionStatement= ruleDetectionStatement EOF ;
    public final EObject entryRuleDetectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectionStatement = null;


        try {
            // InternalBehaviourLanguage.g:807:59: (iv_ruleDetectionStatement= ruleDetectionStatement EOF )
            // InternalBehaviourLanguage.g:808:2: iv_ruleDetectionStatement= ruleDetectionStatement EOF
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
    // InternalBehaviourLanguage.g:814:1: ruleDetectionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) ;
    public final EObject ruleDetectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_obstacle_3_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:820:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) )
            // InternalBehaviourLanguage.g:821:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            {
            // InternalBehaviourLanguage.g:821:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            // InternalBehaviourLanguage.g:822:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )?
            {
            // InternalBehaviourLanguage.g:822:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:823:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:823:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:824:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getDetectionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDetectionStatementAccess().getDetectKeyword_1());
            		
            // InternalBehaviourLanguage.g:839:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:840:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:840:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:841:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getDetectionStatementAccess().getObjectAreaObjectCrossReference_2_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:852:3: ( (lv_obstacle_3_0= 'obstacle' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBehaviourLanguage.g:853:4: (lv_obstacle_3_0= 'obstacle' )
                    {
                    // InternalBehaviourLanguage.g:853:4: (lv_obstacle_3_0= 'obstacle' )
                    // InternalBehaviourLanguage.g:854:5: lv_obstacle_3_0= 'obstacle'
                    {
                    lv_obstacle_3_0=(Token)match(input,26,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:870:1: entryRuleExecutionStatement returns [EObject current=null] : iv_ruleExecutionStatement= ruleExecutionStatement EOF ;
    public final EObject entryRuleExecutionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionStatement = null;


        try {
            // InternalBehaviourLanguage.g:870:59: (iv_ruleExecutionStatement= ruleExecutionStatement EOF )
            // InternalBehaviourLanguage.g:871:2: iv_ruleExecutionStatement= ruleExecutionStatement EOF
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
    // InternalBehaviourLanguage.g:877:1: ruleExecutionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExecutionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:883:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:884:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:884:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:885:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:885:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:886:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:886:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:887:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getExecutionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExecutionStatementAccess().getExecKeyword_1());
            		
            // InternalBehaviourLanguage.g:902:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:903:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:903:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:904:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleMessageTarget"
    // InternalBehaviourLanguage.g:919:1: entryRuleMessageTarget returns [EObject current=null] : iv_ruleMessageTarget= ruleMessageTarget EOF ;
    public final EObject entryRuleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTarget = null;


        try {
            // InternalBehaviourLanguage.g:919:54: (iv_ruleMessageTarget= ruleMessageTarget EOF )
            // InternalBehaviourLanguage.g:920:2: iv_ruleMessageTarget= ruleMessageTarget EOF
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
    // InternalBehaviourLanguage.g:926:1: ruleMessageTarget returns [EObject current=null] : (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) ;
    public final EObject ruleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject this_UniTarget_0 = null;

        EObject this_MultiTarget_1 = null;

        EObject this_AllTarget_2 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:932:2: ( (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) )
            // InternalBehaviourLanguage.g:933:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            {
            // InternalBehaviourLanguage.g:933:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBehaviourLanguage.g:934:3: this_UniTarget_0= ruleUniTarget
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
                    // InternalBehaviourLanguage.g:943:3: this_MultiTarget_1= ruleMultiTarget
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
                    // InternalBehaviourLanguage.g:952:3: this_AllTarget_2= ruleAllTarget
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
    // InternalBehaviourLanguage.g:964:1: entryRuleUniTarget returns [EObject current=null] : iv_ruleUniTarget= ruleUniTarget EOF ;
    public final EObject entryRuleUniTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniTarget = null;


        try {
            // InternalBehaviourLanguage.g:964:50: (iv_ruleUniTarget= ruleUniTarget EOF )
            // InternalBehaviourLanguage.g:965:2: iv_ruleUniTarget= ruleUniTarget EOF
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
    // InternalBehaviourLanguage.g:971:1: ruleUniTarget returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUniTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:977:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:978:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:978:2: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:979:3: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:979:3: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:980:4: otherlv_0= RULE_ID
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
    // InternalBehaviourLanguage.g:994:1: entryRuleMultiTarget returns [EObject current=null] : iv_ruleMultiTarget= ruleMultiTarget EOF ;
    public final EObject entryRuleMultiTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiTarget = null;


        try {
            // InternalBehaviourLanguage.g:994:52: (iv_ruleMultiTarget= ruleMultiTarget EOF )
            // InternalBehaviourLanguage.g:995:2: iv_ruleMultiTarget= ruleMultiTarget EOF
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
    // InternalBehaviourLanguage.g:1001:1: ruleMultiTarget returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleMultiTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1007:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) )
            // InternalBehaviourLanguage.g:1008:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            {
            // InternalBehaviourLanguage.g:1008:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            // InternalBehaviourLanguage.g:1009:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiTargetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBehaviourLanguage.g:1013:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1014:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1014:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:1015:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1026:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:1027:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiTargetAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBehaviourLanguage.g:1031:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBehaviourLanguage.g:1032:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBehaviourLanguage.g:1032:5: (otherlv_3= RULE_ID )
            	    // InternalBehaviourLanguage.g:1033:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMultiTargetRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1053:1: entryRuleAllTarget returns [EObject current=null] : iv_ruleAllTarget= ruleAllTarget EOF ;
    public final EObject entryRuleAllTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllTarget = null;


        try {
            // InternalBehaviourLanguage.g:1053:50: (iv_ruleAllTarget= ruleAllTarget EOF )
            // InternalBehaviourLanguage.g:1054:2: iv_ruleAllTarget= ruleAllTarget EOF
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
    // InternalBehaviourLanguage.g:1060:1: ruleAllTarget returns [EObject current=null] : ( (lv_target_0_0= '*' ) ) ;
    public final EObject ruleAllTarget() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1066:2: ( ( (lv_target_0_0= '*' ) ) )
            // InternalBehaviourLanguage.g:1067:2: ( (lv_target_0_0= '*' ) )
            {
            // InternalBehaviourLanguage.g:1067:2: ( (lv_target_0_0= '*' ) )
            // InternalBehaviourLanguage.g:1068:3: (lv_target_0_0= '*' )
            {
            // InternalBehaviourLanguage.g:1068:3: (lv_target_0_0= '*' )
            // InternalBehaviourLanguage.g:1069:4: lv_target_0_0= '*'
            {
            lv_target_0_0=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTaskExecution"
    // InternalBehaviourLanguage.g:1084:1: entryRuleTaskExecution returns [EObject current=null] : iv_ruleTaskExecution= ruleTaskExecution EOF ;
    public final EObject entryRuleTaskExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskExecution = null;


        try {
            // InternalBehaviourLanguage.g:1084:54: (iv_ruleTaskExecution= ruleTaskExecution EOF )
            // InternalBehaviourLanguage.g:1085:2: iv_ruleTaskExecution= ruleTaskExecution EOF
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
    // InternalBehaviourLanguage.g:1091:1: ruleTaskExecution returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskExecutionStatus ) ) )? (otherlv_6= 'executors' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'executionTime' ( (lv_executionTime_13_0= ruleMeasureValue ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleTaskExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_status_5_0 = null;

        EObject lv_executionTime_13_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1097:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskExecutionStatus ) ) )? (otherlv_6= 'executors' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'executionTime' ( (lv_executionTime_13_0= ruleMeasureValue ) ) )? otherlv_14= '}' ) )
            // InternalBehaviourLanguage.g:1098:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskExecutionStatus ) ) )? (otherlv_6= 'executors' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'executionTime' ( (lv_executionTime_13_0= ruleMeasureValue ) ) )? otherlv_14= '}' )
            {
            // InternalBehaviourLanguage.g:1098:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskExecutionStatus ) ) )? (otherlv_6= 'executors' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'executionTime' ( (lv_executionTime_13_0= ruleMeasureValue ) ) )? otherlv_14= '}' )
            // InternalBehaviourLanguage.g:1099:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskExecutionStatus ) ) )? (otherlv_6= 'executors' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= 'executionTime' ( (lv_executionTime_13_0= ruleMeasureValue ) ) )? otherlv_14= '}'
            {
            // InternalBehaviourLanguage.g:1099:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1100:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1100:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:1101:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskExecutionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskExecutionAccess().getColonKeyword_1());
            		
            // InternalBehaviourLanguage.g:1122:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:1123:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1123:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:1124:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskExecutionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getTaskExecutionAccess().getTaskTaskCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1139:3: (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskExecutionStatus ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBehaviourLanguage.g:1140:4: otherlv_4= 'status' ( (lv_status_5_0= ruleTaskExecutionStatus ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskExecutionAccess().getStatusKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:1144:4: ( (lv_status_5_0= ruleTaskExecutionStatus ) )
                    // InternalBehaviourLanguage.g:1145:5: (lv_status_5_0= ruleTaskExecutionStatus )
                    {
                    // InternalBehaviourLanguage.g:1145:5: (lv_status_5_0= ruleTaskExecutionStatus )
                    // InternalBehaviourLanguage.g:1146:6: lv_status_5_0= ruleTaskExecutionStatus
                    {

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getStatusTaskExecutionStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_status_5_0=ruleTaskExecutionStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskExecutionRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_5_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.TaskExecutionStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1164:3: (otherlv_6= 'executors' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBehaviourLanguage.g:1165:4: otherlv_6= 'executors' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskExecutionAccess().getExecutorsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskExecutionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBehaviourLanguage.g:1173:4: ( (otherlv_8= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1174:5: (otherlv_8= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1174:5: (otherlv_8= RULE_ID )
                    // InternalBehaviourLanguage.g:1175:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskExecutionRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_8, grammarAccess.getTaskExecutionAccess().getExecutorsDynamicRobotCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1186:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1187:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTaskExecutionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1191:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalBehaviourLanguage.g:1192:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalBehaviourLanguage.g:1192:6: (otherlv_10= RULE_ID )
                    	    // InternalBehaviourLanguage.g:1193:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskExecutionRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getTaskExecutionAccess().getExecutorsDynamicRobotCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,29,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskExecutionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1210:3: (otherlv_12= 'executionTime' ( (lv_executionTime_13_0= ruleMeasureValue ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBehaviourLanguage.g:1211:4: otherlv_12= 'executionTime' ( (lv_executionTime_13_0= ruleMeasureValue ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getTaskExecutionAccess().getExecutionTimeKeyword_6_0());
                    			
                    // InternalBehaviourLanguage.g:1215:4: ( (lv_executionTime_13_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:1216:5: (lv_executionTime_13_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:1216:5: (lv_executionTime_13_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:1217:6: lv_executionTime_13_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutionTimeMeasureValueParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_executionTime_13_0=ruleMeasureValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskExecutionRule());
                    						}
                    						set(
                    							current,
                    							"executionTime",
                    							lv_executionTime_13_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.MeasureValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskExecutionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalBehaviourLanguage.g:1243:1: entryRuleTaskRequirement returns [EObject current=null] : iv_ruleTaskRequirement= ruleTaskRequirement EOF ;
    public final EObject entryRuleTaskRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequirement = null;


        try {
            // InternalBehaviourLanguage.g:1243:56: (iv_ruleTaskRequirement= ruleTaskRequirement EOF )
            // InternalBehaviourLanguage.g:1244:2: iv_ruleTaskRequirement= ruleTaskRequirement EOF
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
    // InternalBehaviourLanguage.g:1250:1: ruleTaskRequirement returns [EObject current=null] : (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleTaskRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_participants_4_0 = null;

        EObject lv_properties_17_0 = null;

        EObject lv_properties_19_0 = null;

        EObject lv_capabilityProperties_23_0 = null;

        EObject lv_capabilityProperties_25_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1256:2: ( (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalBehaviourLanguage.g:1257:2: (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalBehaviourLanguage.g:1257:2: (otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalBehaviourLanguage.g:1258:3: otherlv_0= 'TaskRequirement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'participants' ( (lv_participants_4_0= ruleEInt ) ) otherlv_5= 'taskExecution' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )? (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequirementAccess().getTaskRequirementKeyword_0());
            		
            // InternalBehaviourLanguage.g:1262:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1263:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1263:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:1264:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRequirementAccess().getParticipantsKeyword_3());
            		
            // InternalBehaviourLanguage.g:1289:3: ( (lv_participants_4_0= ruleEInt ) )
            // InternalBehaviourLanguage.g:1290:4: (lv_participants_4_0= ruleEInt )
            {
            // InternalBehaviourLanguage.g:1290:4: (lv_participants_4_0= ruleEInt )
            // InternalBehaviourLanguage.g:1291:5: lv_participants_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getParticipantsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_5=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskRequirementAccess().getTaskExecutionKeyword_5());
            		
            // InternalBehaviourLanguage.g:1312:3: ( (otherlv_6= RULE_ID ) )
            // InternalBehaviourLanguage.g:1313:4: (otherlv_6= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1313:4: (otherlv_6= RULE_ID )
            // InternalBehaviourLanguage.g:1314:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRequirementRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_6, grammarAccess.getTaskRequirementAccess().getTaskExecutionTaskExecutionCrossReference_6_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1325:3: (otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBehaviourLanguage.g:1326:4: otherlv_7= 'prerequisite' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskRequirementAccess().getPrerequisiteKeyword_7_0());
                    			
                    // InternalBehaviourLanguage.g:1330:4: ( (otherlv_8= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1331:5: (otherlv_8= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1331:5: (otherlv_8= RULE_ID )
                    // InternalBehaviourLanguage.g:1332:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(otherlv_8, grammarAccess.getTaskRequirementAccess().getPrerequisiteTaskExecutionCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1344:3: (otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBehaviourLanguage.g:1345:4: otherlv_9= 'requiredCapabilities' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_31); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskRequirementAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:1353:4: ( (otherlv_11= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1354:5: (otherlv_11= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1354:5: (otherlv_11= RULE_ID )
                    // InternalBehaviourLanguage.g:1355:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_11, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_2_0());
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1366:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1367:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTaskRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1371:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalBehaviourLanguage.g:1372:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalBehaviourLanguage.g:1372:6: (otherlv_13= RULE_ID )
                    	    // InternalBehaviourLanguage.g:1373:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_8_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_39); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskRequirementAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1390:3: (otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBehaviourLanguage.g:1391:4: otherlv_15= 'properties' otherlv_16= '{' ( (lv_properties_17_0= ruleProperty ) ) (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskRequirementAccess().getPropertiesKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_16, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBehaviourLanguage.g:1399:4: ( (lv_properties_17_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1400:5: (lv_properties_17_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1400:5: (lv_properties_17_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1401:6: lv_properties_17_0= ruleProperty
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

                    // InternalBehaviourLanguage.g:1418:4: (otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1419:5: otherlv_18= ',' ( (lv_properties_19_0= ruleProperty ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_40); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getTaskRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1423:5: ( (lv_properties_19_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1424:6: (lv_properties_19_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1424:6: (lv_properties_19_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1425:7: lv_properties_19_0= ruleProperty
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_41); 

                    				newLeafNode(otherlv_20, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1448:3: (otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBehaviourLanguage.g:1449:4: otherlv_21= 'capabilityProperties' otherlv_22= '{' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,13,FOLLOW_42); 

                    				newLeafNode(otherlv_22, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBehaviourLanguage.g:1457:4: ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) )
                    // InternalBehaviourLanguage.g:1458:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    {
                    // InternalBehaviourLanguage.g:1458:5: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    // InternalBehaviourLanguage.g:1459:6: lv_capabilityProperties_23_0= ruleCapabilityProperties
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

                    // InternalBehaviourLanguage.g:1476:4: (otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1477:5: otherlv_24= ',' ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_42); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getTaskRequirementAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1481:5: ( (lv_capabilityProperties_25_0= ruleCapabilityProperties ) )
                    	    // InternalBehaviourLanguage.g:1482:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    {
                    	    // InternalBehaviourLanguage.g:1482:6: (lv_capabilityProperties_25_0= ruleCapabilityProperties )
                    	    // InternalBehaviourLanguage.g:1483:7: lv_capabilityProperties_25_0= ruleCapabilityProperties
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
                    	    break loop25;
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
    // InternalBehaviourLanguage.g:1514:1: entryRuleBehaviouralPropertyKeyContainer returns [EObject current=null] : iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF ;
    public final EObject entryRuleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralPropertyKeyContainer = null;


        try {
            // InternalBehaviourLanguage.g:1514:72: (iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF )
            // InternalBehaviourLanguage.g:1515:2: iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF
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
    // InternalBehaviourLanguage.g:1521:1: ruleBehaviouralPropertyKeyContainer returns [EObject current=null] : ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalBehaviourLanguage.g:1527:2: ( ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:1528:2: ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:1528:2: ( () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:1529:3: () otherlv_1= 'BehaviouralPropertyKeyContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalBehaviourLanguage.g:1529:3: ()
            // InternalBehaviourLanguage.g:1530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerKeyword_1());
            		
            // InternalBehaviourLanguage.g:1540:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1541:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1541:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:1542:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,13,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1563:3: (otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBehaviourLanguage.g:1564:4: otherlv_4= 'keys' otherlv_5= '{' ( (lv_keys_6_0= rulePropertyKey ) ) (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:1572:4: ( (lv_keys_6_0= rulePropertyKey ) )
                    // InternalBehaviourLanguage.g:1573:5: (lv_keys_6_0= rulePropertyKey )
                    {
                    // InternalBehaviourLanguage.g:1573:5: (lv_keys_6_0= rulePropertyKey )
                    // InternalBehaviourLanguage.g:1574:6: lv_keys_6_0= rulePropertyKey
                    {

                    						newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBehaviourLanguage.g:1591:4: (otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1592:5: otherlv_7= ',' ( (lv_keys_8_0= rulePropertyKey ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_44); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1596:5: ( (lv_keys_8_0= rulePropertyKey ) )
                    	    // InternalBehaviourLanguage.g:1597:6: (lv_keys_8_0= rulePropertyKey )
                    	    {
                    	    // InternalBehaviourLanguage.g:1597:6: (lv_keys_8_0= rulePropertyKey )
                    	    // InternalBehaviourLanguage.g:1598:7: lv_keys_8_0= rulePropertyKey
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysPropertyKeyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop27;
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
    // InternalBehaviourLanguage.g:1629:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBehaviourLanguage.g:1629:47: (iv_ruleEString= ruleEString EOF )
            // InternalBehaviourLanguage.g:1630:2: iv_ruleEString= ruleEString EOF
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
    // InternalBehaviourLanguage.g:1636:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1642:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1643:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1643:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalBehaviourLanguage.g:1644:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1652:3: this_ID_1= RULE_ID
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
    // InternalBehaviourLanguage.g:1663:1: entryRuleRobotCollaboration returns [EObject current=null] : iv_ruleRobotCollaboration= ruleRobotCollaboration EOF ;
    public final EObject entryRuleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotCollaboration = null;


        try {
            // InternalBehaviourLanguage.g:1663:59: (iv_ruleRobotCollaboration= ruleRobotCollaboration EOF )
            // InternalBehaviourLanguage.g:1664:2: iv_ruleRobotCollaboration= ruleRobotCollaboration EOF
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
    // InternalBehaviourLanguage.g:1670:1: ruleRobotCollaboration returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_properties_4_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1676:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? ) )
            // InternalBehaviourLanguage.g:1677:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? )
            {
            // InternalBehaviourLanguage.g:1677:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? )
            // InternalBehaviourLanguage.g:1678:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )?
            {
            // InternalBehaviourLanguage.g:1678:3: ()
            // InternalBehaviourLanguage.g:1679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotCollaborationAccess().getRobotCollaborationAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:1685:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1686:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1686:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:1687:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotCollaborationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_1, grammarAccess.getRobotCollaborationAccess().getCollaboratorDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1698:3: (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBehaviourLanguage.g:1699:4: otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getRobotCollaborationAccess().getPropertiesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalBehaviourLanguage.g:1707:4: ( (lv_properties_4_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1708:5: (lv_properties_4_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1708:5: (lv_properties_4_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1709:6: lv_properties_4_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_4_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotCollaborationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_4_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1726:4: (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1727:5: otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_40); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRobotCollaborationAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1731:5: ( (lv_properties_6_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1732:6: (lv_properties_6_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1732:6: (lv_properties_6_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1733:7: lv_properties_6_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotCollaborationAccess().getPropertiesPropertyParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getRobotCollaborationAccess().getRightCurlyBracketKeyword_2_4());
                    			

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


    // $ANTLR start "entryRuleAction_Impl"
    // InternalBehaviourLanguage.g:1760:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalBehaviourLanguage.g:1760:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalBehaviourLanguage.g:1761:2: iv_ruleAction_Impl= ruleAction_Impl EOF
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
    // InternalBehaviourLanguage.g:1767:1: ruleAction_Impl returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleAction_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_properties_9_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1773:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? ) )
            // InternalBehaviourLanguage.g:1774:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? )
            {
            // InternalBehaviourLanguage.g:1774:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? )
            // InternalBehaviourLanguage.g:1775:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )?
            {
            // InternalBehaviourLanguage.g:1775:3: ()
            // InternalBehaviourLanguage.g:1776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:1782:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1783:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1783:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:1784:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAction_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAction_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehaviourLanguage.g:1801:3: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBehaviourLanguage.g:1802:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getAction_ImplAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:1806:4: ( (otherlv_3= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1807:5: (otherlv_3= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1807:5: (otherlv_3= RULE_ID )
                    // InternalBehaviourLanguage.g:1808:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getCurrentTaskExecutionTaskExecutionCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1824:3: (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBehaviourLanguage.g:1825:4: otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getAction_ImplAccess().getPropertiesKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBehaviourLanguage.g:1833:4: ( (lv_properties_7_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1834:5: (lv_properties_7_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1834:5: (lv_properties_7_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1835:6: lv_properties_7_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getPropertiesPropertyParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_7_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAction_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_7_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1852:4: (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1853:5: otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_40); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAction_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1857:5: ( (lv_properties_9_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1858:6: (lv_properties_9_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1858:6: (lv_properties_9_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1859:7: lv_properties_9_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getAction_ImplAccess().getPropertiesPropertyParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_properties_9_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAction_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_9_0,
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

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

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
    // $ANTLR end "ruleAction_Impl"


    // $ANTLR start "entryRuleProperty"
    // InternalBehaviourLanguage.g:1886:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBehaviourLanguage.g:1886:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBehaviourLanguage.g:1887:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalBehaviourLanguage.g:1893:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1899:2: ( (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:1900:2: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:1900:2: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}' )
            // InternalBehaviourLanguage.g:1901:3: otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'value' ( (lv_value_5_0= rulePropertyValue ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getKeyKeyword_2());
            		
            // InternalBehaviourLanguage.g:1913:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:1914:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1914:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:1915:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getKeyPropertyKeyCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getValueKeyword_4());
            		
            // InternalBehaviourLanguage.g:1930:3: ( (lv_value_5_0= rulePropertyValue ) )
            // InternalBehaviourLanguage.g:1931:4: (lv_value_5_0= rulePropertyValue )
            {
            // InternalBehaviourLanguage.g:1931:4: (lv_value_5_0= rulePropertyValue )
            // InternalBehaviourLanguage.g:1932:5: lv_value_5_0= rulePropertyValue
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
    // InternalBehaviourLanguage.g:1957:1: entryRuleMeasureValue returns [EObject current=null] : iv_ruleMeasureValue= ruleMeasureValue EOF ;
    public final EObject entryRuleMeasureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue = null;


        try {
            // InternalBehaviourLanguage.g:1957:53: (iv_ruleMeasureValue= ruleMeasureValue EOF )
            // InternalBehaviourLanguage.g:1958:2: iv_ruleMeasureValue= ruleMeasureValue EOF
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
    // InternalBehaviourLanguage.g:1964:1: ruleMeasureValue returns [EObject current=null] : (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleMeasureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1970:2: ( (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:1971:2: (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:1971:2: (otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalBehaviourLanguage.g:1972:3: otherlv_0= 'MeasureValue' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )? otherlv_4= 'dimension' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureValueAccess().getMeasureValueKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:1980:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBehaviourLanguage.g:1981:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) )
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_52); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureValueAccess().getValueKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:1985:4: ( (lv_value_3_0= ruleEFloat ) )
                    // InternalBehaviourLanguage.g:1986:5: (lv_value_3_0= ruleEFloat )
                    {
                    // InternalBehaviourLanguage.g:1986:5: (lv_value_3_0= ruleEFloat )
                    // InternalBehaviourLanguage.g:1987:6: lv_value_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getMeasureValueAccess().getValueEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            otherlv_4=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureValueAccess().getDimensionKeyword_3());
            		
            // InternalBehaviourLanguage.g:2009:3: ( (otherlv_5= RULE_ID ) )
            // InternalBehaviourLanguage.g:2010:4: (otherlv_5= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2010:4: (otherlv_5= RULE_ID )
            // InternalBehaviourLanguage.g:2011:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureValueRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_5, grammarAccess.getMeasureValueAccess().getDimensionMeasureDimensionCrossReference_4_0());
            				

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
    // InternalBehaviourLanguage.g:2030:1: entryRuleCapabilityProperties returns [EObject current=null] : iv_ruleCapabilityProperties= ruleCapabilityProperties EOF ;
    public final EObject entryRuleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperties = null;


        try {
            // InternalBehaviourLanguage.g:2030:61: (iv_ruleCapabilityProperties= ruleCapabilityProperties EOF )
            // InternalBehaviourLanguage.g:2031:2: iv_ruleCapabilityProperties= ruleCapabilityProperties EOF
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
    // InternalBehaviourLanguage.g:2037:1: ruleCapabilityProperties returns [EObject current=null] : (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2043:2: ( (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:2044:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:2044:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:2045:3: otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertiesAccess().getCapabilityPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertiesAccess().getCapabilityKeyword_2());
            		
            // InternalBehaviourLanguage.g:2057:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:2058:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2058:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:2059:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityPropertiesRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_3, grammarAccess.getCapabilityPropertiesAccess().getCapabilityCapabilityCrossReference_3_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2070:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBehaviourLanguage.g:2071:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertiesAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:2079:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2080:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2080:5: (lv_properties_6_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2081:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBehaviourLanguage.g:2098:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==15) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2099:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_40); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCapabilityPropertiesAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2103:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2104:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2104:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2105:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityPropertiesAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop36;
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
    // InternalBehaviourLanguage.g:2136:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBehaviourLanguage.g:2136:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBehaviourLanguage.g:2137:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBehaviourLanguage.g:2143:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2149:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBehaviourLanguage.g:2150:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBehaviourLanguage.g:2150:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBehaviourLanguage.g:2151:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBehaviourLanguage.g:2151:3: (kw= '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBehaviourLanguage.g:2152:4: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2158:3: (this_INT_1= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBehaviourLanguage.g:2159:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_57); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,51,FOLLOW_58); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_59); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBehaviourLanguage.g:2179:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=52 && LA42_0<=53)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBehaviourLanguage.g:2180:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBehaviourLanguage.g:2180:4: (kw= 'E' | kw= 'e' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==52) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==53) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2181:5: kw= 'E'
                            {
                            kw=(Token)match(input,52,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:2187:5: kw= 'e'
                            {
                            kw=(Token)match(input,53,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2193:4: (kw= '-' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==50) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2194:5: kw= '-'
                            {
                            kw=(Token)match(input,50,FOLLOW_58); 

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
    // InternalBehaviourLanguage.g:2212:1: entryRulePropertyKey returns [EObject current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final EObject entryRulePropertyKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKey = null;


        try {
            // InternalBehaviourLanguage.g:2212:52: (iv_rulePropertyKey= rulePropertyKey EOF )
            // InternalBehaviourLanguage.g:2213:2: iv_rulePropertyKey= rulePropertyKey EOF
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
    // InternalBehaviourLanguage.g:2219:1: rulePropertyKey returns [EObject current=null] : ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePropertyKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2225:2: ( ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBehaviourLanguage.g:2226:2: ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBehaviourLanguage.g:2226:2: ( () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2227:3: () otherlv_1= 'PropertyKey' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2227:3: ()
            // InternalBehaviourLanguage.g:2228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyKeyAccess().getPropertyKeyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyKeyAccess().getPropertyKeyKeyword_1());
            		
            // InternalBehaviourLanguage.g:2238:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2239:4: (lv_name_2_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2239:4: (lv_name_2_0= ruleEString )
            // InternalBehaviourLanguage.g:2240:5: lv_name_2_0= ruleEString
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
    // InternalBehaviourLanguage.g:2261:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBehaviourLanguage.g:2261:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBehaviourLanguage.g:2262:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalBehaviourLanguage.g:2268:1: ruleStringValue returns [EObject current=null] : (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2274:2: ( (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalBehaviourLanguage.g:2275:2: (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalBehaviourLanguage.g:2275:2: (otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalBehaviourLanguage.g:2276:3: otherlv_0= 'StringValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStringValueAccess().getStringValueKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getValueKeyword_2());
            		
            // InternalBehaviourLanguage.g:2288:3: ( (lv_value_3_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2289:4: (lv_value_3_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2289:4: (lv_value_3_0= ruleEString )
            // InternalBehaviourLanguage.g:2290:5: lv_value_3_0= ruleEString
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
    // InternalBehaviourLanguage.g:2315:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBehaviourLanguage.g:2315:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBehaviourLanguage.g:2316:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalBehaviourLanguage.g:2322:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) ;
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
            // InternalBehaviourLanguage.g:2328:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) )
            // InternalBehaviourLanguage.g:2329:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            {
            // InternalBehaviourLanguage.g:2329:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            // InternalBehaviourLanguage.g:2330:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            {
            // InternalBehaviourLanguage.g:2330:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2331:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2331:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:2332:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_60);
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

            // InternalBehaviourLanguage.g:2349:3: (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBehaviourLanguage.g:2350:4: otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_61); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalBehaviourLanguage.g:2354:4: (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==17) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2355:5: otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_31); 

                            					newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getTaskExecutionsKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,28,FOLLOW_17); 

                            					newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_1_1());
                            				
                            // InternalBehaviourLanguage.g:2363:5: ( (otherlv_4= RULE_ID ) )
                            // InternalBehaviourLanguage.g:2364:6: (otherlv_4= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:2364:6: (otherlv_4= RULE_ID )
                            // InternalBehaviourLanguage.g:2365:7: otherlv_4= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

                            							newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:2376:5: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==15) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:2377:6: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                            	    {
                            	    otherlv_5=(Token)match(input,15,FOLLOW_17); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getCommaKeyword_1_1_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:2381:6: ( (otherlv_6= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:2382:7: (otherlv_6= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:2382:7: (otherlv_6= RULE_ID )
                            	    // InternalBehaviourLanguage.g:2383:8: otherlv_6= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_27); 

                            	    								newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,29,FOLLOW_62); 

                            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_1_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2400:4: (otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==56) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2401:5: otherlv_8= 'ReferredObjects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
                            {
                            otherlv_8=(Token)match(input,56,FOLLOW_31); 

                            					newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getReferredObjectsKeyword_1_2_0());
                            				
                            otherlv_9=(Token)match(input,28,FOLLOW_17); 

                            					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_2_1());
                            				
                            // InternalBehaviourLanguage.g:2409:5: ( (otherlv_10= RULE_ID ) )
                            // InternalBehaviourLanguage.g:2410:6: (otherlv_10= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:2410:6: (otherlv_10= RULE_ID )
                            // InternalBehaviourLanguage.g:2411:7: otherlv_10= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_27); 

                            							newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:2422:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==15) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:2423:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                            	    {
                            	    otherlv_11=(Token)match(input,15,FOLLOW_17); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getCommaKeyword_1_2_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:2427:6: ( (otherlv_12= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:2428:7: (otherlv_12= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:2428:7: (otherlv_12= RULE_ID )
                            	    // InternalBehaviourLanguage.g:2429:8: otherlv_12= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_27); 

                            	    								newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,29,FOLLOW_63); 

                            					newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_2_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2446:4: (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==57) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2447:5: otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) )
                            {
                            otherlv_14=(Token)match(input,57,FOLLOW_17); 

                            					newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getFollowsKeyword_1_3_0());
                            				
                            // InternalBehaviourLanguage.g:2451:5: ( (otherlv_15= RULE_ID ) )
                            // InternalBehaviourLanguage.g:2452:6: (otherlv_15= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:2452:6: (otherlv_15= RULE_ID )
                            // InternalBehaviourLanguage.g:2453:7: otherlv_15= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_64); 

                            							newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getFollowsMessageCrossReference_1_3_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2465:4: (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==58) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2466:5: otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}'
                            {
                            otherlv_16=(Token)match(input,58,FOLLOW_6); 

                            					newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getPropertiesKeyword_1_4_0());
                            				
                            otherlv_17=(Token)match(input,13,FOLLOW_40); 

                            					newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_4_1());
                            				
                            // InternalBehaviourLanguage.g:2474:5: ( (lv_properties_18_0= ruleProperty ) )
                            // InternalBehaviourLanguage.g:2475:6: (lv_properties_18_0= ruleProperty )
                            {
                            // InternalBehaviourLanguage.g:2475:6: (lv_properties_18_0= ruleProperty )
                            // InternalBehaviourLanguage.g:2476:7: lv_properties_18_0= ruleProperty
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

                            // InternalBehaviourLanguage.g:2493:5: (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==15) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:2494:6: otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) )
                            	    {
                            	    otherlv_19=(Token)match(input,15,FOLLOW_40); 

                            	    						newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getCommaKeyword_1_4_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:2498:6: ( (lv_properties_20_0= ruleProperty ) )
                            	    // InternalBehaviourLanguage.g:2499:7: (lv_properties_20_0= ruleProperty )
                            	    {
                            	    // InternalBehaviourLanguage.g:2499:7: (lv_properties_20_0= ruleProperty )
                            	    // InternalBehaviourLanguage.g:2500:8: lv_properties_20_0= ruleProperty
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
                            	    break loop48;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,16,FOLLOW_65); 

                            					newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_1_4_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2523:4: (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==59) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2524:5: otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) )
                            {
                            otherlv_22=(Token)match(input,59,FOLLOW_33); 

                            					newLeafNode(otherlv_22, grammarAccess.getMessageAccess().getTTLKeyword_1_5_0());
                            				
                            // InternalBehaviourLanguage.g:2528:5: ( (lv_TTL_23_0= ruleMeasureValue ) )
                            // InternalBehaviourLanguage.g:2529:6: (lv_TTL_23_0= ruleMeasureValue )
                            {
                            // InternalBehaviourLanguage.g:2529:6: (lv_TTL_23_0= ruleMeasureValue )
                            // InternalBehaviourLanguage.g:2530:7: lv_TTL_23_0= ruleMeasureValue
                            {

                            							newCompositeNode(grammarAccess.getMessageAccess().getTTLMeasureValueParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_15);
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
    // InternalBehaviourLanguage.g:2557:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBehaviourLanguage.g:2557:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBehaviourLanguage.g:2558:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBehaviourLanguage.g:2564:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2570:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBehaviourLanguage.g:2571:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBehaviourLanguage.g:2571:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBehaviourLanguage.g:2572:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBehaviourLanguage.g:2572:3: (kw= '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==50) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBehaviourLanguage.g:2573:4: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_58); 

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


    // $ANTLR start "ruleTaskExecutionStatus"
    // InternalBehaviourLanguage.g:2590:1: ruleTaskExecutionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) ;
    public final Enumerator ruleTaskExecutionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2596:2: ( ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) )
            // InternalBehaviourLanguage.g:2597:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            {
            // InternalBehaviourLanguage.g:2597:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt53=1;
                }
                break;
            case 61:
                {
                alt53=2;
                }
                break;
            case 62:
                {
                alt53=3;
                }
                break;
            case 63:
                {
                alt53=4;
                }
                break;
            case 64:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalBehaviourLanguage.g:2598:3: (enumLiteral_0= 'Ready' )
                    {
                    // InternalBehaviourLanguage.g:2598:3: (enumLiteral_0= 'Ready' )
                    // InternalBehaviourLanguage.g:2599:4: enumLiteral_0= 'Ready'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:2606:3: (enumLiteral_1= 'Finished' )
                    {
                    // InternalBehaviourLanguage.g:2606:3: (enumLiteral_1= 'Finished' )
                    // InternalBehaviourLanguage.g:2607:4: enumLiteral_1= 'Finished'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:2614:3: (enumLiteral_2= 'Suspended' )
                    {
                    // InternalBehaviourLanguage.g:2614:3: (enumLiteral_2= 'Suspended' )
                    // InternalBehaviourLanguage.g:2615:4: enumLiteral_2= 'Suspended'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:2622:3: (enumLiteral_3= 'InProgress' )
                    {
                    // InternalBehaviourLanguage.g:2622:3: (enumLiteral_3= 'InProgress' )
                    // InternalBehaviourLanguage.g:2623:4: enumLiteral_3= 'InProgress'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:2630:3: (enumLiteral_4= 'Waiting' )
                    {
                    // InternalBehaviourLanguage.g:2630:3: (enumLiteral_4= 'Waiting' )
                    // InternalBehaviourLanguage.g:2631:4: enumLiteral_4= 'Waiting'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000050000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000380010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000001E000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001C000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000018000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008010000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000C000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0F00000000030000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0F00000000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0E00000000010000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0C00000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0800000000010000L});

}