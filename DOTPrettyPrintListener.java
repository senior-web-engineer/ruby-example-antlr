
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
/**
 * This class provides an implementation of {@link DOTBaseListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class DOTPrettyPrintListener extends DOTBaseListener {
	/** "memory" for space; true for subgraph */
	Boolean memory = false;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGraph(DOTParser.GraphContext ctx) {
		System.out.println();
		System.out.println("Pretty-printed code:");
		System.out.println();
		// System.out.print("digraph ");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGraph(DOTParser.GraphContext ctx) {
		System.out.println("}");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStmt_list(DOTParser.Stmt_listContext ctx) {
		System.out.println(" { ");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStmt_list(DOTParser.Stmt_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStmt(DOTParser.StmtContext ctx) {
		String txt= ctx.getText();
		if ( txt.contains("->") ){
			// do nothing
		} else {
			System.out.print("  ");
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStmt(DOTParser.StmtContext ctx) {
		String txt= ctx.getText();
		if ( txt.contains("->") ){
			// do nothing
		} else {
			System.out.println("; ");
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx) {
		System.out.println("enterAttr_stmt" + ctx.getText());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx) {
		System.out.println("exitAttr_stmt" + ctx.getText());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttr_list(DOTParser.Attr_listContext ctx) {
		System.out.print(" [");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttr_list(DOTParser.Attr_listContext ctx) {
		System.out.print("]");
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterA_list(DOTParser.A_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitA_list(DOTParser.A_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
		if (memory) {
			System.out.print("    ");
		} else {
			System.out.print("  ");
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx) {
		System.out.println("; ");
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
	@Override public void enterEdgeop(DOTParser.EdgeopContext ctx) {
		System.out.print(" " + ctx.getText() + " ");
	 }
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
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSubgraph(DOTParser.SubgraphContext ctx) {
		// System.out.print("  subgraph ");
		memory = true;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSubgraph(DOTParser.SubgraphContext ctx) {
		System.out.println("  }");
		memory = false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterId(DOTParser.IdContext ctx) {
		System.out.print(ctx.getText());
	 }
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
	@Override public void visitTerminal(TerminalNode node) {
		String symbol = node.getText();
		if (symbol.contains("=")){
			System.out.print(" " + symbol + " ");
		} else if (symbol.contains(",")) {
			System.out.print(", ");
		} else if (symbol.contains("digraph") || symbol.contains("DIGRAPH")){
			System.out.print(symbol + " ");
		} else if (symbol.contains("subgraph") || symbol.contains("SUBGRAPH")){
			System.out.print("  " + symbol + " ");
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}