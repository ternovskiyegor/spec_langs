package task5;

public interface BlockCipher extends SymmetricEncryption {
    byte[] encryptBlock(byte[] block);
    byte[] decryptBlock(byte[] block);
}
