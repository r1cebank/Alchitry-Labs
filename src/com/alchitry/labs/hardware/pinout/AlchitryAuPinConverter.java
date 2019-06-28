package com.alchitry.labs.hardware.pinout;

public class AlchitryAuPinConverter extends PinConverter {

	@Override
	public String getFPGAPin(String pin) {
		switch (pin) {
		case "A2":
			return "T8";
		case "A3":
			return "T7";
		case "A5":
			return "T5";
		case "A6":
			return "R5";
		case "A8":
			return "R8";
		case "A9":
			return "P8";
		case "A11":
			return "L2";
		case "A12":
			return "L3";
		case "A14":
			return "J1";
		case "A15":
			return "K1";
		case "A17":
			return "H1";
		case "A18":
			return "H2";
		case "A20":
			return "G1";
		case "A21":
			return "G2";
		case "A23":
			return "K5";
		case "A24":
			return "E6";
		case "A27":
			return "M6";
		case "A28":
			return "N6";
		case "A30":
			return "H5";
		case "A31":
			return "H4";
		case "A33":
			return "J3";
		case "A34":
			return "H3";
		case "A36":
			return "J5";
		case "A37":
			return "J4";
		case "A39":
			return "K3";
		case "A40":
			return "K2";
		case "A42":
			return "N9";
		case "A43":
			return "P9";
		case "A45":
			return "R7";
		case "A46":
			return "R6";
		case "A48":
			return "T9";
		case "A49":
			return "T10";

		case "B2":
			return "D1";
		case "B3":
			return "E2";
		case "B5":
			return "A2";
		case "B6":
			return "B2";
		case "B8":
			return "E1";
		case "B9":
			return "F2";
		case "B11":
			return "F3";
		case "B12":
			return "F4";
		case "B14":
			return "A3";
		case "B15":
			return "B4";
		case "B17":
			return "A4";
		case "B18":
			return "A5";
		case "B20":
			return "B5";
		case "B21":
			return "B6";
		case "B23":
			return "A7";
		case "B24":
			return "B7";
		case "B27":
			return "C7";
		case "B28":
			return "C6";
		case "B30":
			return "D6";
		case "B31":
			return "D5";
		case "B33":
			return "F5";
		case "B34":
			return "E5";
		case "B36":
			return "G5";
		case "B37":
			return "G4";
		case "B39":
			return "D4";
		case "B40":
			return "C4";
		case "B42":
			return "E3";
		case "B43":
			return "D3";
		case "B45":
			return "C3";
		case "B46":
			return "C2";
		case "B48":
			return "C1";
		case "B49":
			return "B1";

		case "C2":
			return "T13";
		case "C3":
			return "R13";
		case "C5":
			return "T12";
		case "C6":
			return "R12";
		case "C8":
			return "R11";
		case "C9":
			return "R10";
		case "C11":
			return "N2";
		case "C12":
			return "N3";
		case "C14":
			return "P3";
		case "C15":
			return "P4";
		case "C17":
			return "M4";
		case "C18":
			return "L4";
		case "C20":
			return "N4";
		case "C21":
			return "M5";
		case "C23":
			return "L5";
		case "C24":
			return "P5";
		case "C27":
			return "T4";
		case "C28":
			return "T3";
		case "C30":
			return "R3";
		case "C31":
			return "T2";
		case "C33":
			return "R2";
		case "C34":
			return "R1";
		case "C36":
			return "N1";
		case "C37":
			return "P1";
		case "C39":
			return "M2";
		case "C40":
			return "M1";
		case "C42":
			return "N13";
		case "C43":
			return "P13";
		case "C45":
			return "N11";
		case "C46":
			return "N12";
		case "C48":
			return "P10";
		case "C49":
			return "P11";
			
		case "D8":
			return "R16";
		case "D9":
			return "R15";
		case "D11":
			return "P14";
		case "D12":
			return "M15";
		case "D42":
			return "T14";
		case "D43":
			return "T15";

		case "LED0":
			return "K13";
		case "LED1":
			return "K12";
		case "LED2":
			return "L14";
		case "LED3":
			return "L13";
		case "LED4":
			return "M16";
		case "LED5":
			return "M14";
		case "LED6":
			return "M12";
		case "LED7":
			return "N16";

		case "RESET":
			return "P6";
		case "CLOCK":
			return "N14";
			
		case "VP":
			return "H8";
		case "VN":
			return "J7";

		case "USB_RX":
			return "P16";
		case "USB_TX":
			return "P15";

		case "SPI_D0":
			return "J13";
		case "SPI_D1":
			return "J14";
		case "SPI_D2":
			return "K15";
		case "SPI_D3":
			return "K16";
		case "SPI_SCK":
			return "E8";
		case "SPI_SS":
			return "L12";
			
		case "DDR_DQ0":
			return "A13";
		case "DDR_DQ1":
			return "B16";
		case "DDR_DQ2":
			return "B14";
		case "DDR_DQ3":
			return "C11";
		case "DDR_DQ4":
			return "C13";
		case "DDR_DQ5":
			return "C16";
		case "DDR_DQ6":
			return "C12";
		case "DDR_DQ7":
			return "C14";
		case "DDR_DQ8":
			return "D8";
		case "DDR_DQ9":
			return "B11";
		case "DDR_DQ10":
			return "C8";
		case "DDR_DQ11":
			return "B10";
		case "DDR_DQ12":
			return "A12";
		case "DDR_DQ13":
			return "A8";
		case "DDR_DQ14":
			return "B12";
		case "DDR_DQ15":
			return "A9";
			
		case "DDR_DQS0_P":
			return "B15";
		case "DDR_DQS0_N":
			return "A15";
		case "DDR_DQS1_P":
			return "B9";
		case "DDR_DQS1_N":
			return "A10";
			
		case "DDR_DM0":
			return "A14";
		case "DDR_DM1":
			return "C9";
			
		case "DDR_ODT":
			return "G11";
		case "DDR_RESET":
			return "D13";
			
		case "DDR_BA0":
			return "E13";
		case "DDR_BA1":
			return "F15";
		case "DDR_BA2":
			return "E15";
			
		case "DDR_CK_P":
			return "G14";
		case "DDR_CK_N":
			return "F14";
		case "DDR_CKE":
			return "D15";
			
		case "DDR_CS":
			return "D16";
		case "DDR_RAS":
			return "D11";
		case "DDR_CAS":
			return "D14";
		case "DDR_WE":
			return "E11";
			
		case "DDR_A0":
			return "F12";
		case "DDR_A1":
			return "G16";
		case "DDR_A2":
			return "G15";
		case "DDR_A3":
			return "E16";
		case "DDR_A4":
			return "H11";
		case "DDR_A5":
			return "G12";
		case "DDR_A6":
			return "H16";
		case "DDR_A7":
			return "H12";
		case "DDR_A8":
			return "J16";
		case "DDR_A9":
			return "H13";
		case "DDR_A10":
			return "E12";
		case "DDR_A11":
			return "H14";
		case "DDR_A12":
			return "F13";
		case "DDR_A13":
			return "J15";
		}
		return null;
	}

}
