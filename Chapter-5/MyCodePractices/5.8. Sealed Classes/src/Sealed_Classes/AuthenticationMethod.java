package Sealed_Classes;

sealed interface AuthenticationMethod permits PasswordAuth, OTPAuth, BiometricAuth {
    boolean authenticate();
}
