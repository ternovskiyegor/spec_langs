package task5;

public interface StreamCipher extends SymmetricEncryption {
    byte[] encryptStream(byte[] data);
    byte[] decryptStream(byte[] data);
}
