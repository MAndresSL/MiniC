// DO NOT EDIT
// Generated by JFlex 1.8.1 http://jflex.de/
// source: main.flex

package FlexAndCup;
import java_cup.runtime.*;



// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexar implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int line_comment = 2;
  public static final int comment = 4;
  public static final int includes = 6;
  public static final int whileLoops = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  3,  3,  4,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     5,  6,  7,  8,  0,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 
    20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 22,  0, 23,  0, 24, 
    25, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 26, 20, 27, 20, 
    20, 20, 20, 20, 20, 28, 20, 20, 20, 20, 20, 29,  0, 30, 31, 32, 
     0, 33, 34, 35, 36, 37, 38, 39, 40, 41, 20, 20, 42, 20, 43, 44, 
    20, 20, 45, 46, 47, 48, 49, 50, 20, 20, 20, 51, 52, 53,  0,  0, 
     0,  0,  0,  0,  0,  3,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    54,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\2\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\1"+
    "\1\26\1\27\1\30\1\31\14\1\1\32\1\1\1\33"+
    "\1\1\1\34\1\0\1\35\1\36\1\2\1\37\1\40"+
    "\1\41\1\42\7\0\1\43\12\0\1\44\3\0\1\41"+
    "\1\42\6\0\1\45\1\46\11\0\1\47\1\0\1\50"+
    "\1\51\1\52\3\0\1\53\4\0\1\54\1\0\1\55"+
    "\2\0\1\47\2\0\1\56\1\57\1\0\1\60\3\0"+
    "\1\61\1\62\1\63\1\64\1\65\2\0\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u0118\0\u0118\0\u01c0\0\u0118\0\u0118\0\u01f8\0\u0118\0\u0118"+
    "\0\u0118\0\u0230\0\u0268\0\u0118\0\u02a0\0\u0118\0\u02d8\0\u0118"+
    "\0\u0118\0\u0118\0\u0118\0\u0118\0\u0310\0\u0118\0\u0118\0\u0118"+
    "\0\u0118\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498"+
    "\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0\0\u0118\0\u05e8\0\u0118"+
    "\0\u0230\0\u0118\0\u01c0\0\u0118\0\u0118\0\u0118\0\u0118\0\u0118"+
    "\0\u0620\0\u0658\0\u0690\0\u06c8\0\u0700\0\u0738\0\u0770\0\u07a8"+
    "\0\u07e0\0\u0118\0\u0818\0\u0850\0\u0888\0\u08c0\0\u08f8\0\u0930"+
    "\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0118\0\u0a48\0\u0a80\0\u0ab8"+
    "\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\u0c40\0\u0c78"+
    "\0\u0118\0\u0118\0\u0cb0\0\u0ce8\0\u0d20\0\u0d58\0\u0d90\0\u0dc8"+
    "\0\u0e00\0\u0e38\0\u0e70\0\u0a48\0\u0ea8\0\u0118\0\u0118\0\u0118"+
    "\0\u0ee0\0\u0f18\0\u0f50\0\u0118\0\u0f88\0\u0fc0\0\u0ff8\0\u1030"+
    "\0\u0118\0\u1068\0\u0118\0\u10a0\0\u10d8\0\u0ab8\0\u1110\0\u1148"+
    "\0\u0118\0\u0118\0\u1180\0\u0118\0\u11b8\0\u11f0\0\u1228\0\u0118"+
    "\0\u0118\0\u0118\0\u0118\0\u0118\0\u1260\0\u1298\0\u0118";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\1\7\1\10\1\11\1\7\1\6\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\6\1\30\1\31\1\32"+
    "\1\33\1\34\1\6\1\35\1\6\1\36\1\37\1\40"+
    "\1\41\1\6\1\42\1\43\1\44\1\6\1\45\2\6"+
    "\1\46\1\47\2\6\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\6\1\11\1\6\1\7"+
    "\1\10\1\11\1\7\62\6\1\11\1\6\2\7\1\11"+
    "\1\7\11\6\1\61\50\6\71\11\1\6\2\7\1\11"+
    "\1\7\60\6\1\62\1\6\1\11\71\0\2\7\1\0"+
    "\1\7\64\0\1\7\1\10\1\0\1\7\70\0\1\63"+
    "\1\0\1\64\14\0\1\63\5\0\3\63\4\0\22\63"+
    "\17\0\1\65\100\0\1\66\63\0\1\67\71\0\1\70"+
    "\64\0\1\71\4\0\1\72\100\0\1\73\107\0\1\74"+
    "\63\0\1\75\73\0\1\76\54\0\1\77\10\0\1\100"+
    "\1\0\1\101\61\0\1\102\4\0\1\103\70\0\1\104"+
    "\60\0\1\105\72\0\1\106\1\107\5\0\1\110\65\0"+
    "\1\111\65\0\1\112\70\0\1\113\63\0\1\114\103\0"+
    "\1\115\3\0\1\116\5\71\10\116\1\117\4\116\1\120"+
    "\1\121\5\116\3\121\4\116\22\121\3\116\1\71\2\0"+
    "\5\72\16\0\1\122\5\0\3\122\4\0\22\122\3\0"+
    "\1\72\33\0\1\123\111\0\1\124\54\0\1\125\106\0"+
    "\1\126\61\0\1\127\71\0\1\130\70\0\1\131\71\0"+
    "\1\132\63\0\1\133\73\0\1\134\64\0\1\135\62\0"+
    "\1\136\75\0\1\137\72\0\1\140\65\0\1\141\62\0"+
    "\1\142\67\0\1\143\16\0\2\116\3\0\11\116\1\117"+
    "\50\116\1\0\2\116\3\0\11\116\1\117\4\116\1\144"+
    "\43\116\1\0\2\116\3\0\11\116\1\145\50\116\1\0"+
    "\2\116\3\0\1\121\10\116\1\117\4\116\1\120\1\121"+
    "\5\116\3\121\4\116\22\121\4\116\6\0\1\122\16\0"+
    "\1\122\5\0\3\122\4\0\22\122\37\0\1\146\107\0"+
    "\1\147\72\0\1\150\54\0\1\151\103\0\1\152\52\0"+
    "\1\153\75\0\1\154\100\0\1\155\64\0\1\156\65\0"+
    "\1\157\65\0\1\160\63\0\1\161\73\0\1\162\62\0"+
    "\1\163\75\0\1\164\15\0\1\116\5\165\10\116\1\117"+
    "\4\116\1\166\1\167\5\116\3\167\4\116\22\167\3\116"+
    "\1\165\53\0\1\170\62\0\1\171\101\0\1\172\65\0"+
    "\1\173\71\0\1\174\55\0\1\175\75\0\1\176\63\0"+
    "\1\177\65\0\1\200\22\0\1\116\5\165\10\116\1\117"+
    "\4\116\1\120\1\167\5\116\3\167\4\116\22\167\3\116"+
    "\1\165\1\0\2\116\3\0\1\167\10\116\1\117\4\116"+
    "\1\120\1\167\5\116\3\167\4\116\22\167\4\116\46\0"+
    "\1\201\75\0\1\202\60\0\1\203\72\0\1\204\73\0"+
    "\1\205\61\0\1\206\66\0\1\207\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4816];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\1\11\2\1\2\11\1\1\2\11\1\1\3\11"+
    "\2\1\1\11\1\1\1\11\1\1\5\11\1\1\4\11"+
    "\14\1\1\11\1\1\1\11\1\1\1\11\1\0\5\11"+
    "\2\1\7\0\1\11\12\0\1\11\3\0\2\1\6\0"+
    "\2\11\11\0\1\1\1\0\3\11\3\0\1\11\4\0"+
    "\1\11\1\0\1\11\2\0\1\1\2\0\2\11\1\0"+
    "\1\11\3\0\5\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    /* To create a new java_cup.runtime.Symbol with information about
        the current token, the token will have no value in this
       case. */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexar(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 55: break;
          case 2:
            { System.out.print(yytext()+"\n"); yybegin(1);
            }
            // fall through
          case 56: break;
          case 3:
            { System.out.print(yytext());
            }
            // fall through
          case 57: break;
          case 4:
            { System.out.println("exclamation symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 58: break;
          case 5:
            { System.out.println("hash symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 59: break;
          case 6:
            { System.out.println("percent symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 60: break;
          case 7:
            { System.out.println("ampersand symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 61: break;
          case 8:
            { System.out.println("apostrophe symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 62: break;
          case 9:
            { System.out.println("opening parenthesis symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            return symbol(sym.OPEN_PARENTHESIS);
            }
            // fall through
          case 63: break;
          case 10:
            { System.out.println("closing parenthesis symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
                return symbol(sym.CLOSE_PARENTHESIS);
            }
            // fall through
          case 64: break;
          case 11:
            { System.out.println("asterisk symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 65: break;
          case 12:
            { System.out.println("plus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 66: break;
          case 13:
            { System.out.println("comma symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 67: break;
          case 14:
            { System.out.println("minus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 68: break;
          case 15:
            { System.out.println("period symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 69: break;
          case 16:
            { System.out.println("slash symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 70: break;
          case 17:
            { System.out.println("colon symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 71: break;
          case 18:
            { System.out.println("semicolon symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
        return symbol(sym.SEMICOLON);
            }
            // fall through
          case 72: break;
          case 19:
            { System.out.println("equal symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 73: break;
          case 20:
            { System.out.println("question symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 74: break;
          case 21:
            { System.out.println("at (@) symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 75: break;
          case 22:
            { System.out.println("opening bracket symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            return symbol(sym.OPEN_BRACKET);
            }
            // fall through
          case 76: break;
          case 23:
            { System.out.println("closing bracket symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
                return symbol(sym.CLOSE_BRACKET);
            }
            // fall through
          case 77: break;
          case 24:
            { System.out.println("hat symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 78: break;
          case 25:
            { System.out.println("underscore symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
            }
            // fall through
          case 79: break;
          case 26:
            { System.out.println("opening brace symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
                return symbol(sym.OPEN_BRACE);
            }
            // fall through
          case 80: break;
          case 27:
            { System.out.println("closing brace symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
                return symbol(sym.CLOSE_BRACE);
            }
            // fall through
          case 81: break;
          case 28:
            { System.out.println("While end found at line: " + " => at (" +yyline + ","+ yycolumn+")" );
            yybegin(YYINITIAL);
            }
            // fall through
          case 82: break;
          case 29:
            { System.out.println("strs found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.STRING);
            }
            // fall through
          case 83: break;
          case 30:
            { System.out.println("and found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.AND);
            }
            // fall through
          case 84: break;
          case 31:
            { System.out.println("plus plus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 85: break;
          case 32:
            { System.out.println("minus minus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 86: break;
          case 33:
            { System.out.print("Comentario encontrado: \n"+ yytext()); yybegin(comment);
            }
            // fall through
          case 87: break;
          case 34:
            { System.out.print("Comentario en linea encontrado:"  + " => at (" +yyline + ","+ yycolumn+")" +yytext() );
        yybegin(line_comment);
            }
            // fall through
          case 88: break;
          case 35:
            { System.out.println("if found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.IF);
            }
            // fall through
          case 89: break;
          case 36:
            { System.out.println("or found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.OR);
            }
            // fall through
          case 90: break;
          case 37:
            { System.out.println("For found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.FOR);
            }
            // fall through
          case 91: break;
          case 38:
            { System.out.println("int found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.INT);
            }
            // fall through
          case 92: break;
          case 39:
            { System.out.print("Comentario encontrado: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" + "\n");
            }
            // fall through
          case 93: break;
          case 40:
            { System.out.println("NULL found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.NULL);
            }
            // fall through
          case 94: break;
          case 41:
            { System.out.println("bool found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
                return symbol(sym.BOOL);
            }
            // fall through
          case 95: break;
          case 42:
            { System.out.println("char found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.CHAR);
            }
            // fall through
          case 96: break;
          case 43:
            { System.out.println("long found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 97: break;
          case 44:
            { System.out.println("true found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.TRUE);
            }
            // fall through
          case 98: break;
          case 45:
            { System.out.println("void found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 99: break;
          case 46:
            { System.out.println("false found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.FALSE);
            }
            // fall through
          case 100: break;
          case 47:
            { System.out.println("float found: " + yytext()  + " => at (" + yyline + "," + yycolumn + ")" );
            }
            // fall through
          case 101: break;
          case 48:
            { System.out.println("short found: " + yytext()  + " => at (" + yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 102: break;
          case 49:
            { System.out.println("while found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.WHILE);
            }
            // fall through
          case 103: break;
          case 50:
            { System.out.println("double found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 104: break;
          case 51:
            { System.out.println("return found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        return symbol(sym.RETURN);
            }
            // fall through
          case 105: break;
          case 52:
            { System.out.println("signed found: " + yytext()  + " => at (" + yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 106: break;
          case 53:
            { System.out.println("string found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
                return symbol(sym.STRING);
            }
            // fall through
          case 107: break;
          case 54:
            { System.out.println("unsigned found: " + yytext()  + " => at (" + yyline + ","+ yycolumn+")" );
            }
            // fall through
          case 108: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexar [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexar scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexar(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}