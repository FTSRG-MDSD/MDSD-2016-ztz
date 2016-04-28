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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Declaration'", "'{'", "'DynamicRobots'", "','", "'}'", "'TaskExecutions'", "'TaskRequirements'", "'Keys'", "':'", "'if'", "'then'", "'else'", "'do'", "'->'", "'send'", "'know'", "'detect'", "'obstacle'", "'exec'", "'set'", "'('", "')'", "'*'", "'=='", "'!='", "'executionTime'", "'participants'", "'taskExecution'", "'prerequisite'", "'requiredCapabilities'", "'properties'", "'capabilityProperties'", "'['", "'='", "']'", "'measure '", "'in'", "'CapabilityProperties'", "'capability'", "'-'", "'.'", "'E'", "'e'", "'Objects'", "'Follows'", "'Properties'", "'TTL'", "'Ready'", "'TurnedOff'", "'Waiting'", "'Executing'", "'Finished'", "'Suspended'", "'InProgress'"
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
    public static final int T__65=65;
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

                if ( (LA1_0==RULE_ID||LA1_0==21) ) {
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
            else if ( (LA9_0==47) ) {
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
    // InternalBehaviourLanguage.g:517:1: ruleStatement returns [EObject current=null] : (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicStatement_0 = null;

        EObject this_ConditionalStatement_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:523:2: ( (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement ) )
            // InternalBehaviourLanguage.g:524:2: (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement )
            {
            // InternalBehaviourLanguage.g:524:2: (this_AtomicStatement_0= ruleAtomicStatement | this_ConditionalStatement_1= ruleConditionalStatement )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
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
    // InternalBehaviourLanguage.g:546:1: entryRuleAtomicStatement returns [EObject current=null] : iv_ruleAtomicStatement= ruleAtomicStatement EOF ;
    public final EObject entryRuleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicStatement = null;


        try {
            // InternalBehaviourLanguage.g:546:56: (iv_ruleAtomicStatement= ruleAtomicStatement EOF )
            // InternalBehaviourLanguage.g:547:2: iv_ruleAtomicStatement= ruleAtomicStatement EOF
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
    // InternalBehaviourLanguage.g:553:1: ruleAtomicStatement returns [EObject current=null] : (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement ) ;
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
            // InternalBehaviourLanguage.g:559:2: ( (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement ) )
            // InternalBehaviourLanguage.g:560:2: (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement )
            {
            // InternalBehaviourLanguage.g:560:2: (this_ActionStatement_0= ruleActionStatement | this_MessageStatement_1= ruleMessageStatement | this_CollaborationStatement_2= ruleCollaborationStatement | this_DetectionStatement_3= ruleDetectionStatement | this_ExecutionStatement_4= ruleExecutionStatement | this_StatusStatement_5= ruleStatusStatement )
            int alt11=6;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt11=3;
                    }
                    break;
                case 26:
                    {
                    alt11=2;
                    }
                    break;
                case 31:
                    {
                    alt11=6;
                    }
                    break;
                case 28:
                    {
                    alt11=4;
                    }
                    break;
                case 24:
                    {
                    alt11=1;
                    }
                    break;
                case 30:
                    {
                    alt11=5;
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
                    // InternalBehaviourLanguage.g:561:3: this_ActionStatement_0= ruleActionStatement
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
                    // InternalBehaviourLanguage.g:570:3: this_MessageStatement_1= ruleMessageStatement
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
                    // InternalBehaviourLanguage.g:579:3: this_CollaborationStatement_2= ruleCollaborationStatement
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
                    // InternalBehaviourLanguage.g:588:3: this_DetectionStatement_3= ruleDetectionStatement
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
                    // InternalBehaviourLanguage.g:597:3: this_ExecutionStatement_4= ruleExecutionStatement
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
                    // InternalBehaviourLanguage.g:606:3: this_StatusStatement_5= ruleStatusStatement
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
    // InternalBehaviourLanguage.g:618:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalBehaviourLanguage.g:618:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalBehaviourLanguage.g:619:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
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
    // InternalBehaviourLanguage.g:625:1: ruleConditionalStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_otherStatements_8_0= ruleStatement ) )+ otherlv_9= '}' )? ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_otherStatements_8_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:631:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_otherStatements_8_0= ruleStatement ) )+ otherlv_9= '}' )? ) )
            // InternalBehaviourLanguage.g:632:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_otherStatements_8_0= ruleStatement ) )+ otherlv_9= '}' )? )
            {
            // InternalBehaviourLanguage.g:632:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_otherStatements_8_0= ruleStatement ) )+ otherlv_9= '}' )? )
            // InternalBehaviourLanguage.g:633:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= 'then' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_otherStatements_8_0= ruleStatement ) )+ otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getIfKeyword_0());
            		
            // InternalBehaviourLanguage.g:637:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalBehaviourLanguage.g:638:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalBehaviourLanguage.g:638:4: (lv_condition_1_0= ruleCondition )
            // InternalBehaviourLanguage.g:639:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalStatementAccess().getThenKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalStatementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:664:3: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:665:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalBehaviourLanguage.g:665:4: (lv_statements_4_0= ruleStatement )
            	    // InternalBehaviourLanguage.g:666:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalStatementAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"hu.bme.mdsd.ztz.text.BehaviourLanguage.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalStatementAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalBehaviourLanguage.g:687:3: (otherlv_6= 'else' otherlv_7= '{' ( (lv_otherStatements_8_0= ruleStatement ) )+ otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBehaviourLanguage.g:688:4: otherlv_6= 'else' otherlv_7= '{' ( (lv_otherStatements_8_0= ruleStatement ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionalStatementAccess().getElseKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionalStatementAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBehaviourLanguage.g:696:4: ( (lv_otherStatements_8_0= ruleStatement ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:697:5: (lv_otherStatements_8_0= ruleStatement )
                    	    {
                    	    // InternalBehaviourLanguage.g:697:5: (lv_otherStatements_8_0= ruleStatement )
                    	    // InternalBehaviourLanguage.g:698:6: lv_otherStatements_8_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getOtherStatementsStatementParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_otherStatements_8_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"otherStatements",
                    	    							lv_otherStatements_8_0,
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

                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionalStatementAccess().getRightCurlyBracketKeyword_6_3());
                    			

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


    // $ANTLR start "entryRuleActionStatement"
    // InternalBehaviourLanguage.g:724:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // InternalBehaviourLanguage.g:724:56: (iv_ruleActionStatement= ruleActionStatement EOF )
            // InternalBehaviourLanguage.g:725:2: iv_ruleActionStatement= ruleActionStatement EOF
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
    // InternalBehaviourLanguage.g:731:1: ruleActionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_action_2_0 = null;

        EObject lv_moreactions_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:737:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* ) )
            // InternalBehaviourLanguage.g:738:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* )
            {
            // InternalBehaviourLanguage.g:738:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )* )
            // InternalBehaviourLanguage.g:739:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'do' ( (lv_action_2_0= ruleAction_Impl ) ) (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )*
            {
            // InternalBehaviourLanguage.g:739:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:740:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:740:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:741:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActionStatementAccess().getDoKeyword_1());
            		
            // InternalBehaviourLanguage.g:756:3: ( (lv_action_2_0= ruleAction_Impl ) )
            // InternalBehaviourLanguage.g:757:4: (lv_action_2_0= ruleAction_Impl )
            {
            // InternalBehaviourLanguage.g:757:4: (lv_action_2_0= ruleAction_Impl )
            // InternalBehaviourLanguage.g:758:5: lv_action_2_0= ruleAction_Impl
            {

            					newCompositeNode(grammarAccess.getActionStatementAccess().getActionAction_ImplParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalBehaviourLanguage.g:775:3: (otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:776:4: otherlv_3= '->' ( (lv_moreactions_4_0= ruleAction_Impl ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:780:4: ( (lv_moreactions_4_0= ruleAction_Impl ) )
            	    // InternalBehaviourLanguage.g:781:5: (lv_moreactions_4_0= ruleAction_Impl )
            	    {
            	    // InternalBehaviourLanguage.g:781:5: (lv_moreactions_4_0= ruleAction_Impl )
            	    // InternalBehaviourLanguage.g:782:6: lv_moreactions_4_0= ruleAction_Impl
            	    {

            	    						newCompositeNode(grammarAccess.getActionStatementAccess().getMoreactionsAction_ImplParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop15;
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
    // InternalBehaviourLanguage.g:804:1: entryRuleMessageStatement returns [EObject current=null] : iv_ruleMessageStatement= ruleMessageStatement EOF ;
    public final EObject entryRuleMessageStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStatement = null;


        try {
            // InternalBehaviourLanguage.g:804:57: (iv_ruleMessageStatement= ruleMessageStatement EOF )
            // InternalBehaviourLanguage.g:805:2: iv_ruleMessageStatement= ruleMessageStatement EOF
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
    // InternalBehaviourLanguage.g:811:1: ruleMessageStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) ;
    public final EObject ruleMessageStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_target_2_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:817:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) ) )
            // InternalBehaviourLanguage.g:818:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            {
            // InternalBehaviourLanguage.g:818:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) ) )
            // InternalBehaviourLanguage.g:819:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'send' ( (lv_target_2_0= ruleMessageTarget ) ) ( (lv_message_3_0= ruleMessage ) )
            {
            // InternalBehaviourLanguage.g:819:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:820:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:820:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:821:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getMessageStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageStatementAccess().getSendKeyword_1());
            		
            // InternalBehaviourLanguage.g:836:3: ( (lv_target_2_0= ruleMessageTarget ) )
            // InternalBehaviourLanguage.g:837:4: (lv_target_2_0= ruleMessageTarget )
            {
            // InternalBehaviourLanguage.g:837:4: (lv_target_2_0= ruleMessageTarget )
            // InternalBehaviourLanguage.g:838:5: lv_target_2_0= ruleMessageTarget
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

            // InternalBehaviourLanguage.g:855:3: ( (lv_message_3_0= ruleMessage ) )
            // InternalBehaviourLanguage.g:856:4: (lv_message_3_0= ruleMessage )
            {
            // InternalBehaviourLanguage.g:856:4: (lv_message_3_0= ruleMessage )
            // InternalBehaviourLanguage.g:857:5: lv_message_3_0= ruleMessage
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
    // InternalBehaviourLanguage.g:878:1: entryRuleCollaborationStatement returns [EObject current=null] : iv_ruleCollaborationStatement= ruleCollaborationStatement EOF ;
    public final EObject entryRuleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollaborationStatement = null;


        try {
            // InternalBehaviourLanguage.g:878:63: (iv_ruleCollaborationStatement= ruleCollaborationStatement EOF )
            // InternalBehaviourLanguage.g:879:2: iv_ruleCollaborationStatement= ruleCollaborationStatement EOF
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
    // InternalBehaviourLanguage.g:885:1: ruleCollaborationStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) ;
    public final EObject ruleCollaborationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collaboration_2_0 = null;

        EObject lv_collaboration_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:891:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* ) )
            // InternalBehaviourLanguage.g:892:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            {
            // InternalBehaviourLanguage.g:892:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )* )
            // InternalBehaviourLanguage.g:893:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'know' ( (lv_collaboration_2_0= ruleRobotCollaboration ) ) (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            {
            // InternalBehaviourLanguage.g:893:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:894:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:894:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:895:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollaborationStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getCollaborationStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCollaborationStatementAccess().getKnowKeyword_1());
            		
            // InternalBehaviourLanguage.g:910:3: ( (lv_collaboration_2_0= ruleRobotCollaboration ) )
            // InternalBehaviourLanguage.g:911:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            {
            // InternalBehaviourLanguage.g:911:4: (lv_collaboration_2_0= ruleRobotCollaboration )
            // InternalBehaviourLanguage.g:912:5: lv_collaboration_2_0= ruleRobotCollaboration
            {

            					newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalBehaviourLanguage.g:929:3: (otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:930:4: otherlv_3= ',' ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCollaborationStatementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:934:4: ( (lv_collaboration_4_0= ruleRobotCollaboration ) )
            	    // InternalBehaviourLanguage.g:935:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    {
            	    // InternalBehaviourLanguage.g:935:5: (lv_collaboration_4_0= ruleRobotCollaboration )
            	    // InternalBehaviourLanguage.g:936:6: lv_collaboration_4_0= ruleRobotCollaboration
            	    {

            	    						newCompositeNode(grammarAccess.getCollaborationStatementAccess().getCollaborationRobotCollaborationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop16;
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
    // InternalBehaviourLanguage.g:958:1: entryRuleDetectionStatement returns [EObject current=null] : iv_ruleDetectionStatement= ruleDetectionStatement EOF ;
    public final EObject entryRuleDetectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetectionStatement = null;


        try {
            // InternalBehaviourLanguage.g:958:59: (iv_ruleDetectionStatement= ruleDetectionStatement EOF )
            // InternalBehaviourLanguage.g:959:2: iv_ruleDetectionStatement= ruleDetectionStatement EOF
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
    // InternalBehaviourLanguage.g:965:1: ruleDetectionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) ;
    public final EObject ruleDetectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_obstacle_3_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:971:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? ) )
            // InternalBehaviourLanguage.g:972:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            {
            // InternalBehaviourLanguage.g:972:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )? )
            // InternalBehaviourLanguage.g:973:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'detect' ( (otherlv_2= RULE_ID ) ) ( (lv_obstacle_3_0= 'obstacle' ) )?
            {
            // InternalBehaviourLanguage.g:973:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:974:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:974:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:975:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getDetectionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDetectionStatementAccess().getDetectKeyword_1());
            		
            // InternalBehaviourLanguage.g:990:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:991:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:991:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:992:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetectionStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getDetectionStatementAccess().getObjectAreaObjectCrossReference_2_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1003:3: ( (lv_obstacle_3_0= 'obstacle' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBehaviourLanguage.g:1004:4: (lv_obstacle_3_0= 'obstacle' )
                    {
                    // InternalBehaviourLanguage.g:1004:4: (lv_obstacle_3_0= 'obstacle' )
                    // InternalBehaviourLanguage.g:1005:5: lv_obstacle_3_0= 'obstacle'
                    {
                    lv_obstacle_3_0=(Token)match(input,29,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1021:1: entryRuleExecutionStatement returns [EObject current=null] : iv_ruleExecutionStatement= ruleExecutionStatement EOF ;
    public final EObject entryRuleExecutionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionStatement = null;


        try {
            // InternalBehaviourLanguage.g:1021:59: (iv_ruleExecutionStatement= ruleExecutionStatement EOF )
            // InternalBehaviourLanguage.g:1022:2: iv_ruleExecutionStatement= ruleExecutionStatement EOF
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
    // InternalBehaviourLanguage.g:1028:1: ruleExecutionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExecutionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1034:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:1035:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:1035:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:1036:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'exec' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:1036:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1037:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1037:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1038:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getExecutionStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getExecutionStatementAccess().getExecKeyword_1());
            		
            // InternalBehaviourLanguage.g:1053:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:1054:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1054:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:1055:5: otherlv_2= RULE_ID
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
    // InternalBehaviourLanguage.g:1070:1: entryRuleStatusStatement returns [EObject current=null] : iv_ruleStatusStatement= ruleStatusStatement EOF ;
    public final EObject entryRuleStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1070:56: (iv_ruleStatusStatement= ruleStatusStatement EOF )
            // InternalBehaviourLanguage.g:1071:2: iv_ruleStatusStatement= ruleStatusStatement EOF
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
    // InternalBehaviourLanguage.g:1077:1: ruleStatusStatement returns [EObject current=null] : (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement ) ;
    public final EObject ruleStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject this_RobotStatusStatement_0 = null;

        EObject this_TaskStatusStatement_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1083:2: ( (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement ) )
            // InternalBehaviourLanguage.g:1084:2: (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement )
            {
            // InternalBehaviourLanguage.g:1084:2: (this_RobotStatusStatement_0= ruleRobotStatusStatement | this_TaskStatusStatement_1= ruleTaskStatusStatement )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==31) ) {
                    switch ( input.LA(3) ) {
                    case 59:
                    case 60:
                        {
                        alt18=1;
                        }
                        break;
                    case 61:
                    case 62:
                        {
                        alt18=1;
                        }
                        break;
                    case 63:
                    case 64:
                    case 65:
                        {
                        alt18=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBehaviourLanguage.g:1085:3: this_RobotStatusStatement_0= ruleRobotStatusStatement
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
                    // InternalBehaviourLanguage.g:1094:3: this_TaskStatusStatement_1= ruleTaskStatusStatement
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
    // InternalBehaviourLanguage.g:1106:1: entryRuleRobotStatusStatement returns [EObject current=null] : iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF ;
    public final EObject entryRuleRobotStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1106:61: (iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF )
            // InternalBehaviourLanguage.g:1107:2: iv_ruleRobotStatusStatement= ruleRobotStatusStatement EOF
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
    // InternalBehaviourLanguage.g:1113:1: ruleRobotStatusStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) ) ;
    public final EObject ruleRobotStatusStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1119:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) ) )
            // InternalBehaviourLanguage.g:1120:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1120:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) ) )
            // InternalBehaviourLanguage.g:1121:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleRobotStatus ) )
            {
            // InternalBehaviourLanguage.g:1121:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1122:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1122:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1123:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotStatusStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getRobotStatusStatementAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotStatusStatementAccess().getSetKeyword_1());
            		
            // InternalBehaviourLanguage.g:1138:3: ( (lv_status_2_0= ruleRobotStatus ) )
            // InternalBehaviourLanguage.g:1139:4: (lv_status_2_0= ruleRobotStatus )
            {
            // InternalBehaviourLanguage.g:1139:4: (lv_status_2_0= ruleRobotStatus )
            // InternalBehaviourLanguage.g:1140:5: lv_status_2_0= ruleRobotStatus
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
    // InternalBehaviourLanguage.g:1161:1: entryRuleTaskStatusStatement returns [EObject current=null] : iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF ;
    public final EObject entryRuleTaskStatusStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskStatusStatement = null;


        try {
            // InternalBehaviourLanguage.g:1161:60: (iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF )
            // InternalBehaviourLanguage.g:1162:2: iv_ruleTaskStatusStatement= ruleTaskStatusStatement EOF
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
    // InternalBehaviourLanguage.g:1168:1: ruleTaskStatusStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) ) ;
    public final EObject ruleTaskStatusStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1174:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) ) )
            // InternalBehaviourLanguage.g:1175:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1175:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) ) )
            // InternalBehaviourLanguage.g:1176:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'set' ( (lv_status_2_0= ruleTaskExecutionStatus ) )
            {
            // InternalBehaviourLanguage.g:1176:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1177:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1177:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1178:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskStatusStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getTaskStatusStatementAccess().getTaskTaskExecutionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskStatusStatementAccess().getSetKeyword_1());
            		
            // InternalBehaviourLanguage.g:1193:3: ( (lv_status_2_0= ruleTaskExecutionStatus ) )
            // InternalBehaviourLanguage.g:1194:4: (lv_status_2_0= ruleTaskExecutionStatus )
            {
            // InternalBehaviourLanguage.g:1194:4: (lv_status_2_0= ruleTaskExecutionStatus )
            // InternalBehaviourLanguage.g:1195:5: lv_status_2_0= ruleTaskExecutionStatus
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
    // InternalBehaviourLanguage.g:1216:1: entryRuleMessageTarget returns [EObject current=null] : iv_ruleMessageTarget= ruleMessageTarget EOF ;
    public final EObject entryRuleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTarget = null;


        try {
            // InternalBehaviourLanguage.g:1216:54: (iv_ruleMessageTarget= ruleMessageTarget EOF )
            // InternalBehaviourLanguage.g:1217:2: iv_ruleMessageTarget= ruleMessageTarget EOF
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
    // InternalBehaviourLanguage.g:1223:1: ruleMessageTarget returns [EObject current=null] : (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) ;
    public final EObject ruleMessageTarget() throws RecognitionException {
        EObject current = null;

        EObject this_UniTarget_0 = null;

        EObject this_MultiTarget_1 = null;

        EObject this_AllTarget_2 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1229:2: ( (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget ) )
            // InternalBehaviourLanguage.g:1230:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            {
            // InternalBehaviourLanguage.g:1230:2: (this_UniTarget_0= ruleUniTarget | this_MultiTarget_1= ruleMultiTarget | this_AllTarget_2= ruleAllTarget )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalBehaviourLanguage.g:1231:3: this_UniTarget_0= ruleUniTarget
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
                    // InternalBehaviourLanguage.g:1240:3: this_MultiTarget_1= ruleMultiTarget
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
                    // InternalBehaviourLanguage.g:1249:3: this_AllTarget_2= ruleAllTarget
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
    // InternalBehaviourLanguage.g:1261:1: entryRuleUniTarget returns [EObject current=null] : iv_ruleUniTarget= ruleUniTarget EOF ;
    public final EObject entryRuleUniTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniTarget = null;


        try {
            // InternalBehaviourLanguage.g:1261:50: (iv_ruleUniTarget= ruleUniTarget EOF )
            // InternalBehaviourLanguage.g:1262:2: iv_ruleUniTarget= ruleUniTarget EOF
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
    // InternalBehaviourLanguage.g:1268:1: ruleUniTarget returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUniTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1274:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:1275:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBehaviourLanguage.g:1275:2: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1276:3: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1276:3: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1277:4: otherlv_0= RULE_ID
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
    // InternalBehaviourLanguage.g:1291:1: entryRuleMultiTarget returns [EObject current=null] : iv_ruleMultiTarget= ruleMultiTarget EOF ;
    public final EObject entryRuleMultiTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiTarget = null;


        try {
            // InternalBehaviourLanguage.g:1291:52: (iv_ruleMultiTarget= ruleMultiTarget EOF )
            // InternalBehaviourLanguage.g:1292:2: iv_ruleMultiTarget= ruleMultiTarget EOF
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
    // InternalBehaviourLanguage.g:1298:1: ruleMultiTarget returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleMultiTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1304:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' ) )
            // InternalBehaviourLanguage.g:1305:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            {
            // InternalBehaviourLanguage.g:1305:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')' )
            // InternalBehaviourLanguage.g:1306:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiTargetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBehaviourLanguage.g:1310:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:1311:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1311:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:1312:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1323:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:1324:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiTargetAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBehaviourLanguage.g:1328:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBehaviourLanguage.g:1329:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBehaviourLanguage.g:1329:5: (otherlv_3= RULE_ID )
            	    // InternalBehaviourLanguage.g:1330:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMultiTargetRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMultiTargetAccess().getTargetDynamicRobotCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1350:1: entryRuleAllTarget returns [EObject current=null] : iv_ruleAllTarget= ruleAllTarget EOF ;
    public final EObject entryRuleAllTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllTarget = null;


        try {
            // InternalBehaviourLanguage.g:1350:50: (iv_ruleAllTarget= ruleAllTarget EOF )
            // InternalBehaviourLanguage.g:1351:2: iv_ruleAllTarget= ruleAllTarget EOF
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
    // InternalBehaviourLanguage.g:1357:1: ruleAllTarget returns [EObject current=null] : ( (lv_target_0_0= '*' ) ) ;
    public final EObject ruleAllTarget() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1363:2: ( ( (lv_target_0_0= '*' ) ) )
            // InternalBehaviourLanguage.g:1364:2: ( (lv_target_0_0= '*' ) )
            {
            // InternalBehaviourLanguage.g:1364:2: ( (lv_target_0_0= '*' ) )
            // InternalBehaviourLanguage.g:1365:3: (lv_target_0_0= '*' )
            {
            // InternalBehaviourLanguage.g:1365:3: (lv_target_0_0= '*' )
            // InternalBehaviourLanguage.g:1366:4: lv_target_0_0= '*'
            {
            lv_target_0_0=(Token)match(input,34,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:1381:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBehaviourLanguage.g:1381:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBehaviourLanguage.g:1382:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalBehaviourLanguage.g:1388:1: ruleCondition returns [EObject current=null] : (this_TaskStatusCondition_0= ruleTaskStatusCondition | this_RobotStatusCondition_1= ruleRobotStatusCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_TaskStatusCondition_0 = null;

        EObject this_RobotStatusCondition_1 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1394:2: ( (this_TaskStatusCondition_0= ruleTaskStatusCondition | this_RobotStatusCondition_1= ruleRobotStatusCondition ) )
            // InternalBehaviourLanguage.g:1395:2: (this_TaskStatusCondition_0= ruleTaskStatusCondition | this_RobotStatusCondition_1= ruleRobotStatusCondition )
            {
            // InternalBehaviourLanguage.g:1395:2: (this_TaskStatusCondition_0= ruleTaskStatusCondition | this_RobotStatusCondition_1= ruleRobotStatusCondition )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==35) ) {
                    switch ( input.LA(3) ) {
                    case 59:
                        {
                        alt21=1;
                        }
                        break;
                    case 60:
                    case 62:
                        {
                        alt21=2;
                        }
                        break;
                    case 61:
                    case 63:
                    case 64:
                    case 65:
                        {
                        alt21=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }

                }
                else if ( (LA21_1==36) ) {
                    switch ( input.LA(3) ) {
                    case 59:
                        {
                        alt21=1;
                        }
                        break;
                    case 61:
                    case 63:
                    case 64:
                    case 65:
                        {
                        alt21=1;
                        }
                        break;
                    case 60:
                    case 62:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalBehaviourLanguage.g:1396:3: this_TaskStatusCondition_0= ruleTaskStatusCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getTaskStatusConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskStatusCondition_0=ruleTaskStatusCondition();

                    state._fsp--;


                    			current = this_TaskStatusCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1405:3: this_RobotStatusCondition_1= ruleRobotStatusCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getRobotStatusConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RobotStatusCondition_1=ruleRobotStatusCondition();

                    state._fsp--;


                    			current = this_RobotStatusCondition_1;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTaskStatusCondition"
    // InternalBehaviourLanguage.g:1417:1: entryRuleTaskStatusCondition returns [EObject current=null] : iv_ruleTaskStatusCondition= ruleTaskStatusCondition EOF ;
    public final EObject entryRuleTaskStatusCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskStatusCondition = null;


        try {
            // InternalBehaviourLanguage.g:1417:60: (iv_ruleTaskStatusCondition= ruleTaskStatusCondition EOF )
            // InternalBehaviourLanguage.g:1418:2: iv_ruleTaskStatusCondition= ruleTaskStatusCondition EOF
            {
             newCompositeNode(grammarAccess.getTaskStatusConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskStatusCondition=ruleTaskStatusCondition();

            state._fsp--;

             current =iv_ruleTaskStatusCondition; 
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
    // $ANTLR end "entryRuleTaskStatusCondition"


    // $ANTLR start "ruleTaskStatusCondition"
    // InternalBehaviourLanguage.g:1424:1: ruleTaskStatusCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_taskStatus_3_0= ruleTaskExecutionStatus ) ) ) ;
    public final EObject ruleTaskStatusCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_equal_1_0=null;
        Token lv_notEqual_2_0=null;
        Enumerator lv_taskStatus_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1430:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_taskStatus_3_0= ruleTaskExecutionStatus ) ) ) )
            // InternalBehaviourLanguage.g:1431:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_taskStatus_3_0= ruleTaskExecutionStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1431:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_taskStatus_3_0= ruleTaskExecutionStatus ) ) )
            // InternalBehaviourLanguage.g:1432:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_taskStatus_3_0= ruleTaskExecutionStatus ) )
            {
            // InternalBehaviourLanguage.g:1432:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1433:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1433:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1434:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskStatusConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getTaskStatusConditionAccess().getTaskTaskExecutionCrossReference_0_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1445:3: ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBehaviourLanguage.g:1446:4: ( (lv_equal_1_0= '==' ) )
                    {
                    // InternalBehaviourLanguage.g:1446:4: ( (lv_equal_1_0= '==' ) )
                    // InternalBehaviourLanguage.g:1447:5: (lv_equal_1_0= '==' )
                    {
                    // InternalBehaviourLanguage.g:1447:5: (lv_equal_1_0= '==' )
                    // InternalBehaviourLanguage.g:1448:6: lv_equal_1_0= '=='
                    {
                    lv_equal_1_0=(Token)match(input,35,FOLLOW_31); 

                    						newLeafNode(lv_equal_1_0, grammarAccess.getTaskStatusConditionAccess().getEqualEqualsSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskStatusConditionRule());
                    						}
                    						setWithLastConsumed(current, "equal", true, "==");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1461:4: ( (lv_notEqual_2_0= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1461:4: ( (lv_notEqual_2_0= '!=' ) )
                    // InternalBehaviourLanguage.g:1462:5: (lv_notEqual_2_0= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1462:5: (lv_notEqual_2_0= '!=' )
                    // InternalBehaviourLanguage.g:1463:6: lv_notEqual_2_0= '!='
                    {
                    lv_notEqual_2_0=(Token)match(input,36,FOLLOW_31); 

                    						newLeafNode(lv_notEqual_2_0, grammarAccess.getTaskStatusConditionAccess().getNotEqualExclamationMarkEqualsSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskStatusConditionRule());
                    						}
                    						setWithLastConsumed(current, "notEqual", true, "!=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1476:3: ( (lv_taskStatus_3_0= ruleTaskExecutionStatus ) )
            // InternalBehaviourLanguage.g:1477:4: (lv_taskStatus_3_0= ruleTaskExecutionStatus )
            {
            // InternalBehaviourLanguage.g:1477:4: (lv_taskStatus_3_0= ruleTaskExecutionStatus )
            // InternalBehaviourLanguage.g:1478:5: lv_taskStatus_3_0= ruleTaskExecutionStatus
            {

            					newCompositeNode(grammarAccess.getTaskStatusConditionAccess().getTaskStatusTaskExecutionStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_taskStatus_3_0=ruleTaskExecutionStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskStatusConditionRule());
            					}
            					set(
            						current,
            						"taskStatus",
            						lv_taskStatus_3_0,
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
    // $ANTLR end "ruleTaskStatusCondition"


    // $ANTLR start "entryRuleRobotStatusCondition"
    // InternalBehaviourLanguage.g:1499:1: entryRuleRobotStatusCondition returns [EObject current=null] : iv_ruleRobotStatusCondition= ruleRobotStatusCondition EOF ;
    public final EObject entryRuleRobotStatusCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotStatusCondition = null;


        try {
            // InternalBehaviourLanguage.g:1499:61: (iv_ruleRobotStatusCondition= ruleRobotStatusCondition EOF )
            // InternalBehaviourLanguage.g:1500:2: iv_ruleRobotStatusCondition= ruleRobotStatusCondition EOF
            {
             newCompositeNode(grammarAccess.getRobotStatusConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotStatusCondition=ruleRobotStatusCondition();

            state._fsp--;

             current =iv_ruleRobotStatusCondition; 
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
    // $ANTLR end "entryRuleRobotStatusCondition"


    // $ANTLR start "ruleRobotStatusCondition"
    // InternalBehaviourLanguage.g:1506:1: ruleRobotStatusCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_robotStatus_3_0= ruleRobotStatus ) ) ) ;
    public final EObject ruleRobotStatusCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_equal_1_0=null;
        Token lv_notEqual_2_0=null;
        Enumerator lv_robotStatus_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1512:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_robotStatus_3_0= ruleRobotStatus ) ) ) )
            // InternalBehaviourLanguage.g:1513:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_robotStatus_3_0= ruleRobotStatus ) ) )
            {
            // InternalBehaviourLanguage.g:1513:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_robotStatus_3_0= ruleRobotStatus ) ) )
            // InternalBehaviourLanguage.g:1514:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) ) ( (lv_robotStatus_3_0= ruleRobotStatus ) )
            {
            // InternalBehaviourLanguage.g:1514:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehaviourLanguage.g:1515:4: (otherlv_0= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1515:4: (otherlv_0= RULE_ID )
            // InternalBehaviourLanguage.g:1516:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotStatusConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getRobotStatusConditionAccess().getRobotDynamicRobotCrossReference_0_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1527:3: ( ( (lv_equal_1_0= '==' ) ) | ( (lv_notEqual_2_0= '!=' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBehaviourLanguage.g:1528:4: ( (lv_equal_1_0= '==' ) )
                    {
                    // InternalBehaviourLanguage.g:1528:4: ( (lv_equal_1_0= '==' ) )
                    // InternalBehaviourLanguage.g:1529:5: (lv_equal_1_0= '==' )
                    {
                    // InternalBehaviourLanguage.g:1529:5: (lv_equal_1_0= '==' )
                    // InternalBehaviourLanguage.g:1530:6: lv_equal_1_0= '=='
                    {
                    lv_equal_1_0=(Token)match(input,35,FOLLOW_30); 

                    						newLeafNode(lv_equal_1_0, grammarAccess.getRobotStatusConditionAccess().getEqualEqualsSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRobotStatusConditionRule());
                    						}
                    						setWithLastConsumed(current, "equal", true, "==");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:1543:4: ( (lv_notEqual_2_0= '!=' ) )
                    {
                    // InternalBehaviourLanguage.g:1543:4: ( (lv_notEqual_2_0= '!=' ) )
                    // InternalBehaviourLanguage.g:1544:5: (lv_notEqual_2_0= '!=' )
                    {
                    // InternalBehaviourLanguage.g:1544:5: (lv_notEqual_2_0= '!=' )
                    // InternalBehaviourLanguage.g:1545:6: lv_notEqual_2_0= '!='
                    {
                    lv_notEqual_2_0=(Token)match(input,36,FOLLOW_30); 

                    						newLeafNode(lv_notEqual_2_0, grammarAccess.getRobotStatusConditionAccess().getNotEqualExclamationMarkEqualsSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRobotStatusConditionRule());
                    						}
                    						setWithLastConsumed(current, "notEqual", true, "!=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1558:3: ( (lv_robotStatus_3_0= ruleRobotStatus ) )
            // InternalBehaviourLanguage.g:1559:4: (lv_robotStatus_3_0= ruleRobotStatus )
            {
            // InternalBehaviourLanguage.g:1559:4: (lv_robotStatus_3_0= ruleRobotStatus )
            // InternalBehaviourLanguage.g:1560:5: lv_robotStatus_3_0= ruleRobotStatus
            {

            					newCompositeNode(grammarAccess.getRobotStatusConditionAccess().getRobotStatusRobotStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_robotStatus_3_0=ruleRobotStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotStatusConditionRule());
            					}
            					set(
            						current,
            						"robotStatus",
            						lv_robotStatus_3_0,
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
    // $ANTLR end "ruleRobotStatusCondition"


    // $ANTLR start "entryRuleTaskExecution"
    // InternalBehaviourLanguage.g:1581:1: entryRuleTaskExecution returns [EObject current=null] : iv_ruleTaskExecution= ruleTaskExecution EOF ;
    public final EObject entryRuleTaskExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskExecution = null;


        try {
            // InternalBehaviourLanguage.g:1581:54: (iv_ruleTaskExecution= ruleTaskExecution EOF )
            // InternalBehaviourLanguage.g:1582:2: iv_ruleTaskExecution= ruleTaskExecution EOF
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
    // InternalBehaviourLanguage.g:1588:1: ruleTaskExecution returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTaskExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_executionTime_5_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1594:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? otherlv_6= '}' ) )
            // InternalBehaviourLanguage.g:1595:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? otherlv_6= '}' )
            {
            // InternalBehaviourLanguage.g:1595:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? otherlv_6= '}' )
            // InternalBehaviourLanguage.g:1596:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )? otherlv_6= '}'
            {
            // InternalBehaviourLanguage.g:1596:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:1597:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:1597:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:1598:5: lv_name_0_0= ruleEString
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
            		
            // InternalBehaviourLanguage.g:1619:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehaviourLanguage.g:1620:4: (otherlv_2= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1620:4: (otherlv_2= RULE_ID )
            // InternalBehaviourLanguage.g:1621:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskExecutionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getTaskExecutionAccess().getTaskTaskCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehaviourLanguage.g:1636:3: (otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBehaviourLanguage.g:1637:4: otherlv_4= 'executionTime' ( (lv_executionTime_5_0= ruleMeasureValue ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskExecutionAccess().getExecutionTimeKeyword_4_0());
                    			
                    // InternalBehaviourLanguage.g:1641:4: ( (lv_executionTime_5_0= ruleMeasureValue ) )
                    // InternalBehaviourLanguage.g:1642:5: (lv_executionTime_5_0= ruleMeasureValue )
                    {
                    // InternalBehaviourLanguage.g:1642:5: (lv_executionTime_5_0= ruleMeasureValue )
                    // InternalBehaviourLanguage.g:1643:6: lv_executionTime_5_0= ruleMeasureValue
                    {

                    						newCompositeNode(grammarAccess.getTaskExecutionAccess().getExecutionTimeMeasureValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskExecutionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalBehaviourLanguage.g:1669:1: entryRuleTaskRequirement returns [EObject current=null] : iv_ruleTaskRequirement= ruleTaskRequirement EOF ;
    public final EObject entryRuleTaskRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequirement = null;


        try {
            // InternalBehaviourLanguage.g:1669:56: (iv_ruleTaskRequirement= ruleTaskRequirement EOF )
            // InternalBehaviourLanguage.g:1670:2: iv_ruleTaskRequirement= ruleTaskRequirement EOF
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
    // InternalBehaviourLanguage.g:1676:1: ruleTaskRequirement returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'participants' ( (lv_participants_2_0= ruleEInt ) ) otherlv_3= 'taskExecution' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'prerequisite' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'requiredCapabilities' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? (otherlv_19= 'capabilityProperties' otherlv_20= '{' ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) ) (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleTaskRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_participants_2_0 = null;

        EObject lv_properties_15_0 = null;

        EObject lv_properties_17_0 = null;

        EObject lv_capabilityProperties_21_0 = null;

        EObject lv_capabilityProperties_23_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1682:2: ( (otherlv_0= '{' otherlv_1= 'participants' ( (lv_participants_2_0= ruleEInt ) ) otherlv_3= 'taskExecution' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'prerequisite' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'requiredCapabilities' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? (otherlv_19= 'capabilityProperties' otherlv_20= '{' ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) ) (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalBehaviourLanguage.g:1683:2: (otherlv_0= '{' otherlv_1= 'participants' ( (lv_participants_2_0= ruleEInt ) ) otherlv_3= 'taskExecution' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'prerequisite' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'requiredCapabilities' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? (otherlv_19= 'capabilityProperties' otherlv_20= '{' ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) ) (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalBehaviourLanguage.g:1683:2: (otherlv_0= '{' otherlv_1= 'participants' ( (lv_participants_2_0= ruleEInt ) ) otherlv_3= 'taskExecution' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'prerequisite' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'requiredCapabilities' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? (otherlv_19= 'capabilityProperties' otherlv_20= '{' ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) ) (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalBehaviourLanguage.g:1684:3: otherlv_0= '{' otherlv_1= 'participants' ( (lv_participants_2_0= ruleEInt ) ) otherlv_3= 'taskExecution' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'prerequisite' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'requiredCapabilities' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )? (otherlv_19= 'capabilityProperties' otherlv_20= '{' ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) ) (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRequirementAccess().getParticipantsKeyword_1());
            		
            // InternalBehaviourLanguage.g:1692:3: ( (lv_participants_2_0= ruleEInt ) )
            // InternalBehaviourLanguage.g:1693:4: (lv_participants_2_0= ruleEInt )
            {
            // InternalBehaviourLanguage.g:1693:4: (lv_participants_2_0= ruleEInt )
            // InternalBehaviourLanguage.g:1694:5: lv_participants_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTaskRequirementAccess().getParticipantsEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_participants_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
            					}
            					set(
            						current,
            						"participants",
            						lv_participants_2_0,
            						"hu.bme.mdsd.ztz.text.BehaviourLanguage.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRequirementAccess().getTaskExecutionKeyword_3());
            		
            // InternalBehaviourLanguage.g:1715:3: ( (otherlv_4= RULE_ID ) )
            // InternalBehaviourLanguage.g:1716:4: (otherlv_4= RULE_ID )
            {
            // InternalBehaviourLanguage.g:1716:4: (otherlv_4= RULE_ID )
            // InternalBehaviourLanguage.g:1717:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRequirementRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_4, grammarAccess.getTaskRequirementAccess().getTaskExecutionTaskExecutionCrossReference_4_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:1728:3: (otherlv_5= 'prerequisite' ( (otherlv_6= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBehaviourLanguage.g:1729:4: otherlv_5= 'prerequisite' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskRequirementAccess().getPrerequisiteKeyword_5_0());
                    			
                    // InternalBehaviourLanguage.g:1733:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1734:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1734:5: (otherlv_6= RULE_ID )
                    // InternalBehaviourLanguage.g:1735:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(otherlv_6, grammarAccess.getTaskRequirementAccess().getPrerequisiteTaskExecutionCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1747:3: (otherlv_7= 'requiredCapabilities' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBehaviourLanguage.g:1748:4: otherlv_7= 'requiredCapabilities' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,32,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskRequirementAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalBehaviourLanguage.g:1756:4: ( (otherlv_9= RULE_ID ) )
                    // InternalBehaviourLanguage.g:1757:5: (otherlv_9= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:1757:5: (otherlv_9= RULE_ID )
                    // InternalBehaviourLanguage.g:1758:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRequirementRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_9, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_6_2_0());
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1769:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1770:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getTaskRequirementAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1774:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalBehaviourLanguage.g:1775:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalBehaviourLanguage.g:1775:6: (otherlv_11= RULE_ID )
                    	    // InternalBehaviourLanguage.g:1776:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskRequirementRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesCapabilityCrossReference_6_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,33,FOLLOW_42); 

                    				newLeafNode(otherlv_12, grammarAccess.getTaskRequirementAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1793:3: (otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBehaviourLanguage.g:1794:4: otherlv_13= 'properties' otherlv_14= '{' ( (lv_properties_15_0= ruleProperty ) ) (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getTaskRequirementAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_43); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBehaviourLanguage.g:1802:4: ( (lv_properties_15_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:1803:5: (lv_properties_15_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:1803:5: (lv_properties_15_0= ruleProperty )
                    // InternalBehaviourLanguage.g:1804:6: lv_properties_15_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_properties_15_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_15_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1821:4: (otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1822:5: otherlv_16= ',' ( (lv_properties_17_0= ruleProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTaskRequirementAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1826:5: ( (lv_properties_17_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:1827:6: (lv_properties_17_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:1827:6: (lv_properties_17_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:1828:7: lv_properties_17_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getPropertiesPropertyParserRuleCall_7_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FOLLOW_44); 

                    				newLeafNode(otherlv_18, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:1851:3: (otherlv_19= 'capabilityProperties' otherlv_20= '{' ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) ) (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )* otherlv_24= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBehaviourLanguage.g:1852:4: otherlv_19= 'capabilityProperties' otherlv_20= '{' ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) ) (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_45); 

                    				newLeafNode(otherlv_20, grammarAccess.getTaskRequirementAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehaviourLanguage.g:1860:4: ( (lv_capabilityProperties_21_0= ruleCapabilityProperties ) )
                    // InternalBehaviourLanguage.g:1861:5: (lv_capabilityProperties_21_0= ruleCapabilityProperties )
                    {
                    // InternalBehaviourLanguage.g:1861:5: (lv_capabilityProperties_21_0= ruleCapabilityProperties )
                    // InternalBehaviourLanguage.g:1862:6: lv_capabilityProperties_21_0= ruleCapabilityProperties
                    {

                    						newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_capabilityProperties_21_0=ruleCapabilityProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRequirementRule());
                    						}
                    						add(
                    							current,
                    							"capabilityProperties",
                    							lv_capabilityProperties_21_0,
                    							"hu.bme.mdsd.ztz.text.BehaviourLanguage.CapabilityProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehaviourLanguage.g:1879:4: (otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:1880:5: otherlv_22= ',' ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FOLLOW_45); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTaskRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:1884:5: ( (lv_capabilityProperties_23_0= ruleCapabilityProperties ) )
                    	    // InternalBehaviourLanguage.g:1885:6: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    	    {
                    	    // InternalBehaviourLanguage.g:1885:6: (lv_capabilityProperties_23_0= ruleCapabilityProperties )
                    	    // InternalBehaviourLanguage.g:1886:7: lv_capabilityProperties_23_0= ruleCapabilityProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesCapabilityPropertiesParserRuleCall_8_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_24, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getTaskRequirementAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalBehaviourLanguage.g:1917:1: entryRuleBehaviouralPropertyKeyContainer returns [EObject current=null] : iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF ;
    public final EObject entryRuleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralPropertyKeyContainer = null;


        try {
            // InternalBehaviourLanguage.g:1917:72: (iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF )
            // InternalBehaviourLanguage.g:1918:2: iv_ruleBehaviouralPropertyKeyContainer= ruleBehaviouralPropertyKeyContainer EOF
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
    // InternalBehaviourLanguage.g:1924:1: ruleBehaviouralPropertyKeyContainer returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBehaviouralPropertyKeyContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keys_2_0 = null;

        EObject lv_keys_4_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:1930:2: ( ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' ) )
            // InternalBehaviourLanguage.g:1931:2: ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' )
            {
            // InternalBehaviourLanguage.g:1931:2: ( () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}' )
            // InternalBehaviourLanguage.g:1932:3: () otherlv_1= '{' ( (lv_keys_2_0= rulePropertyKey ) ) (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )* otherlv_5= '}'
            {
            // InternalBehaviourLanguage.g:1932:3: ()
            // InternalBehaviourLanguage.g:1933:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviouralPropertyKeyContainerAccess().getBehaviouralPropertyKeyContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehaviourLanguage.g:1943:3: ( (lv_keys_2_0= rulePropertyKey ) )
            // InternalBehaviourLanguage.g:1944:4: (lv_keys_2_0= rulePropertyKey )
            {
            // InternalBehaviourLanguage.g:1944:4: (lv_keys_2_0= rulePropertyKey )
            // InternalBehaviourLanguage.g:1945:5: lv_keys_2_0= rulePropertyKey
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

            // InternalBehaviourLanguage.g:1962:3: (otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBehaviourLanguage.g:1963:4: otherlv_3= ',' ( (lv_keys_4_0= rulePropertyKey ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getBehaviouralPropertyKeyContainerAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBehaviourLanguage.g:1967:4: ( (lv_keys_4_0= rulePropertyKey ) )
            	    // InternalBehaviourLanguage.g:1968:5: (lv_keys_4_0= rulePropertyKey )
            	    {
            	    // InternalBehaviourLanguage.g:1968:5: (lv_keys_4_0= rulePropertyKey )
            	    // InternalBehaviourLanguage.g:1969:6: lv_keys_4_0= rulePropertyKey
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
            	    break loop32;
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
    // InternalBehaviourLanguage.g:1995:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBehaviourLanguage.g:1995:47: (iv_ruleEString= ruleEString EOF )
            // InternalBehaviourLanguage.g:1996:2: iv_ruleEString= ruleEString EOF
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
    // InternalBehaviourLanguage.g:2002:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2008:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2009:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2009:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalBehaviourLanguage.g:2010:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:2018:3: this_ID_1= RULE_ID
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
    // InternalBehaviourLanguage.g:2029:1: entryRuleRobotCollaboration returns [EObject current=null] : iv_ruleRobotCollaboration= ruleRobotCollaboration EOF ;
    public final EObject entryRuleRobotCollaboration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotCollaboration = null;


        try {
            // InternalBehaviourLanguage.g:2029:59: (iv_ruleRobotCollaboration= ruleRobotCollaboration EOF )
            // InternalBehaviourLanguage.g:2030:2: iv_ruleRobotCollaboration= ruleRobotCollaboration EOF
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
    // InternalBehaviourLanguage.g:2036:1: ruleRobotCollaboration returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalBehaviourLanguage.g:2042:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? ) )
            // InternalBehaviourLanguage.g:2043:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? )
            {
            // InternalBehaviourLanguage.g:2043:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )? )
            // InternalBehaviourLanguage.g:2044:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )?
            {
            // InternalBehaviourLanguage.g:2044:3: ()
            // InternalBehaviourLanguage.g:2045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotCollaborationAccess().getRobotCollaborationAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:2051:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2052:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2052:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:2053:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotCollaborationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_1, grammarAccess.getRobotCollaborationAccess().getCollaboratorDynamicRobotCrossReference_1_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2064:3: (otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBehaviourLanguage.g:2065:4: otherlv_2= 'properties' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getRobotCollaborationAccess().getPropertiesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotCollaborationAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalBehaviourLanguage.g:2073:4: ( (lv_properties_4_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2074:5: (lv_properties_4_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2074:5: (lv_properties_4_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2075:6: lv_properties_4_0= ruleProperty
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

                    // InternalBehaviourLanguage.g:2092:4: (otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2093:5: otherlv_5= ',' ( (lv_properties_6_0= ruleProperty ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRobotCollaborationAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2097:5: ( (lv_properties_6_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2098:6: (lv_properties_6_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2098:6: (lv_properties_6_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2099:7: lv_properties_6_0= ruleProperty
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
                    	    break loop34;
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
    // InternalBehaviourLanguage.g:2126:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalBehaviourLanguage.g:2126:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalBehaviourLanguage.g:2127:2: iv_ruleAction_Impl= ruleAction_Impl EOF
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
    // InternalBehaviourLanguage.g:2133:1: ruleAction_Impl returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? ) ;
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
            // InternalBehaviourLanguage.g:2139:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? ) )
            // InternalBehaviourLanguage.g:2140:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? )
            {
            // InternalBehaviourLanguage.g:2140:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )? )
            // InternalBehaviourLanguage.g:2141:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )?
            {
            // InternalBehaviourLanguage.g:2141:3: ()
            // InternalBehaviourLanguage.g:2142:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:2148:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2149:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2149:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:2150:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAction_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalBehaviourLanguage.g:2167:3: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBehaviourLanguage.g:2168:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getAction_ImplAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBehaviourLanguage.g:2172:4: ( (otherlv_3= RULE_ID ) )
                    // InternalBehaviourLanguage.g:2173:5: (otherlv_3= RULE_ID )
                    {
                    // InternalBehaviourLanguage.g:2173:5: (otherlv_3= RULE_ID )
                    // InternalBehaviourLanguage.g:2174:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_48); 

                    						newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getCurrentTaskExecutionTaskExecutionCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2190:3: (otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBehaviourLanguage.g:2191:4: otherlv_5= 'properties' otherlv_6= '{' ( (lv_properties_7_0= ruleProperty ) ) (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getAction_ImplAccess().getPropertiesKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBehaviourLanguage.g:2199:4: ( (lv_properties_7_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2200:5: (lv_properties_7_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2200:5: (lv_properties_7_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2201:6: lv_properties_7_0= ruleProperty
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

                    // InternalBehaviourLanguage.g:2218:4: (otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2219:5: otherlv_8= ',' ( (lv_properties_9_0= ruleProperty ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAction_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2223:5: ( (lv_properties_9_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2224:6: (lv_properties_9_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2224:6: (lv_properties_9_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2225:7: lv_properties_9_0= ruleProperty
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
                    	    break loop37;
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
    // InternalBehaviourLanguage.g:2252:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalBehaviourLanguage.g:2252:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalBehaviourLanguage.g:2253:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalBehaviourLanguage.g:2259:1: ruleProperty returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2265:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' ) )
            // InternalBehaviourLanguage.g:2266:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' )
            {
            // InternalBehaviourLanguage.g:2266:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']' )
            // InternalBehaviourLanguage.g:2267:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBehaviourLanguage.g:2271:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehaviourLanguage.g:2272:4: (otherlv_1= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2272:4: (otherlv_1= RULE_ID )
            // InternalBehaviourLanguage.g:2273:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getKeyPropertyKeyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
            		
            // InternalBehaviourLanguage.g:2288:3: ( (lv_value_3_0= rulePropertyValue ) )
            // InternalBehaviourLanguage.g:2289:4: (lv_value_3_0= rulePropertyValue )
            {
            // InternalBehaviourLanguage.g:2289:4: (lv_value_3_0= rulePropertyValue )
            // InternalBehaviourLanguage.g:2290:5: lv_value_3_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
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

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:2315:1: entryRuleMeasureValue returns [EObject current=null] : iv_ruleMeasureValue= ruleMeasureValue EOF ;
    public final EObject entryRuleMeasureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue = null;


        try {
            // InternalBehaviourLanguage.g:2315:53: (iv_ruleMeasureValue= ruleMeasureValue EOF )
            // InternalBehaviourLanguage.g:2316:2: iv_ruleMeasureValue= ruleMeasureValue EOF
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
    // InternalBehaviourLanguage.g:2322:1: ruleMeasureValue returns [EObject current=null] : (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMeasureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2328:2: ( (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBehaviourLanguage.g:2329:2: (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBehaviourLanguage.g:2329:2: (otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            // InternalBehaviourLanguage.g:2330:3: otherlv_0= 'measure ' ( (lv_value_1_0= ruleEFloat ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureValueAccess().getMeasureKeyword_0());
            		
            // InternalBehaviourLanguage.g:2334:3: ( (lv_value_1_0= ruleEFloat ) )
            // InternalBehaviourLanguage.g:2335:4: (lv_value_1_0= ruleEFloat )
            {
            // InternalBehaviourLanguage.g:2335:4: (lv_value_1_0= ruleEFloat )
            // InternalBehaviourLanguage.g:2336:5: lv_value_1_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getMeasureValueAccess().getValueEFloatParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_2=(Token)match(input,48,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasureValueAccess().getInKeyword_2());
            		
            // InternalBehaviourLanguage.g:2357:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:2358:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2358:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:2359:5: otherlv_3= RULE_ID
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
    // InternalBehaviourLanguage.g:2374:1: entryRuleCapabilityProperties returns [EObject current=null] : iv_ruleCapabilityProperties= ruleCapabilityProperties EOF ;
    public final EObject entryRuleCapabilityProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperties = null;


        try {
            // InternalBehaviourLanguage.g:2374:61: (iv_ruleCapabilityProperties= ruleCapabilityProperties EOF )
            // InternalBehaviourLanguage.g:2375:2: iv_ruleCapabilityProperties= ruleCapabilityProperties EOF
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
    // InternalBehaviourLanguage.g:2381:1: ruleCapabilityProperties returns [EObject current=null] : (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalBehaviourLanguage.g:2387:2: ( (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBehaviourLanguage.g:2388:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBehaviourLanguage.g:2388:2: (otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBehaviourLanguage.g:2389:3: otherlv_0= 'CapabilityProperties' otherlv_1= '{' otherlv_2= 'capability' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertiesAccess().getCapabilityPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertiesAccess().getCapabilityKeyword_2());
            		
            // InternalBehaviourLanguage.g:2401:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehaviourLanguage.g:2402:4: (otherlv_3= RULE_ID )
            {
            // InternalBehaviourLanguage.g:2402:4: (otherlv_3= RULE_ID )
            // InternalBehaviourLanguage.g:2403:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityPropertiesRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_3, grammarAccess.getCapabilityPropertiesAccess().getCapabilityCapabilityCrossReference_3_0());
            				

            }


            }

            // InternalBehaviourLanguage.g:2414:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBehaviourLanguage.g:2415:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertiesAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getCapabilityPropertiesAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBehaviourLanguage.g:2423:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalBehaviourLanguage.g:2424:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalBehaviourLanguage.g:2424:5: (lv_properties_6_0= ruleProperty )
                    // InternalBehaviourLanguage.g:2425:6: lv_properties_6_0= ruleProperty
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

                    // InternalBehaviourLanguage.g:2442:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalBehaviourLanguage.g:2443:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCapabilityPropertiesAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBehaviourLanguage.g:2447:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalBehaviourLanguage.g:2448:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalBehaviourLanguage.g:2448:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalBehaviourLanguage.g:2449:7: lv_properties_8_0= ruleProperty
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_13); 

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
    // InternalBehaviourLanguage.g:2480:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBehaviourLanguage.g:2480:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBehaviourLanguage.g:2481:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBehaviourLanguage.g:2487:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2493:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBehaviourLanguage.g:2494:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBehaviourLanguage.g:2494:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBehaviourLanguage.g:2495:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBehaviourLanguage.g:2495:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBehaviourLanguage.g:2496:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBehaviourLanguage.g:2502:3: (this_INT_1= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBehaviourLanguage.g:2503:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_57); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,52,FOLLOW_58); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_59); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBehaviourLanguage.g:2523:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=53 && LA45_0<=54)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBehaviourLanguage.g:2524:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBehaviourLanguage.g:2524:4: (kw= 'E' | kw= 'e' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==53) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==54) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2525:5: kw= 'E'
                            {
                            kw=(Token)match(input,53,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehaviourLanguage.g:2531:5: kw= 'e'
                            {
                            kw=(Token)match(input,54,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2537:4: (kw= '-' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==51) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2538:5: kw= '-'
                            {
                            kw=(Token)match(input,51,FOLLOW_58); 

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
    // InternalBehaviourLanguage.g:2556:1: entryRulePropertyKey returns [EObject current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final EObject entryRulePropertyKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKey = null;


        try {
            // InternalBehaviourLanguage.g:2556:52: (iv_rulePropertyKey= rulePropertyKey EOF )
            // InternalBehaviourLanguage.g:2557:2: iv_rulePropertyKey= rulePropertyKey EOF
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
    // InternalBehaviourLanguage.g:2563:1: rulePropertyKey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePropertyKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2569:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBehaviourLanguage.g:2570:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBehaviourLanguage.g:2570:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2571:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2571:3: ()
            // InternalBehaviourLanguage.g:2572:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyKeyAccess().getPropertyKeyAction_0(),
            					current);
            			

            }

            // InternalBehaviourLanguage.g:2578:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2579:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2579:4: (lv_name_1_0= ruleEString )
            // InternalBehaviourLanguage.g:2580:5: lv_name_1_0= ruleEString
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
    // InternalBehaviourLanguage.g:2601:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBehaviourLanguage.g:2601:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBehaviourLanguage.g:2602:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalBehaviourLanguage.g:2608:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2614:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalBehaviourLanguage.g:2615:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalBehaviourLanguage.g:2615:2: ( (lv_value_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2616:3: (lv_value_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2616:3: (lv_value_0_0= ruleEString )
            // InternalBehaviourLanguage.g:2617:4: lv_value_0_0= ruleEString
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
    // InternalBehaviourLanguage.g:2637:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalBehaviourLanguage.g:2637:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalBehaviourLanguage.g:2638:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalBehaviourLanguage.g:2644:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) ;
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
            // InternalBehaviourLanguage.g:2650:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? ) )
            // InternalBehaviourLanguage.g:2651:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            {
            // InternalBehaviourLanguage.g:2651:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )? )
            // InternalBehaviourLanguage.g:2652:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            {
            // InternalBehaviourLanguage.g:2652:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBehaviourLanguage.g:2653:4: (lv_name_0_0= ruleEString )
            {
            // InternalBehaviourLanguage.g:2653:4: (lv_name_0_0= ruleEString )
            // InternalBehaviourLanguage.g:2654:5: lv_name_0_0= ruleEString
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

            // InternalBehaviourLanguage.g:2671:3: (otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==13) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBehaviourLanguage.g:2672:4: otherlv_1= '{' (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )? (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )? (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )? otherlv_24= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_61); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalBehaviourLanguage.g:2676:4: (otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==17) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2677:5: otherlv_2= 'TaskExecutions' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_41); 

                            					newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getTaskExecutionsKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,32,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_1_1());
                            				
                            // InternalBehaviourLanguage.g:2685:5: ( (otherlv_4= RULE_ID ) )
                            // InternalBehaviourLanguage.g:2686:6: (otherlv_4= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:2686:6: (otherlv_4= RULE_ID )
                            // InternalBehaviourLanguage.g:2687:7: otherlv_4= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_32); 

                            							newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:2698:5: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==15) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:2699:6: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                            	    {
                            	    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getCommaKeyword_1_1_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:2703:6: ( (otherlv_6= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:2704:7: (otherlv_6= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:2704:7: (otherlv_6= RULE_ID )
                            	    // InternalBehaviourLanguage.g:2705:8: otherlv_6= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

                            	    								newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getInvolvedTaskExecutionsTaskExecutionCrossReference_1_1_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,33,FOLLOW_62); 

                            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_1_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2722:4: (otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==55) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2723:5: otherlv_8= 'Objects' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
                            {
                            otherlv_8=(Token)match(input,55,FOLLOW_41); 

                            					newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getObjectsKeyword_1_2_0());
                            				
                            otherlv_9=(Token)match(input,32,FOLLOW_15); 

                            					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_2_1());
                            				
                            // InternalBehaviourLanguage.g:2731:5: ( (otherlv_10= RULE_ID ) )
                            // InternalBehaviourLanguage.g:2732:6: (otherlv_10= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:2732:6: (otherlv_10= RULE_ID )
                            // InternalBehaviourLanguage.g:2733:7: otherlv_10= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageRule());
                            							}
                            						
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_32); 

                            							newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_2_0());
                            						

                            }


                            }

                            // InternalBehaviourLanguage.g:2744:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==15) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:2745:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                            	    {
                            	    otherlv_11=(Token)match(input,15,FOLLOW_15); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getCommaKeyword_1_2_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:2749:6: ( (otherlv_12= RULE_ID ) )
                            	    // InternalBehaviourLanguage.g:2750:7: (otherlv_12= RULE_ID )
                            	    {
                            	    // InternalBehaviourLanguage.g:2750:7: (otherlv_12= RULE_ID )
                            	    // InternalBehaviourLanguage.g:2751:8: otherlv_12= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMessageRule());
                            	    								}
                            	    							
                            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_32); 

                            	    								newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getReferredObjectsAreaObjectCrossReference_1_2_3_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,33,FOLLOW_63); 

                            					newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_2_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2768:4: (otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==56) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2769:5: otherlv_14= 'Follows' ( (otherlv_15= RULE_ID ) )
                            {
                            otherlv_14=(Token)match(input,56,FOLLOW_15); 

                            					newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getFollowsKeyword_1_3_0());
                            				
                            // InternalBehaviourLanguage.g:2773:5: ( (otherlv_15= RULE_ID ) )
                            // InternalBehaviourLanguage.g:2774:6: (otherlv_15= RULE_ID )
                            {
                            // InternalBehaviourLanguage.g:2774:6: (otherlv_15= RULE_ID )
                            // InternalBehaviourLanguage.g:2775:7: otherlv_15= RULE_ID
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

                    // InternalBehaviourLanguage.g:2787:4: (otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==57) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2788:5: otherlv_16= 'Properties' otherlv_17= '{' ( (lv_properties_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )* otherlv_21= '}'
                            {
                            otherlv_16=(Token)match(input,57,FOLLOW_6); 

                            					newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getPropertiesKeyword_1_4_0());
                            				
                            otherlv_17=(Token)match(input,13,FOLLOW_43); 

                            					newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_4_1());
                            				
                            // InternalBehaviourLanguage.g:2796:5: ( (lv_properties_18_0= ruleProperty ) )
                            // InternalBehaviourLanguage.g:2797:6: (lv_properties_18_0= ruleProperty )
                            {
                            // InternalBehaviourLanguage.g:2797:6: (lv_properties_18_0= ruleProperty )
                            // InternalBehaviourLanguage.g:2798:7: lv_properties_18_0= ruleProperty
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

                            // InternalBehaviourLanguage.g:2815:5: (otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==15) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalBehaviourLanguage.g:2816:6: otherlv_19= ',' ( (lv_properties_20_0= ruleProperty ) )
                            	    {
                            	    otherlv_19=(Token)match(input,15,FOLLOW_43); 

                            	    						newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getCommaKeyword_1_4_3_0());
                            	    					
                            	    // InternalBehaviourLanguage.g:2820:6: ( (lv_properties_20_0= ruleProperty ) )
                            	    // InternalBehaviourLanguage.g:2821:7: (lv_properties_20_0= ruleProperty )
                            	    {
                            	    // InternalBehaviourLanguage.g:2821:7: (lv_properties_20_0= ruleProperty )
                            	    // InternalBehaviourLanguage.g:2822:8: lv_properties_20_0= ruleProperty
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
                            	    break loop51;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,16,FOLLOW_65); 

                            					newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_1_4_4());
                            				

                            }
                            break;

                    }

                    // InternalBehaviourLanguage.g:2845:4: (otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==58) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalBehaviourLanguage.g:2846:5: otherlv_22= 'TTL' ( (lv_TTL_23_0= ruleMeasureValue ) )
                            {
                            otherlv_22=(Token)match(input,58,FOLLOW_35); 

                            					newLeafNode(otherlv_22, grammarAccess.getMessageAccess().getTTLKeyword_1_5_0());
                            				
                            // InternalBehaviourLanguage.g:2850:5: ( (lv_TTL_23_0= ruleMeasureValue ) )
                            // InternalBehaviourLanguage.g:2851:6: (lv_TTL_23_0= ruleMeasureValue )
                            {
                            // InternalBehaviourLanguage.g:2851:6: (lv_TTL_23_0= ruleMeasureValue )
                            // InternalBehaviourLanguage.g:2852:7: lv_TTL_23_0= ruleMeasureValue
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
    // InternalBehaviourLanguage.g:2879:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBehaviourLanguage.g:2879:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBehaviourLanguage.g:2880:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBehaviourLanguage.g:2886:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2892:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBehaviourLanguage.g:2893:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBehaviourLanguage.g:2893:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBehaviourLanguage.g:2894:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBehaviourLanguage.g:2894:3: (kw= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBehaviourLanguage.g:2895:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_58); 

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
    // InternalBehaviourLanguage.g:2912:1: ruleRobotStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) ) ;
    public final Enumerator ruleRobotStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2918:2: ( ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) ) )
            // InternalBehaviourLanguage.g:2919:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) )
            {
            // InternalBehaviourLanguage.g:2919:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'TurnedOff' ) | (enumLiteral_2= 'Waiting' ) | (enumLiteral_3= 'Executing' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt56=1;
                }
                break;
            case 60:
                {
                alt56=2;
                }
                break;
            case 61:
                {
                alt56=3;
                }
                break;
            case 62:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalBehaviourLanguage.g:2920:3: (enumLiteral_0= 'Ready' )
                    {
                    // InternalBehaviourLanguage.g:2920:3: (enumLiteral_0= 'Ready' )
                    // InternalBehaviourLanguage.g:2921:4: enumLiteral_0= 'Ready'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRobotStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:2928:3: (enumLiteral_1= 'TurnedOff' )
                    {
                    // InternalBehaviourLanguage.g:2928:3: (enumLiteral_1= 'TurnedOff' )
                    // InternalBehaviourLanguage.g:2929:4: enumLiteral_1= 'TurnedOff'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRobotStatusAccess().getTurnedOffEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:2936:3: (enumLiteral_2= 'Waiting' )
                    {
                    // InternalBehaviourLanguage.g:2936:3: (enumLiteral_2= 'Waiting' )
                    // InternalBehaviourLanguage.g:2937:4: enumLiteral_2= 'Waiting'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRobotStatusAccess().getWaitingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:2944:3: (enumLiteral_3= 'Executing' )
                    {
                    // InternalBehaviourLanguage.g:2944:3: (enumLiteral_3= 'Executing' )
                    // InternalBehaviourLanguage.g:2945:4: enumLiteral_3= 'Executing'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

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
    // InternalBehaviourLanguage.g:2955:1: ruleTaskExecutionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) ;
    public final Enumerator ruleTaskExecutionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBehaviourLanguage.g:2961:2: ( ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) ) )
            // InternalBehaviourLanguage.g:2962:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            {
            // InternalBehaviourLanguage.g:2962:2: ( (enumLiteral_0= 'Ready' ) | (enumLiteral_1= 'Finished' ) | (enumLiteral_2= 'Suspended' ) | (enumLiteral_3= 'InProgress' ) | (enumLiteral_4= 'Waiting' ) )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt57=1;
                }
                break;
            case 63:
                {
                alt57=2;
                }
                break;
            case 64:
                {
                alt57=3;
                }
                break;
            case 65:
                {
                alt57=4;
                }
                break;
            case 61:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalBehaviourLanguage.g:2963:3: (enumLiteral_0= 'Ready' )
                    {
                    // InternalBehaviourLanguage.g:2963:3: (enumLiteral_0= 'Ready' )
                    // InternalBehaviourLanguage.g:2964:4: enumLiteral_0= 'Ready'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskExecutionStatusAccess().getReadyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehaviourLanguage.g:2971:3: (enumLiteral_1= 'Finished' )
                    {
                    // InternalBehaviourLanguage.g:2971:3: (enumLiteral_1= 'Finished' )
                    // InternalBehaviourLanguage.g:2972:4: enumLiteral_1= 'Finished'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskExecutionStatusAccess().getFinishedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehaviourLanguage.g:2979:3: (enumLiteral_2= 'Suspended' )
                    {
                    // InternalBehaviourLanguage.g:2979:3: (enumLiteral_2= 'Suspended' )
                    // InternalBehaviourLanguage.g:2980:4: enumLiteral_2= 'Suspended'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskExecutionStatusAccess().getSuspendedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehaviourLanguage.g:2987:3: (enumLiteral_3= 'InProgress' )
                    {
                    // InternalBehaviourLanguage.g:2987:3: (enumLiteral_3= 'InProgress' )
                    // InternalBehaviourLanguage.g:2988:4: enumLiteral_3= 'InProgress'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskExecutionStatusAccess().getInProgressEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBehaviourLanguage.g:2995:3: (enumLiteral_4= 'Waiting' )
                    {
                    // InternalBehaviourLanguage.g:2995:3: (enumLiteral_4= 'Waiting' )
                    // InternalBehaviourLanguage.g:2996:4: enumLiteral_4= 'Waiting'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200022L});
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000210020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000500000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xA800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000F0000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000E0000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040100000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0018000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0780000000030000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0780000000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0700000000010000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0600000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0400000000010000L});

}