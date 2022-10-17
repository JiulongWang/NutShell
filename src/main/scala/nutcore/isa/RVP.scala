package nutcore

import chisel3._
import chisel3.util._

object RVPInstr extends HasInstrType {
  def ADD16   = BitPat("b0100000_?????_?????_000_?????_1110111")
  def RADD16  = BitPat("b0000000_?????_?????_000_?????_1110111")
  def KADD16  = BitPat("b0001000_?????_?????_000_?????_1110111")
  def URADD16 = BitPat("b0010000_?????_?????_000_?????_1110111")
  def UKADD16 = BitPat("b0011000_?????_?????_000_?????_1110111")
  def SUB16   = BitPat("b0100001_?????_?????_000_?????_1110111")
  def RSUB16  = BitPat("b0000001_?????_?????_000_?????_1110111")
  def KSUB16  = BitPat("b0001001_?????_?????_000_?????_1110111")
  def URSUB16 = BitPat("b0010001_?????_?????_000_?????_1110111")
  def UKSUB16 = BitPat("b0011001_?????_?????_000_?????_1110111")
  def ADD8    = BitPat("b0100100_?????_?????_000_?????_1110111")
  def RADD8   = BitPat("b0000100_?????_?????_000_?????_1110111")
  def KADD8   = BitPat("b0001100_?????_?????_000_?????_1110111")
  def URADD8  = BitPat("b0010100_?????_?????_000_?????_1110111")
  def UKADD8  = BitPat("b0011100_?????_?????_000_?????_1110111")
  def SUB8    = BitPat("b0100101_?????_?????_000_?????_1110111")
  def RSUB8   = BitPat("b0000101_?????_?????_000_?????_1110111")
  def KSUB8   = BitPat("b0001101_?????_?????_000_?????_1110111")
  def URSUB8  = BitPat("b0010101_?????_?????_000_?????_1110111")
  def UKSUB8  = BitPat("b0011101_?????_?????_000_?????_1110111")
  def CRAS16  = BitPat("b0100010_?????_?????_000_?????_1110111")
  def RCRAS16 = BitPat("b0000010_?????_?????_000_?????_1110111")
  def KCRAS16 = BitPat("b0001010_?????_?????_000_?????_1110111")
  def URCRAS16= BitPat("b0010010_?????_?????_000_?????_1110111")
  def UKCRAS16= BitPat("b0011010_?????_?????_000_?????_1110111")
  def CRSA16  = BitPat("b0100011_?????_?????_000_?????_1110111")
  def RCRSA16 = BitPat("b0000011_?????_?????_000_?????_1110111")
  def KCRSA16 = BitPat("b0001011_?????_?????_000_?????_1110111")
  def URCRSA16= BitPat("b0010011_?????_?????_000_?????_1110111")
  def UKCRSA16= BitPat("b0011011_?????_?????_000_?????_1110111")
  def ADD32   = BitPat("b0100000_?????_?????_010_?????_1110111")
  def RADD32  = BitPat("b0000000_?????_?????_010_?????_1110111")
  def KADD32  = BitPat("b0001000_?????_?????_010_?????_1110111")
  def URADD32 = BitPat("b0010000_?????_?????_010_?????_1110111")
  def UKADD32 = BitPat("b0011000_?????_?????_010_?????_1110111")
  def SUB32   = BitPat("b0100001_?????_?????_010_?????_1110111")
  def RSUB32  = BitPat("b0000001_?????_?????_010_?????_1110111")
  def KSUB32  = BitPat("b0001001_?????_?????_010_?????_1110111")
  def URSUB32 = BitPat("b0010001_?????_?????_010_?????_1110111")
  def UKSUB32 = BitPat("b0011001_?????_?????_010_?????_1110111")
  def CRAS32  = BitPat("b0100010_?????_?????_010_?????_1110111")
  def RCRAS32 = BitPat("b0000010_?????_?????_010_?????_1110111")
  def KCRAS32 = BitPat("b0001010_?????_?????_010_?????_1110111")
  def URCRAS32= BitPat("b0010010_?????_?????_010_?????_1110111")
  def UKCRAS32= BitPat("b0011010_?????_?????_010_?????_1110111")
  def CRSA32  = BitPat("b0100011_?????_?????_010_?????_1110111")
  def RCRSA32 = BitPat("b0000011_?????_?????_010_?????_1110111")
  def KCRSA32 = BitPat("b0001011_?????_?????_010_?????_1110111")
  def URCRSA32= BitPat("b0010011_?????_?????_010_?????_1110111")
  def UKCRSA32= BitPat("b0011011_?????_?????_010_?????_1110111")
  def SRA16   = BitPat("b0101000_?????_?????_000_?????_1110111")
  def SRA16U  = BitPat("b0110000_?????_?????_000_?????_1110111")
  def SRL16   = BitPat("b0101001_?????_?????_000_?????_1110111")
  def SRL16U  = BitPat("b0110001_?????_?????_000_?????_1110111")
  def SLL16   = BitPat("b0101010_?????_?????_000_?????_1110111")
  def KSLL16  = BitPat("b0110010_?????_?????_000_?????_1110111")
  def KSLR16  = BitPat("b0101011_?????_?????_000_?????_1110111")
  def KSLR16U = BitPat("b0110011_?????_?????_000_?????_1110111")
  def SRA8    = BitPat("b0101100_?????_?????_000_?????_1110111")
  def SRA8U   = BitPat("b0110100_?????_?????_000_?????_1110111")
  def SRL8    = BitPat("b0101101_?????_?????_000_?????_1110111")
  def SRL8U   = BitPat("b0110101_?????_?????_000_?????_1110111")
  def SLL8    = BitPat("b0101110_?????_?????_000_?????_1110111")
  def KSLL8   = BitPat("b0110110_?????_?????_000_?????_1110111")
  def KSLR8   = BitPat("b0101111_?????_?????_000_?????_1110111")
  def KSLR8U  = BitPat("b0110111_?????_?????_000_?????_1110111")
  def SRA32   = BitPat("b0101000_?????_?????_010_?????_1110111")
  def SRA32U  = BitPat("b0110000_?????_?????_010_?????_1110111")
  def SRL32   = BitPat("b0101001_?????_?????_010_?????_1110111")
  def SRL32U  = BitPat("b0110001_?????_?????_010_?????_1110111")
  def SLL32   = BitPat("b0101010_?????_?????_010_?????_1110111")
  def KSLL32  = BitPat("b0110010_?????_?????_010_?????_1110111")
  def KSLR32  = BitPat("b0101011_?????_?????_010_?????_1110111")
  def KSLR32U = BitPat("b0110011_?????_?????_010_?????_1110111")
  def CMPEQ16 = BitPat("b0100110_?????_?????_000_?????_1110111")
  def SCMPLT16= BitPat("b0000110_?????_?????_000_?????_1110111")
  def SCMPLE16= BitPat("b0001110_?????_?????_000_?????_1110111")
  def UCMPLT16= BitPat("b0010110_?????_?????_000_?????_1110111")
  def UCMPLE16= BitPat("b0011110_?????_?????_000_?????_1110111")   
  def CMPEQ8  = BitPat("b0100111_?????_?????_000_?????_1110111")
  def SCMPLT8 = BitPat("b0000111_?????_?????_000_?????_1110111")
  def SCMPLE8 = BitPat("b0001111_?????_?????_000_?????_1110111")
  def UCMPLT8 = BitPat("b0010111_?????_?????_000_?????_1110111")
  def UCMPLE8 = BitPat("b0011111_?????_?????_000_?????_1110111")  
  def SMIN16  = BitPat("b1000000_?????_?????_000_?????_1110111") 
  def SMAX16  = BitPat("b1000001_?????_?????_000_?????_1110111")
  def UMIN16  = BitPat("b1001000_?????_?????_000_?????_1110111")
  def UMAX16  = BitPat("b1001001_?????_?????_000_?????_1110111")
  def SMIN8   = BitPat("b1000100_?????_?????_000_?????_1110111") 
  def SMAX8   = BitPat("b1000101_?????_?????_000_?????_1110111")
  def UMIN8   = BitPat("b1001100_?????_?????_000_?????_1110111")
  def UMAX8   = BitPat("b1001101_?????_?????_000_?????_1110111")
  def PKBB16  = BitPat("b0000111_?????_?????_001_?????_1110111")
  def PKBT16  = BitPat("b0001111_?????_?????_001_?????_1110111")
  def PKTT16  = BitPat("b0010111_?????_?????_001_?????_1110111")
  def PKTB16  = BitPat("b0011111_?????_?????_001_?????_1110111")
  def PBSAD   = BitPat("b1111110_?????_?????_000_?????_1110111")
  def PBSADA  = BitPat("b1111111_?????_?????_000_?????_1110111")
  
