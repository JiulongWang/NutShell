package nutcore

import chisel3._
import chisel3.util._
import chisel3.util.experimental.BoringUtils

import utils._
import difftest._
import top.Settings

object SIMDUOpType {
  def add16  = "b0100000".U
  def radd16 = "b0000000".U
  def kadd16 = "b0001000".U
  def uradd16= "b0010000".U
  def ukadd16= "b0011000".U
  def sub16  = "b0100001".U
  def rsub16 = "b0000001".U
  def ksub16 = "b0001001".U
  def ursub16= "b0010001".U
  def uksub16= "b0011001".U
  def add8   = "b0100100".U
  def radd8  = "b0000100".U
  def kadd8  = "b0001100".U
  def uradd8 = "b0010100".U
  def ukadd8 = "b0011100".U
  def sub8   = "b0100101".U
  def rsub8  = "b0000101".U
  def ksub8  = "b0001101".U
  def ursub8 = "b0010101".U
  def uksub8 = "b0011101".U
  def cras16 = "b0100010".U
  def rcras16= "b0000010".U
  def kcras16= "b0001010".U
  def urcras16="b0010010".U
  def ukcras16="b0011010".U
  def crsa16 = "b0100011".U
  def rcrsa16= "b0000011".U
  def kcrsa16= "b0001011".U
  def urcrsa16="b0010011".U
  def ukcrsa16="b0011011".U
  def add32  = "b0100000".U
  def radd32 = "b0000000".U
  def kadd32 = "b0001000".U
  def uradd32= "b0010000".U
  def ukadd32= "b0011000".U
  def sub32  = "b0100001".U
  def rsub32 = "b0000001".U
  def ksub32 = "b0001001".U
  def ursub32= "b0010001".U
  def uksub32= "b0011001".U
  def cras32 = "b0100010".U
  def rcras32= "b0000010".U
  def kcras32= "b0001010".U
  def urcras32="b0010010".U
  def ukcras32="b0011010".U
  def crsa32 = "b0100011".U
  def rcrsa32= "b0000011".U
  def kcrsa32= "b0001011".U
  def urcrsa32="b0010011".U
  def ukcrsa32="b0011011".U
  def sra16   ="b0101000".U
  def sra16u  ="b0110000".U
  def srai16  ="b0111000".U
  def srai16u ="b0111000".U
  def srl16   ="b0101001".U
  def srl16u  ="b0110001".U
  def srli16  ="b0111001".U
  def srli16u ="b0111001".U
  def sll16   ="b0101010".U
  def ksll16  ="b0110010".U
  def kslr16  ="b0101011".U
  def kslr16u ="b0110011".U
  def slli16  ="b0111010".U
  def kslli16 ="b0111010".U
  def sra8    ="b0101100".U
  def sra8u   ="b0110100".U
  def srai8   ="b0111100".U
  def srai8u  ="b0111100".U
  def srl8    ="b0101101".U
  def srl8u   ="b0110101".U
  def srli8   ="b0111101".U
  def srli8u  ="b0111101".U
  def sll8    ="b0101110".U
  def ksll8   ="b0110110".U
  def kslr8   ="b0101111".U
  def kslr8u  ="b0110111".U
  def slli8   ="b0111110".U
  def kslli8  ="b0111110".U
  def sra32   ="b0101000".U
  def sra32u  ="b0110000".U
  def srai32  ="b0111000".U
  def srai32u ="b1000000".U
  def srl32   ="b0101001".U
  def srl32u  ="b0110001".U
  def srli32  ="b0111001".U
  def srli32u ="b1000001".U
  def sll32   ="b0101010".U
  def ksll32  ="b0110010".U
  def kslr32  ="b0101011".U
  def kslr32u ="b0110011".U
  def slli32  ="b0111010".U
  def kslli32 ="b1000010".U
  def cmpeq16 ="b0100110".U
  def scmplt16="b0000110".U
  def scmple16="b0001110".U
  def ucmplt16="b0010110".U
  def ucmple16="b0011110".U
  def cmpeq8  ="b0100111".U
  def scmplt8 ="b0000111".U
  def scmple8 ="b0001111".U
  def ucmplt8 ="b0010111".U
  def ucmple8 ="b0011111".U
  def smul16  ="b1010000".U
  def umul16  ="b1011000".U
  def smulx16 ="b1010001".U
  def umulx16 ="b1011001".U
  def khm16   ="b1000011".U
  def khmx16  ="b1001011".U
  def smul8   ="b1010100".U
  def umul8   ="b1011100".U
  def smulx8  ="b1010101".U
  def umulx8  ="b1011101".U
  def khm8    ="b1000111".U
  def khmx8   ="b1001111".U
  def smin16  ="b1000000".U
  def smax16  ="b1000001".U
  def umin16  ="b1001000".U
  def umax16  ="b1001001".U
  def smin8   ="b1000100".U
  def smax8   ="b1000101".U
  def umin8   ="b1001100".U
  def umax8   ="b1001101".U
  def sclip16 ="b1000010".U
  def uclip16 ="b1000010".U
  def sclip8  ="b1000110".U
  def uclip8  ="b1000110".U
  def kabs16  = "b1010110".U
  def kabs8   = "b1010110".U
  def kabs32  = "b1010110".U
  def kabsw   = "b1010110".U
  def clrs16  = "b1010111".U
  def clz16   = "b1010111".U
  def clrs8   = "b1010111".U
  def clz8    = "b1010111".U
  def pkbb16  = "b0000111".U
  def pkbt16  = "b0001111".U
  def pktt16  = "b0010111".U
  def pktb16  = "b0011111".U
  def swap8   = "b1010110".U
  def rev8h   = "b1010110".U
  def sunpkd810 = "b1010110".U
  def sunpkd820 = "b1010110".U
  def sunpkd830 = "b1010110".U
  def sunpkd831 = "b1010110".U
  def sunpkd832 = "b1010110".U
  def zunpkd810 = "b1010110".U
  def zunpkd820 = "b1010110".U
  def zunpkd830 = "b1010110".U
  def zunpkd831 = "b1010110".U
  def zunpkd832 = "b1010110".U
  def smmul   = "b0100000".U
  def smmulu  = "b0101000".U
  def kwmmul  = "b0110001".U
  def kwmmulu = "b0111001".U
  def kmmac   = "b0110000".U
  def kmmacu  = "b0111000".U
  def kmmsb   = "b0100001".U
  def kmmsbu  = "b0101001".U
  def smmwb   = "b0100010".U
  def smmwbu  = "b0101010".U
  def smmwt   = "b0110010".U
  def smmwtu  = "b0111010".U
  def kmmawb  = "b0100011".U
  def kmmawbu = "b0101011".U
  def kmmawt  = "b0110011".U
  def kmmawtu = "b0111011".U
  def kmmwb2   = "b1000111".U
  def kmmwb2u  = "b1001111".U
  def kmmwt2   = "b1010111".U
  def kmmwt2u  = "b1011111".U
  def kmmawb2  = "b1100111".U
  def kmmawb2u = "b1101111".U
  def kmmawt2  = "b1110111".U
  def kmmawt2u = "b1111111".U
  def smbb16   = "b0000100".U
  def smbt16   = "b0001100".U
  def smtt16   = "b0010100".U
  def kmda     = "b0011100".U
  def kmxda    = "b0011101".U
  def smds     = "b0101100".U
  def smdrs    = "b0110100".U
  def smxds    = "b0111100".U
  def kmabb    = "b0101101".U
  def kmabt    = "b0110101".U
  def kmatt    = "b0111101".U
  def kmada    = "b0100100".U
  def kmaxda   = "b0100101".U
  def kmads    = "b0101110".U
  def kmadrs   = "b0110110".U
  def kmaxds   = "b0111110".U
  def kmsda    = "b0100110".U
  def kmsxda   = "b0100111".U
  def smal     = "b0101111".U
  def sclip32  = "b1110010".U
  def uclip32  = "b1111010".U
  def clrs32   = "b1010111".U
  def clz32    = "b1010111".U
  def pbsad    = "b1111110".U
  def pbsada   = "b1111111".U
  def smaqa    = "b1100100".U
  def smaqasu  = "b1100101".U
  def umaqa    = "b1100110".U
  def radd64 = "b1000000".U
  def kadd64 = "b1001000".U
  def uradd64= "b1010000".U
  def ukadd64= "b1011000".U
  def rsub64 = "b1000001".U
  def ksub64 = "b1001001".U
  def ursub64= "b1010001".U
  def uksub64= "b1011001".U
  def smar64 = "b1000010".U
  def kmar64 = "b1001010".U
  def umar64 = "b1010010".U
  def ukmar64= "b1011010".U
  def smsr64 = "b1000011".U
  def kmsr64 = "b1001011".U
  def umsr64 = "b1010011".U
  def ukmsr64= "b1011011".U
  def smalbb = "b1000100".U
  def smalbt = "b1001100".U
  def smaltt = "b1010100".U
  def smalds = "b1000101".U
  def smaldrs= "b1001101".U
  def smalxds= "b1010101".U
  def smalda = "b1000110".U
  def smalxda= "b1001110".U
  def smslda = "b1010110".U
  def smslxda= "b1011110".U
  def kaddh  = "b0000010".U
  def ukaddh = "b0001010".U
  def ksubh  = "b0000011".U
  def uksubh = "b0001011".U
  def khmbb  = "b0000110".U
  def khmbt  = "b0001110".U
  def khmtt  = "b0010110".U
  def kaddw  = "b0000000".U
  def ukaddw = "b0001000".U
  def ksubw  = "b0000001".U
  def uksubw = "b0001001".U
  def kdmbb  = "b0000101".U
  def kdmbt  = "b0001101".U
  def kdmtt  = "b0010101".U
  def kslraw = "b0110111".U
  def kslrawu= "b0111111".U
  def ksllw  = "b0010011".U
  def ksllwi = "b0011011".U
  def kdmabb = "b1101001".U
  def kdmabt = "b1110001".U
  def kdmatt = "b1111001".U
  def rdov   = "b0000000".U
  def clrov  = "b0000000".U
  def raddw  = "b0010000".U
  def uraddw = "b0011000".U
  def rsubw  = "b0010001".U
  def ursubw = "b0011001".U
  def mulr64 = "b1111000".U
  def mulsr64= "b1110000".U
  def maddr32= "b1100010".U
  def msubr32= "b1100011".U
  def ave    = "b1110000".U
  def srau   = "b0010010".U
  def sraiu  = "b1101010".U
  def bitrev = "b1110011".U
  def bitrevi= "b1110100".U
  def cmix   = "b0000011".U
  def wext   = "b1100111".U
  def wexti  = "b1101111".U
  def insb   = "b1010110".U
  def max    = "b0000101".U
  def min    = "b0000101".U
  def stas32 = "b1111000".U
  def rstas32= "b1011000".U
  def kstas32= "b1100000".U
  def urstas32="b1101000".U
  def ukstas32="b1110000".U
  def stsa32 = "b1111001".U
  def rstsa32= "b1011001".U
  def kstsa32= "b1100001".U
  def urstsa32="b1101001".U
  def ukstsa32="b1110001".U
  def stas16 = "b1111010".U
  def rstas16= "b1011010".U
  def kstas16= "b1100010".U
  def urstas16="b1101010".U
  def ukstas16="b1110010".U
  def stsa16 = "b1111011".U
  def rstsa16= "b1011011".U
  def kstsa16= "b1100011".U
  def urstsa16="b1101011".U
  def ukstsa16="b1110011".U
  def smin32  ="b1001000".U
  def smax32  ="b1001001".U
  def umin32  ="b1010000".U
  def umax32  ="b1010001".U
  def khmbb16 ="b1101110".U
  def khmbt16 ="b1110110".U
  def khmtt16 ="b1111110".U
  def kdmbb16 ="b1101101".U
  def kdmbt16 ="b1110101".U
  def kdmtt16 ="b1111101".U
  def kdmabb16="b1101100".U
  def kdmabt16="b1110100".U
  def kdmatt16="b1111100".U
  def smbb32  = mulsr64
  def smbt32  ="b0001100".U
  def smtt32  ="b0010100".U
  def sraiwu  ="b0011010".U
  def kmabb32 ="b0101101".U
  def kmabt32 ="b0110101".U
  def kmatt32 ="b0111101".U
  def pkbt32  ="b0001111".U
  def pktb32  ="b0011111".U
  def pack    ="b0000100".U
  def packu   ="b0100100".U
  def kmda32  ="b0011100".U
  def kmxda32 ="b0011101".U
  def kmaxda32="b0100101".U
  def kmsda32 ="b0100110".U
  def kmsxda32="b0100111".U
  def kmads32 ="b0101110".U
  def kmadrs32="b0110110".U
  def kmaxds32="b0111110".U
  def smds32  ="b0101100".U
  def smdrs32 ="b0110100".U
  def smxds32 ="b0111100".U
  def fsrw    ="b0111011".U
  def rev     ="b0110101".U
}

