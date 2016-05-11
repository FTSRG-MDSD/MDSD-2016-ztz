/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.serializer;

import com.google.inject.Inject;
import hu.bme.mdsd.ztz.text.services.BehaviourLanguageGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BehaviourLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BehaviourLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActionDeclarationStatement___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Message___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_6__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BehaviourLanguageGrammarAccess) access;
		match_ActionDeclarationStatement___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getActionDeclarationStatementAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getActionDeclarationStatementAccess().getRightCurlyBracketKeyword_2_2()));
		match_Message___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_1_6()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ActionDeclarationStatement___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_ActionDeclarationStatement___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_6__q.equals(syntax))
				emit_Message___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) (rule end)
	 */
	protected void emit_ActionDeclarationStatement___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) (rule end)
	 */
	protected void emit_Message___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