  val table = Array(
    ADD16       -> List(InstrP, FuType.simdu, SIMDUOpType.add16),
    RADD16      -> List(InstrP, FuType.simdu, SIMDUOpType.radd16),
    KADD16      -> List(InstrP, FuType.simdu, SIMDUOpType.kadd16),
    URADD16     -> List(InstrP, FuType.simdu, SIMDUOpType.uradd16),
    UKADD16     -> List(InstrP, FuType.simdu, SIMDUOpType.ukadd16),
    SUB16       -> List(InstrP, FuType.simdu, SIMDUOpType.sub16),
    RSUB16      -> List(InstrP, FuType.simdu, SIMDUOpType.rsub16),
    KSUB16      -> List(InstrP, FuType.simdu, SIMDUOpType.ksub16),
    URSUB16     -> List(InstrP, FuType.simdu, SIMDUOpType.ursub16),
    UKSUB16     -> List(InstrP, FuType.simdu, SIMDUOpType.uksub16),
    ADD8        -> List(InstrP, FuType.simdu, SIMDUOpType.add8 ),
    RADD8       -> List(InstrP, FuType.simdu, SIMDUOpType.radd8 ),
    KADD8       -> List(InstrP, FuType.simdu, SIMDUOpType.kadd8 ),
    URADD8      -> List(InstrP, FuType.simdu, SIMDUOpType.uradd8 ),
    UKADD8      -> List(InstrP, FuType.simdu, SIMDUOpType.ukadd8 ),
    SUB8        -> List(InstrP, FuType.simdu, SIMDUOpType.sub8 ),
    RSUB8       -> List(InstrP, FuType.simdu, SIMDUOpType.rsub8 ),
    KSUB8       -> List(InstrP, FuType.simdu, SIMDUOpType.ksub8 ),
    URSUB8      -> List(InstrP, FuType.simdu, SIMDUOpType.ursub8 ),
    UKSUB8      -> List(InstrP, FuType.simdu, SIMDUOpType.uksub8 ),
    CRAS16      -> List(InstrP, FuType.simdu, SIMDUOpType.cras16),
    RCRAS16     -> List(InstrP, FuType.simdu, SIMDUOpType.rcras16),
    KCRAS16     -> List(InstrP, FuType.simdu, SIMDUOpType.kcras16),
    URCRAS16    -> List(InstrP, FuType.simdu, SIMDUOpType.urcras16),
    UKCRAS16    -> List(InstrP, FuType.simdu, SIMDUOpType.ukcras16),
    CRSA16      -> List(InstrP, FuType.simdu, SIMDUOpType.crsa16),
    RCRSA16     -> List(InstrP, FuType.simdu, SIMDUOpType.rcrsa16),
    KCRSA16     -> List(InstrP, FuType.simdu, SIMDUOpType.kcrsa16),
    URCRSA16    -> List(InstrP, FuType.simdu, SIMDUOpType.urcrsa16),
    UKCRSA16    -> List(InstrP, FuType.simdu, SIMDUOpType.ukcrsa16),
    ADD32       -> List(InstrP, FuType.simdu, SIMDUOpType.add32),
    RADD32      -> List(InstrP, FuType.simdu, SIMDUOpType.radd32),
    KADD32      -> List(InstrP, FuType.simdu, SIMDUOpType.kadd32),
    URADD32     -> List(InstrP, FuType.simdu, SIMDUOpType.uradd32),
    UKADD32     -> List(InstrP, FuType.simdu, SIMDUOpType.ukadd32),
    SUB32       -> List(InstrP, FuType.simdu, SIMDUOpType.sub32),
    RSUB32      -> List(InstrP, FuType.simdu, SIMDUOpType.rsub32),
    KSUB32      -> List(InstrP, FuType.simdu, SIMDUOpType.ksub32),
    URSUB32     -> List(InstrP, FuType.simdu, SIMDUOpType.ursub32),
    UKSUB32     -> List(InstrP, FuType.simdu, SIMDUOpType.uksub32),
    CRAS32      -> List(InstrP, FuType.simdu, SIMDUOpType.cras32),
    RCRAS32     -> List(InstrP, FuType.simdu, SIMDUOpType.rcras32),
    KCRAS32     -> List(InstrP, FuType.simdu, SIMDUOpType.kcras32),
    URCRAS32    -> List(InstrP, FuType.simdu, SIMDUOpType.urcras32),
    UKCRAS32    -> List(InstrP, FuType.simdu, SIMDUOpType.ukcras32),
    CRSA32      -> List(InstrP, FuType.simdu, SIMDUOpType.crsa32),
    RCRSA32     -> List(InstrP, FuType.simdu, SIMDUOpType.rcrsa32),
    KCRSA32     -> List(InstrP, FuType.simdu, SIMDUOpType.kcrsa32),
    URCRSA32    -> List(InstrP, FuType.simdu, SIMDUOpType.urcrsa32),
    UKCRSA32    -> List(InstrP, FuType.simdu, SIMDUOpType.ukcrsa32),
    SRA16       -> List(InstrP, FuType.simdu, SIMDUOpType.sra16   ),
    SRA16U      -> List(InstrP, FuType.simdu, SIMDUOpType.sra16u  ),
    SRL16       -> List(InstrP, FuType.simdu, SIMDUOpType.srl16   ),
    SRL16U      -> List(InstrP, FuType.simdu, SIMDUOpType.srl16u  ),
    SLL16       -> List(InstrP, FuType.simdu, SIMDUOpType.sll16   ),
    KSLL16      -> List(InstrP, FuType.simdu, SIMDUOpType.ksll16  ),
    KSLR16      -> List(InstrP, FuType.simdu, SIMDUOpType.kslr16  ),
    KSLR16U     -> List(InstrP, FuType.simdu, SIMDUOpType.kslr16u ),
    SRA8        -> List(InstrP, FuType.simdu, SIMDUOpType.sra8    ),
    SRA8U       -> List(InstrP, FuType.simdu, SIMDUOpType.sra8u   ),
    SRL8        -> List(InstrP, FuType.simdu, SIMDUOpType.srl8    ),
    SRL8U       -> List(InstrP, FuType.simdu, SIMDUOpType.srl8u   ),
    SLL8        -> List(InstrP, FuType.simdu, SIMDUOpType.sll8    ),
    KSLL8       -> List(InstrP, FuType.simdu, SIMDUOpType.ksll8   ),
    KSLR8       -> List(InstrP, FuType.simdu, SIMDUOpType.kslr8   ),
    KSLR8U      -> List(InstrP, FuType.simdu, SIMDUOpType.kslr8u  ),
    SRA32       -> List(InstrP, FuType.simdu, SIMDUOpType.sra32   ),
    SRA32U      -> List(InstrP, FuType.simdu, SIMDUOpType.sra32u  ),
    SRL32       -> List(InstrP, FuType.simdu, SIMDUOpType.srl32   ),
    SRL32U      -> List(InstrP, FuType.simdu, SIMDUOpType.srl32u  ),
    SLL32       -> List(InstrP, FuType.simdu, SIMDUOpType.sll32   ),
    KSLL32      -> List(InstrP, FuType.simdu, SIMDUOpType.ksll32  ),
    KSLR32      -> List(InstrP, FuType.simdu, SIMDUOpType.kslr32  ),
    KSLR32U     -> List(InstrP, FuType.simdu, SIMDUOpType.kslr32u ),
    CMPEQ16     -> List(InstrP, FuType.simdu, SIMDUOpType.cmpeq16 ),
    SCMPLT16    -> List(InstrP, FuType.simdu, SIMDUOpType.scmplt16 ),
    SCMPLE16    -> List(InstrP, FuType.simdu, SIMDUOpType.scmple16 ),
    UCMPLT16    -> List(InstrP, FuType.simdu, SIMDUOpType.ucmplt16 ),
    UCMPLE16    -> List(InstrP, FuType.simdu, SIMDUOpType.ucmple16 ),
    CMPEQ8      -> List(InstrP, FuType.simdu, SIMDUOpType.cmpeq8  ),
    SCMPLT8     -> List(InstrP, FuType.simdu, SIMDUOpType.scmplt8 ),
    SCMPLE8     -> List(InstrP, FuType.simdu, SIMDUOpType.scmple8 ),
    UCMPLT8     -> List(InstrP, FuType.simdu, SIMDUOpType.ucmplt8 ),
    UCMPLE8     -> List(InstrP, FuType.simdu, SIMDUOpType.ucmple8 ),
    SMIN16      -> List(InstrP, FuType.simdu, SIMDUOpType.smin16 ),
    SMAX16      -> List(InstrP, FuType.simdu, SIMDUOpType.smax16 ),
    UMIN16      -> List(InstrP, FuType.simdu, SIMDUOpType.umin16 ),
    UMAX16      -> List(InstrP, FuType.simdu, SIMDUOpType.umax16 ),
    SMIN8       -> List(InstrP, FuType.simdu, SIMDUOpType.smin8 ),
    SMAX8       -> List(InstrP, FuType.simdu, SIMDUOpType.smax8 ),
    UMIN8       -> List(InstrP, FuType.simdu, SIMDUOpType.umin8 ),
    UMAX8       -> List(InstrP, FuType.simdu, SIMDUOpType.umax8 ),
    PKBB16      -> List(InstrP, FuType.simdu, SIMDUOpType.pkbb16 ),
    PKBT16      -> List(InstrP, FuType.simdu, SIMDUOpType.pkbt16 ),
    PKTT16      -> List(InstrP, FuType.simdu, SIMDUOpType.pktt16 ),
    PKTB16      -> List(InstrP, FuType.simdu, SIMDUOpType.pktb16 ),
    PBSAD       -> List(InstrP, FuType.simdu, SIMDUOpType.pbsad ),
    PBSADA      -> List(InstrP, FuType.simdu, SIMDUOpType.pbsada )
  )
}

