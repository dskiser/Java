// Use XOR to encode and decode a message.
class Encode {
	public static void main(String args[]) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "DanielkS";

		System.out.print("Original message: ");
		System.out.println(msg);

		// encode the message
		for(int i = 0; i < msg.length(); i++) {
			if(i > 7) 
				encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(i % 8));
			else 
				encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(i));
		}

		System.out.print("Encoded message: ");
		System.out.println(encmsg);

		// decode the message
		for(int i = 0; i < msg.length(); i++) {
			if (i > 7)
				decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(i % 8));
			else
				decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(i));
		}

		System.out.print("Decoded message: ");
		System.out.println(decmsg);
	}
}
