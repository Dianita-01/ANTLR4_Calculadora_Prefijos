// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PrefParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		WS=10;
	public static final int
		RULE_expresion = 0, RULE_val = 1, RULE_num = 2, RULE_signo = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"expresion", "val", "num", "signo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrefParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionValContext extends ExpresionContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ExpresionValContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).enterExpresionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).exitExpresionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefVisitor ) return ((PrefVisitor<? extends T>)visitor).visitExpresionVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacionesContext extends ExpresionContext {
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperacionesContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefVisitor ) return ((PrefVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expresion);
		try {
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case INT:
				_localctx = new ExpresionValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				val();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				_localctx = new OperacionesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				signo();
				setState(10);
				expresion();
				setState(11);
				expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ValContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParensContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefVisitor ) return ((PrefVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NUMEROContext extends ValContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NUMEROContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).enterNUMERO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).exitNUMERO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefVisitor ) return ((PrefVisitor<? extends T>)visitor).visitNUMERO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_val);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NUMEROContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				num();
				}
				break;
			case T__0:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__0);
				setState(17);
				expresion();
				setState(18);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(PrefParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PrefParser.INT, i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefVisitor ) return ((PrefVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_num);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(22);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(27);
				match(T__2);
				setState(29); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(28);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(31); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignoContext extends ParserRuleContext {
		public SignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).enterSigno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefListener ) ((PrefListener)listener).exitSigno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefVisitor ) return ((PrefVisitor<? extends T>)visitor).visitSigno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n&\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0002\u0004\u0002\u0018\b\u0002\u000b\u0002\f\u0002\u0019\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u001e\b\u0002\u000b\u0002\f\u0002\u001f\u0003"+
		"\u0002\"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004"+
		"\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0004\b&\u0000\r\u0001"+
		"\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0017\u0001"+
		"\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b\u000e\u0003\u0002"+
		"\u0001\u0000\t\n\u0003\u0006\u0003\u0000\n\u000b\u0003\u0000\u0000\u0000"+
		"\u000b\f\u0003\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\b\u0001"+
		"\u0000\u0000\u0000\r\t\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000"+
		"\u0000\u0000\u000f\u0015\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u0001"+
		"\u0000\u0000\u0011\u0012\u0003\u0000\u0000\u0000\u0012\u0013\u0005\u0002"+
		"\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u000f\u0001\u0000"+
		"\u0000\u0000\u0014\u0010\u0001\u0000\u0000\u0000\u0015\u0003\u0001\u0000"+
		"\u0000\u0000\u0016\u0018\u0005\t\u0000\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a!\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0005\u0003\u0000\u0000\u001c\u001e\u0005\t\u0000\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001"+
		"\u0000\u0000\u0000!\u001b\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$\u0007"+
		"\u0001\u0000\u0000\u0000\u0005\r\u0014\u0019\u001f!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}