object RVPIInstr extends HasInstrType {
  def SRAI16  = BitPat("b0111000_0_????_?????_000_?????_1110111")
  def SRAI16U = BitPat("b0111000_1_????_?????_000_?????_1110111")
  def SRLI16  = BitPat("b0111001_0_????_?????_000_?????_1110111")
  def SRLI16U = BitPat("b0111001_1_????_?????_000_?????_1110111")
  def SLLI16  = BitPat("b0111010_0_????_?????_000_?????_1110111")
  def KSLLI16 = BitPat("b0111010_1_????_?????_000_?????_1110111")
  def SRAI8   = BitPat("b0111100_00_???_?????_000_?????_1110111")
  def SRAI8U  = BitPat("b0111100_01_???_?????_000_?????_1110111")
  def SRLI8   = BitPat("b0111101_00_???_?????_000_?????_1110111")
  def SRLI8U  = BitPat("b0111101_01_???_?????_000_?????_1110111")
  def SLLI8   = BitPat("b0111110_00_???_?????_000_?????_1110111")
  def KSLLI8  = BitPat("b0111110_01_???_?????_000_?????_1110111")
  def SRAI32  = BitPat("b0111000_?????_?????_010_?????_1110111")
  def SRAI32U = BitPat("b1000000_?????_?????_010_?????_1110111")
  def SRLI32  = BitPat("b0111001_?????_?????_010_?????_1110111")
  def SRLI32U = BitPat("b1000001_?????_?????_010_?????_1110111")
  def SLLI32  = BitPat("b0111010_?????_?????_010_?????_1110111")
  def KSLLI32 = BitPat("b1000010_?????_?????_010_?????_1110111")
  def SCLIP16 = BitPat("b1000010_0_????_?????_000_?????_1110111")
  def UCLIP16 = BitPat("b1000010_1_????_?????_000_?????_1110111")
  def SCLIP8  = BitPat("b1000110_00_???_?????_000_?????_1110111")
  def UCLIP8  = BitPat("b1000110_10_???_?????_000_?????_1110111")
  def KABS16  = BitPat("b1010110_10001_?????_000_?????_1110111")
  def KABS8   = BitPat("b1010110_10000_?????_000_?????_1110111")
  def KABS32  = BitPat("b1010110_10010_?????_000_?????_1110111")
  def KABSW   = BitPat("b1010110_10100_?????_000_?????_1110111")
  def CLRS16  = BitPat("b1010111_01000_?????_000_?????_1110111")
  def CLZ16   = BitPat("b1010111_01001_?????_000_?????_1110111")
  def CLRS8   = BitPat("b1010111_00000_?????_000_?????_1110111")
  def CLZ8    = BitPat("b1010111_00001_?????_000_?????_1110111")
  def SWAP8   = BitPat("b1010110_11000_?????_000_?????_1110111")
  def SUNPKD810 = BitPat("b1010110_01000_?????_000_?????_1110111")
  def SUNPKD820 = BitPat("b1010110_01001_?????_000_?????_1110111")
  def SUNPKD830 = BitPat("b1010110_01010_?????_000_?????_1110111")
  def SUNPKD831 = BitPat("b1010110_01011_?????_000_?????_1110111")
  def SUNPKD832 = BitPat("b1010110_10011_?????_000_?????_1110111")
  def ZUNPKD810 = BitPat("b1010110_01100_?????_000_?????_1110111")
  def ZUNPKD820 = BitPat("b1010110_01101_?????_000_?????_1110111")
  def ZUNPKD830 = BitPat("b1010110_01110_?????_000_?????_1110111")
  def ZUNPKD831 = BitPat("b1010110_01111_?????_000_?????_1110111")
  def ZUNPKD832 = BitPat("b1010110_10111_?????_000_?????_1110111")
  def SCLIP32 = BitPat("b1110010_?????_?????_000_?????_1110111")
  def UCLIP32 = BitPat("b1111010_?????_?????_000_?????_1110111")
  def CLRS32  = BitPat("b1010111_11000_?????_000_?????_1110111")
  def CLZ32   = BitPat("b1010111_11001_?????_000_?????_1110111")

