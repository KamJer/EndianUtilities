package endianUtilities;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class LittleEndianUtilities {
	
	public static short getShort(byte[] bytes) {
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getShort();
	}
	
	public static int getInteger(byte[] bytes) {
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getInt();
	}
	
	public static double littleEndianDouble(byte[] bytes) {
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getDouble();
	}
	
	public static byte[] shortToBytes(short val, int byteNumber) {
		return ByteBuffer.wrap(ByteBuffer.allocate(byteNumber).putShort(val).array()).order(ByteOrder.LITTLE_ENDIAN).array();
	}
	
	public static byte[] integerToBytes(int val, int byteNumber) {
		return ByteBuffer.wrap(ByteBuffer.allocate(byteNumber).putInt(val).array()).order(ByteOrder.LITTLE_ENDIAN).array();
	}
}
