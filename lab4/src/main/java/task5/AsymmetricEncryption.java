package task5;

public interface AsymmetricEncryption extends Encryption {
    byte[] encryptWithPublicKey(byte[] data);
    byte[] decryptWithPrivateKey(byte[] data);
}