  val table = Array(
    SRAI16      -> List(InstrPI, FuType.simdu, SIMDUOpType.srai16),
    SRAI16U     -> List(InstrPI, FuType.simdu, SIMDUOpType.srai16u),
    SRLI16      -> List(InstrPI, FuType.simdu, SIMDUOpType.srli16),
    SRLI16U     -> List(InstrPI, FuType.simdu, SIMDUOpType.srli16u),
    SLLI16      -> List(InstrPI, FuType.simdu, SIMDUOpType.slli16),
    KSLLI16     -> List(InstrPI, FuType.simdu, SIMDUOpType.kslli16),
    SRAI8       -> List(InstrPI, FuType.simdu, SIMDUOpType.srai8),
    SRAI8U      -> List(InstrPI, FuType.simdu, SIMDUOpType.srai8u),
    SRLI8       -> List(InstrPI, FuType.simdu, SIMDUOpType.srli8),
    SRLI8U      -> List(InstrPI, FuType.simdu, SIMDUOpType.srli8u),
    SLLI8       -> List(InstrPI, FuType.simdu, SIMDUOpType.slli8),
    KSLLI8      -> List(InstrPI, FuType.simdu, SIMDUOpType.kslli8),
    SRAI32      -> List(InstrPI, FuType.simdu, SIMDUOpType.srai32),
    SRAI32U     -> List(InstrPI, FuType.simdu, SIMDUOpType.srai32u),
    SRLI32      -> List(InstrPI, FuType.simdu, SIMDUOpType.srli32),
    SRLI32U     -> List(InstrPI, FuType.simdu, SIMDUOpType.srli32u),
    SLLI32      -> List(InstrPI, FuType.simdu, SIMDUOpType.slli32),
    KSLLI32     -> List(InstrPI, FuType.simdu, SIMDUOpType.kslli32),
    SCLIP16     -> List(InstrPI, FuType.simdu, SIMDUOpType.sclip16),
    UCLIP16     -> List(InstrPI, FuType.simdu, SIMDUOpType.uclip16),
    SCLIP8      -> List(InstrPI, FuType.simdu, SIMDUOpType.sclip8),
    UCLIP8      -> List(InstrPI, FuType.simdu, SIMDUOpType.uclip8),
    KABS16      -> List(InstrPI, FuType.simdu, SIMDUOpType.kabs16),
    KABS8       -> List(InstrPI, FuType.simdu, SIMDUOpType.kabs8),
    KABS32      -> List(InstrPI, FuType.simdu, SIMDUOpType.kabs32),
    KABSW       -> List(InstrPI, FuType.simdu, SIMDUOpType.kabsw),
    CLRS16      -> List(InstrPI, FuType.simdu, SIMDUOpType.clrs16),
    CLZ16       -> List(InstrPI, FuType.simdu, SIMDUOpType.clz16),
    CLRS8       -> List(InstrPI, FuType.simdu, SIMDUOpType.clrs8),
    CLZ8        -> List(InstrPI, FuType.simdu, SIMDUOpType.clz8),
    SWAP8       -> List(InstrPI, FuType.simdu, SIMDUOpType.swap8),
    SUNPKD810   -> List(InstrPI, FuType.simdu, SIMDUOpType.sunpkd810),
    SUNPKD820   -> List(InstrPI, FuType.simdu, SIMDUOpType.sunpkd820),
    SUNPKD830   -> List(InstrPI, FuType.simdu, SIMDUOpType.sunpkd830),
    SUNPKD831   -> List(InstrPI, FuType.simdu, SIMDUOpType.sunpkd831),
    SUNPKD832   -> List(InstrPI, FuType.simdu, SIMDUOpType.sunpkd832),
    ZUNPKD810   -> List(InstrPI, FuType.simdu, SIMDUOpType.zunpkd810),
    ZUNPKD820   -> List(InstrPI, FuType.simdu, SIMDUOpType.zunpkd820),
    ZUNPKD830   -> List(InstrPI, FuType.simdu, SIMDUOpType.zunpkd830),
    ZUNPKD831   -> List(InstrPI, FuType.simdu, SIMDUOpType.zunpkd831),
    ZUNPKD832   -> List(InstrPI, FuType.simdu, SIMDUOpType.zunpkd832),
    SCLIP32     -> List(InstrPI, FuType.simdu, SIMDUOpType.sclip32),
    UCLIP32     -> List(InstrPI, FuType.simdu, SIMDUOpType.uclip32),
    CLRS32      -> List(InstrPI, FuType.simdu, SIMDUOpType.clrs32),
    CLZ32       -> List(InstrPI, FuType.simdu, SIMDUOpType.clz32)
  )
}