class SIMDU_IO extends FunctionUnitIO {
  val flush = Input(Bool())
  val DecodeOut = new DecodeIO
  val DecodeIn = Flipped(new DecodeIO)
  val FirstStageFire = Output(Bool())
}
class SIMDU(hasBru: Boolean = false,NO1: Boolean = true) extends NutCoreModule with HasInstrType{
  val io = IO(new SIMDU_IO)
  val (valid, src1, src2, func) = (io.in.valid, io.in.bits.src1, io.in.bits.src2, io.in.bits.func)
  def access(valid: Bool, src1: UInt, src2: UInt, func: UInt): UInt = {
    this.valid := valid
    this.src1 := src1
    this.src2 := src2
    this.func := func
    io.out.bits
  }
  def notafter(ptr1:UInt,ptr2:UInt,flag1:UInt,flag2:UInt):Bool= (ptr1 <= ptr2) && (flag1 === flag2) || (ptr1 > ptr2) && (flag1 =/= flag2)
  val PALU = Module(new PALU)
  val PMDU = Module(new PMDU)
  val PIDU = Module(new PIDU)

  io.in.ready := !valid || io.FirstStageFire

  val OutputIsPALU = Mux(PALU.io.out.valid ,Mux(PMDU.io.out.valid,notafter(PALU.io.out.bits.DecodeOut.InstNo,PMDU.io.out.bits.DecodeOut.InstNo,PALU.io.out.bits.DecodeOut.InstFlag,PMDU.io.out.bits.DecodeOut.InstFlag),true.B),false.B)

