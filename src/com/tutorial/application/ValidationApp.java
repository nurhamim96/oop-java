package com.tutorial.application;

import com.tutorial.data.record_class.LoginRequest;
import com.tutorial.error.ValidationException;
import com.tutorial.utils.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Ibad", "p@s$w0rd");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid.");
        } catch (ValidationException ex) {
            System.out.println("Data tidak valid : " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Data null : " + ex.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        System.out.println("============== RUNTIME EXCEPTION ==================");
        // Note: tidak wajib d try catch, tapi ada baiknya tetap menggunakan try-catch.
        // Karena jika terjadi runtime exception, yang ditakutkan program kita akan berhenti.

        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest1);
    }
}