object RVPBInstr extends HasInstrType {
  def REV8H   = BitPat("b011010_001000_?????_101_?????_0010011")

  val table = Array(
    REV8H       -> List(InstrPB, FuType.simdu, SIMDUOpType.rev8h)
  )
}

object RVPMInstr extends HasInstrType {
  def SMUL16  = BitPat("b1010000_?????_?????_000_?????_1110111")
  def UMUL16  = BitPat("b1011000_?????_?????_000_?????_1110111")
  def SMULX16 = BitPat("b1010001_?????_?????_000_?????_1110111")
  def UMULX16 = BitPat("b1011001_?????_?????_000_?????_1110111")
  def KHM16   = BitPat("b1000011_?????_?????_000_?????_1110111")
  def KHMX16  = BitPat("b1001011_?????_?????_000_?????_1110111")
  def SMUL8   = BitPat("b1010100_?????_?????_000_?????_1110111")
  def UMUL8   = BitPat("b1011100_?????_?????_000_?????_1110111")
  def SMULX8  = BitPat("b1010101_?????_?????_000_?????_1110111")
  def UMULX8  = BitPat("b1011101_?????_?????_000_?????_1110111")
  def KHM8    = BitPat("b1000111_?????_?????_000_?????_1110111")
  def KHMX8   = BitPat("b1001111_?????_?????_000_?????_1110111")
  def SMMUL   = BitPat("b0100000_?????_?????_001_?????_1110111")
  def SMMULU  = BitPat("b0101000_?????_?????_001_?????_1110111")
  def KWMMUL  = BitPat("b0110001_?????_?????_001_?????_1110111")
  def KWMMULU = BitPat("b0111001_?????_?????_001_?????_1110111")
  def SMMWB   = BitPat("b0100010_?????_?????_001_?????_1110111")
  def SMMWBU  = BitPat("b0101010_?????_?????_001_?????_1110111")
  def SMMWT   = BitPat("b0110010_?????_?????_001_?????_1110111")
  def SMMWTU  = BitPat("b0111010_?????_?????_001_?????_1110111")
  def KMMWB2  = BitPat("b1000111_?????_?????_001_?????_1110111")
  def KMMWB2U = BitPat("b1001111_?????_?????_001_?????_1110111")
  def KMMWT2  = BitPat("b1010111_?????_?????_001_?????_1110111")
  def KMMWT2U = BitPat("b1011111_?????_?????_001_?????_1110111")
  def SMBB16  = BitPat("b0000100_?????_?????_001_?????_1110111")
  def SMBT16  = BitPat("b0001100_?????_?????_001_?????_1110111")
  def SMTT16  = BitPat("b0010100_?????_?????_001_?????_1110111")
  def KMDA    = BitPat("b0011100_?????_?????_001_?????_1110111")
  def KMXDA   = BitPat("b0011101_?????_?????_001_?????_1110111")
  def SMDS    = BitPat("b0101100_?????_?????_001_?????_1110111")
  def SMDRS   = BitPat("b0110100_?????_?????_001_?????_1110111")
  def SMXDS   = BitPat("b0111100_?????_?????_001_?????_1110111")
  def SMAL    = BitPat("b0101111_?????_?????_001_?????_1110111")

