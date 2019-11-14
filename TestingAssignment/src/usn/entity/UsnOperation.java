package usn.entity;

public class UsnOperation {

	public static boolean validateString(String usn) {
		Boolean b=usn.matches("[12][A-Z]{2}/d{2}[('CS'|'IS'|'EC'|'ME')]/d{3}");

//		if (usn != null) {
//
//			if (usn.length() == 10) {
//				System.out.println(usn.charAt(0));
//				if (usn.charAt(0) == 1) {
//					if ((usn.charAt(1) >= (char) 65 && usn.charAt(1) <= (char) 90)
//							&& (usn.charAt(2) >= (char) 65 && usn.charAt(2) <= (char) 90)) {
//						if ((usn.charAt(3) >= 0 && usn.charAt(3) <= 9) && (usn.charAt(4) >= 0 && usn.charAt(4) <= 9)) {
//							if (usn.contains("CS") || usn.contains("IS") || usn.contains("EC") || usn.contains("ME")) {
//								if ((usn.charAt(7) >= 0 && usn.charAt(7) <= 9)
//										&& (usn.charAt(8) >= 0 && usn.charAt(8) <= 9)
//										&& (usn.charAt(9) >= 0 && usn.charAt(9) <= 9)) {
//									return true;
//								} else
//									return false;
//							} else
//								return false;
//						} else
//							return false;
//					} else
//						return false;
//				} else {
//					System.out.println(usn.charAt(0));
//					return false;
//				}
//			} else
//				return false;
//		} else
			return b;
	}

	public static void main(String[] args) {
		System.out.println(validateString("1DS09CS010"));
	}

}