  //in and out signals
  io.out.bits := Mux(OutputIsPALU,PALU.io.out.bits.result,PMDU.io.out.bits.result)
  io.DecodeOut := Mux(OutputIsPALU,PALU.io.out.bits.DecodeOut,PMDU.io.out.bits.DecodeOut)
  io.out.valid := Mux(OutputIsPALU,PALU.io.out.valid,PMDU.io.out.valid)
  PALU.io.out.ready := Mux(OutputIsPALU,io.out.ready,false.B)
  PMDU.io.out.ready := Mux(OutputIsPALU,false.B,io.out.ready)
  io.FirstStageFire := valid && ((PALU.io.in.ready && (io.DecodeIn.cf.instrType === InstrP || io.DecodeIn.cf.instrType === InstrPB || io.DecodeIn.cf.instrType === InstrPI)) || (PMDU.io.in.ready && io.DecodeIn.cf.instrType === InstrPM || PMDU.io.in.ready && io.DecodeIn.cf.instrType === InstrPRD))

  //connect PIDU
  PIDU.io.DecodeIn := io.DecodeIn

  //connect PALU
  val PALU_bits_next = Wire(new Bundle{val DecodeIn = new DecodeIO;val Pctrl = new PIDUIO})
  val PALU_bits      = RegInit(0.U.asTypeOf(new Bundle{val DecodeIn = new DecodeIO;val Pctrl = new PIDUIO}))
  PALU_bits_next := PALU_bits
  val PALU_valid = RegInit(0.U.asTypeOf(Bool()))
  val PALU_valid_next = Wire(Bool())
  PALU_valid_next:= PALU_valid
  when(PALU.io.out.fire()){PALU_valid_next := false.B}
  when(valid && PALU.io.in.ready && (io.DecodeIn.cf.instrType === InstrP || io.DecodeIn.cf.instrType === InstrPB|| io.DecodeIn.cf.instrType === InstrPI)){
                                  PALU_valid_next := true.B
                                  PALU_bits_next.DecodeIn := io.DecodeIn
                                  PALU_bits_next.Pctrl    := PIDU.io.Pctrl
                                }
  when(io.flush){PALU_valid_next := false.B}
  PALU_valid := PALU_valid_next
  PALU_bits  := PALU_bits_next
  PALU.io.in.valid := PALU_valid
  PALU.io.in.bits  := PALU_bits


