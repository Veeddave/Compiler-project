public class Stmts extends Token {
	Stmt stmt;
	Stmts stmts;

	public Stmts(Stmt s, Stmts ss) {
		stmt = s;
		stmts = ss;
	}

	public String toString(int t) {
		return (stmt.toString(t) + (stmts != null ? stmts.toString(t) : ""));
	}

	String typeCheck() throws Exception {
		stmt.typeCheck();
		stmts.typeCheck();
		return "";
	}
}