  val table = Array(
    SMUL16      -> List(InstrPM, FuType.simdu, SIMDUOpType.smul16),
    UMUL16      -> List(InstrPM, FuType.simdu, SIMDUOpType.umul16),
    SMULX16     -> List(InstrPM, FuType.simdu, SIMDUOpType.smulx16),
    UMULX16     -> List(InstrPM, FuType.simdu, SIMDUOpType.umulx16),
    KHM16       -> List(InstrPM, FuType.simdu, SIMDUOpType.khm16),
    KHMX16      -> List(InstrPM, FuType.simdu, SIMDUOpType.khmx16),
    SMUL8       -> List(InstrPM, FuType.simdu, SIMDUOpType.smul8),
    UMUL8       -> List(InstrPM, FuType.simdu, SIMDUOpType.umul8),
    SMULX8      -> List(InstrPM, FuType.simdu, SIMDUOpType.smulx8),
    UMULX8      -> List(InstrPM, FuType.simdu, SIMDUOpType.umulx8),
    KHM8        -> List(InstrPM, FuType.simdu, SIMDUOpType.khm8),
    KHMX8       -> List(InstrPM, FuType.simdu, SIMDUOpType.khmx8),
    SMMUL       -> List(InstrPM, FuType.simdu, SIMDUOpType.smmul),
    SMMULU      -> List(InstrPM, FuType.simdu, SIMDUOpType.smmulu),
    KWMMUL      -> List(InstrPM, FuType.simdu, SIMDUOpType.kwmmul),
    KWMMULU     -> List(InstrPM, FuType.simdu, SIMDUOpType.kwmmulu),
    SMMWB       -> List(InstrPM, FuType.simdu, SIMDUOpType.smmwb),
    SMMWBU      -> List(InstrPM, FuType.simdu, SIMDUOpType.smmwbu),
    SMMWT       -> List(InstrPM, FuType.simdu, SIMDUOpType.smmwt),
    SMMWTU      -> List(InstrPM, FuType.simdu, SIMDUOpType.smmwtu),
    KMMWB2      -> List(InstrPM, FuType.simdu, SIMDUOpType.kmmwb2),
    KMMWB2U     -> List(InstrPM, FuType.simdu, SIMDUOpType.kmmwb2u),
    KMMWT2      -> List(InstrPM, FuType.simdu, SIMDUOpType.kmmwt2),
    KMMWT2U     -> List(InstrPM, FuType.simdu, SIMDUOpType.kmmwt2u),
    SMBB16      -> List(InstrPM, FuType.simdu, SIMDUOpType.smbb16),
    SMBT16      -> List(InstrPM, FuType.simdu, SIMDUOpType.smbt16),
    SMTT16      -> List(InstrPM, FuType.simdu, SIMDUOpType.smtt16),
    KMDA        -> List(InstrPM, FuType.simdu, SIMDUOpType.kmda),
    KMXDA       -> List(InstrPM, FuType.simdu, SIMDUOpType.kmxda),
    SMDS        -> List(InstrPM, FuType.simdu, SIMDUOpType.smds),
    SMDRS       -> List(InstrPM, FuType.simdu, SIMDUOpType.smdrs),
    SMXDS       -> List(InstrPM, FuType.simdu, SIMDUOpType.smxds),
    SMAL        -> List(InstrPM, FuType.simdu, SIMDUOpType.smal)
  )
}
object RVPRDInstr extends HasInstrType {
  def KMMAC   = BitPat("b0110000_?????_?????_001_?????_1110111")
  def KMMACU  = BitPat("b0111000_?????_?????_001_?????_1110111")
  def KMMSB   = BitPat("b0100001_?????_?????_001_?????_1110111")
  def KMMSBU  = BitPat("b0101001_?????_?????_001_?????_1110111")
  def KMMAWB  = BitPat("b0100011_?????_?????_001_?????_1110111")
  def KMMAWBU = BitPat("b0101011_?????_?????_001_?????_1110111")
  def KMMAWT  = BitPat("b0110011_?????_?????_001_?????_1110111")
  def KMMAWTU = BitPat("b0111011_?????_?????_001_?????_1110111")
  def KMMAWB2 = BitPat("b1100111_?????_?????_001_?????_1110111")
  def KMMAWB2U= BitPat("b1101111_?????_?????_001_?????_1110111")
  def KMMAWT2 = BitPat("b1110111_?????_?????_001_?????_1110111")
  def KMMAWT2U= BitPat("b1111111_?????_?????_001_?????_1110111")
  def KMABB   = BitPat("b0101101_?????_?????_001_?????_1110111")
  def KMABT   = BitPat("b0110101_?????_?????_001_?????_1110111")
  def KMATT   = BitPat("b0111101_?????_?????_001_?????_1110111")
  def KMADA   = BitPat("b0100100_?????_?????_001_?????_1110111")
  def KMAXDA  = BitPat("b0100101_?????_?????_001_?????_1110111")
  def KMADS   = BitPat("b0101110_?????_?????_001_?????_1110111")
  def KMADRS  = BitPat("b0110110_?????_?????_001_?????_1110111")
  def KMAXDS  = BitPat("b0111110_?????_?????_001_?????_1110111")
  def KMSDA   = BitPat("b0100110_?????_?????_001_?????_1110111")
  def KMSXDA  = BitPat("b0100111_?????_?????_001_?????_1110111")

  val table = Array(
    KMMAC       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmac),
    KMMACU      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmacu),
    KMMSB       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmsb),
    KMMSBU      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmsbu),
    KMMAWB      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawb),
    KMMAWBU     -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawbu),
    KMMAWT      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawt),
    KMMAWTU     -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawtu),
    KMMAWB2     -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawb2),
    KMMAWB2U    -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawb2u),
    KMMAWT2     -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawt2),
    KMMAWT2U    -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmmawt2u),
    KMABB       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmabb),
    KMABT       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmabt),
    KMATT       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmatt),
    KMADA       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmada),
    KMAXDA      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmaxda),
    KMADS       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmads),
    KMADRS      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmadrs),
    KMAXDS      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmaxds),
    KMSDA       -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmsda),
    KMSXDA      -> List(InstrPRD, FuType.simdu, SIMDUOpType.kmsxda)
  )
}