// $ANTLR 3.5.1 /home/uml/Pulpit/rpdc/Gramma.g 2019-02-26 10:39:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GrammaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIV", "ID", "INT", 
		"LP", "MINUS", "MUL", "NL", "PLUS", "RP", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DIV=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int LP=8;
	public static final int MINUS=9;
	public static final int MUL=10;
	public static final int NL=11;
	public static final int PLUS=12;
	public static final int RP=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "term", "expr", "plik", "atom"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public GrammaParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public GrammaParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public GrammaParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return GrammaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/uml/Pulpit/rpdc/Gramma.g"; }



	// $ANTLR start "plik"
	// /home/uml/Pulpit/rpdc/Gramma.g:6:3: plik : ( expr )* EOF ;
	public final void plik() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "plik");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 2);

		try {
			// /home/uml/Pulpit/rpdc/Gramma.g:7:5: ( ( expr )* EOF )
			dbg.enterAlt(1);

			// /home/uml/Pulpit/rpdc/Gramma.g:7:7: ( expr )* EOF
			{
			dbg.location(7,7);
			// /home/uml/Pulpit/rpdc/Gramma.g:7:7: ( expr )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= INT && LA1_0 <= LP)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Pulpit/rpdc/Gramma.g:7:7: expr
					{
					dbg.location(7,7);
					pushFollow(FOLLOW_expr_in_plik58);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(7,13);
			match(input,EOF,FOLLOW_EOF_in_plik61); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(8, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plik");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plik"



	// $ANTLR start "expr"
	// /home/uml/Pulpit/rpdc/Gramma.g:9:3: expr : term ( PLUS term | MINUS term )* ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 2);

		try {
			// /home/uml/Pulpit/rpdc/Gramma.g:10:5: ( term ( PLUS term | MINUS term )* )
			dbg.enterAlt(1);

			// /home/uml/Pulpit/rpdc/Gramma.g:10:7: term ( PLUS term | MINUS term )*
			{
			dbg.location(10,7);
			pushFollow(FOLLOW_term_in_expr80);
			term();
			state._fsp--;
			dbg.location(10,12);
			// /home/uml/Pulpit/rpdc/Gramma.g:10:12: ( PLUS term | MINUS term )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=3;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==PLUS) ) {
					alt2=1;
				}
				else if ( (LA2_0==MINUS) ) {
					alt2=2;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Pulpit/rpdc/Gramma.g:10:13: PLUS term
					{
					dbg.location(10,13);
					match(input,PLUS,FOLLOW_PLUS_in_expr83); dbg.location(10,18);
					pushFollow(FOLLOW_term_in_expr85);
					term();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/uml/Pulpit/rpdc/Gramma.g:11:7: MINUS term
					{
					dbg.location(11,7);
					match(input,MINUS,FOLLOW_MINUS_in_expr94); dbg.location(11,13);
					pushFollow(FOLLOW_term_in_expr96);
					term();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// /home/uml/Pulpit/rpdc/Gramma.g:13:3: term : atom ( MUL atom | DIV atom )* ;
	public final void term() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 2);

		try {
			// /home/uml/Pulpit/rpdc/Gramma.g:14:5: ( atom ( MUL atom | DIV atom )* )
			dbg.enterAlt(1);

			// /home/uml/Pulpit/rpdc/Gramma.g:14:7: atom ( MUL atom | DIV atom )*
			{
			dbg.location(14,7);
			pushFollow(FOLLOW_atom_in_term118);
			atom();
			state._fsp--;
			dbg.location(14,12);
			// /home/uml/Pulpit/rpdc/Gramma.g:14:12: ( MUL atom | DIV atom )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=3;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==MUL) ) {
					alt3=1;
				}
				else if ( (LA3_0==DIV) ) {
					alt3=2;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Pulpit/rpdc/Gramma.g:14:13: MUL atom
					{
					dbg.location(14,13);
					match(input,MUL,FOLLOW_MUL_in_term121); dbg.location(14,17);
					pushFollow(FOLLOW_atom_in_term123);
					atom();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/uml/Pulpit/rpdc/Gramma.g:15:7: DIV atom
					{
					dbg.location(15,7);
					match(input,DIV,FOLLOW_DIV_in_term132); dbg.location(15,11);
					pushFollow(FOLLOW_atom_in_term134);
					atom();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "atom"
	// /home/uml/Pulpit/rpdc/Gramma.g:17:3: atom : ( INT | ( LP expr RP ) );
	public final void atom() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 2);

		try {
			// /home/uml/Pulpit/rpdc/Gramma.g:18:5: ( INT | ( LP expr RP ) )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT) ) {
				alt4=1;
			}
			else if ( (LA4_0==LP) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Pulpit/rpdc/Gramma.g:18:7: INT
					{
					dbg.location(18,7);
					match(input,INT,FOLLOW_INT_in_atom155); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/uml/Pulpit/rpdc/Gramma.g:19:8: ( LP expr RP )
					{
					dbg.location(19,8);
					// /home/uml/Pulpit/rpdc/Gramma.g:19:8: ( LP expr RP )
					dbg.enterAlt(1);

					// /home/uml/Pulpit/rpdc/Gramma.g:19:9: LP expr RP
					{
					dbg.location(19,9);
					match(input,LP,FOLLOW_LP_in_atom165); dbg.location(19,12);
					pushFollow(FOLLOW_expr_in_atom167);
					expr();
					state._fsp--;
					dbg.location(19,17);
					match(input,RP,FOLLOW_RP_in_atom169); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_plik58 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_EOF_in_plik61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr80 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_PLUS_in_expr83 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_term_in_expr85 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_MINUS_in_expr94 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_term_in_expr96 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_atom_in_term118 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_MUL_in_term121 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_term123 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_DIV_in_term132 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_term134 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_INT_in_atom155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom165 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_expr_in_atom167 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RP_in_atom169 = new BitSet(new long[]{0x0000000000000002L});
}