  //connect PMDU
  val PMDU_bits_next = Wire(new Bundle{val DecodeIn = new DecodeIO;val Pctrl = new PIDUIO})
  val PMDU_bits      = RegInit(0.U.asTypeOf(new Bundle{val DecodeIn = new DecodeIO;val Pctrl = new PIDUIO}))
  PMDU_bits_next := PMDU_bits
  val PMDU_valid = RegInit(0.U.asTypeOf(Bool()))
  val PMDU_valid_next = Wire(Bool())
  PMDU_valid_next:= PMDU_valid
  when(PMDU.io.FirstStageFire){PMDU_valid_next := false.B}
  when(valid && PMDU.io.in.ready && (io.DecodeIn.cf.instrType === InstrPM || PMDU.io.in.ready && io.DecodeIn.cf.instrType === InstrPRD)){
                                                                          PMDU_valid_next := true.B
                                                                          PMDU_bits_next.DecodeIn := io.DecodeIn
                                                                          PMDU_bits_next.Pctrl    := PIDU.io.Pctrl
                                                                        }
  when(io.flush){PMDU_valid_next := false.B}
  PMDU_valid := PMDU_valid_next
  PMDU_bits  := PMDU_bits_next
  PMDU.io.in.valid := PMDU_valid
  PMDU.io.in.bits  := PMDU_bits
  PMDU.io.flush    := io.flush

  Debug("[SIMDU] PALUVALID %x PMDUVALID %x PALUPC %x PMDUPC %x PALUInstNo %x PMDUInstNo %x \n",PALU_valid,PMDU_valid,PALU.io.out.bits.DecodeOut.cf.pc,PMDU.io.out.bits.DecodeOut.cf.pc,PALU.io.out.bits.DecodeOut.InstNo,PMDU.io.out.bits.DecodeOut.InstNo)
}
