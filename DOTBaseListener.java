// Generated from DOT.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an implementation of {@link DOTListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class DOTBaseListener implements DOTListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>Start recognizing a digraph</p>
	 */
	@Override public void enterGraph(DOTParser.GraphContext ctx) {
		System.out.println("Start recognizing a digraph");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Finish recognizing a digraph</p>
	 */
	@Override public void exitGraph(DOTParser.GraphContext ctx) {
		System.out.println("Finish recognizing a digraph");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Start recognizing a cluster</p>
	 */
	@Override public void enterStmt_list(DOTParser.Stmt_listContext ctx) {
		System.out.println("Start recognizing a cluster");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Finish recognizing a cluster</p>
	 */
	@Override public void exitStmt_list(DOTParser.Stmt_listContext ctx) {
		System.out.println("Finish recognizing a cluster");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Start recognizing a property</p>
	 */
	@Override public void enterStmt(DOTParser.StmtContext ctx) {
		String txt= ctx.getText();
		if ( txt.contains("->") ){
			// do nothing
		} else {
			System.out.println("Start recognizing a property");
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Finish recognizing a property</p>
	 */
	@Override public void exitStmt(DOTParser.StmtContext ctx) {
		String txt= ctx.getText();
		if ( txt.contains("->") ){
			// do nothing
		} else {
			System.out.println("Finish recognizing a property");
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttr_list(DOTParser.Attr_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttr_list(DOTParser.Attr_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Recognizing a property</p>
	 */
	@Override public void enterA_list(DOTParser.A_listContext ctx) {
		int len = ctx.getText().split("\\,").length;
		for (int i=0;i<len;i++){
			System.out.println("Start recognizing a property");
			System.out.println("Finish recognizing a property");
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitA_list(DOTParser.A_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Start recognizing an edge statement</p>
	 */
	@Override public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
		System.out.println("Start recognizing an edge statement");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Finish recognizing an edge statement</p>
	 */
	@Override public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx) {
		System.out.println("Finish recognizing an edge statement");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEdgeRHS(DOTParser.EdgeRHSContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEdgeRHS(DOTParser.EdgeRHSContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEdgeop(DOTParser.EdgeopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEdgeop(DOTParser.EdgeopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNode_stmt(DOTParser.Node_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNode_stmt(DOTParser.Node_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNode_id(DOTParser.Node_idContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNode_id(DOTParser.Node_idContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPort(DOTParser.PortContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPort(DOTParser.PortContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Start recognizing a subgraph</p>
	 */
	@Override public void enterSubgraph(DOTParser.SubgraphContext ctx) {
		System.out.println("Start recognizing a subgraph");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Finish recognizing a subgraph</p>
	 */
	@Override public void exitSubgraph(DOTParser.SubgraphContext ctx) {
		System.out.println("Finish recognizing a subgraph");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterId(DOTParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitId(DOTParser.IdContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}