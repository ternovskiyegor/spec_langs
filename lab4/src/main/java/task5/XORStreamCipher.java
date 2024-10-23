package task5;

public class XORStreamCipher implements StreamCipher {
    private final byte XOR_KEY = 0x11; // 17

    // Метод для виконання XOR операції
    public byte [] xorOperation(byte [] data) {
        byte [] result = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = (byte) (data[i] ^ XOR_KEY);
        }
        return result;
    }

    @Override
    public byte[] encryptStream(byte[] data) {
        return xorOperation(data);
    }

    @Override
    public byte[] decryptStream(byte[] data) {
        return xorOperation(data);
    }

    @Override
    public byte[] encrypt(byte[] data) {
        return encryptStream(data);
    }

    @Override
    public byte[] decrypt(byte[] data) {
        return decryptStream(data);
    }
}
