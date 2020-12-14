package com.tutorial.data.record_class;

public record LoginRequest(String username, String password) {
    // Jika ingin menambahkan contructor di record class tidak menggunakan ()
    public LoginRequest {
        System.out.println("Membuat object login request.");
    }

    // jika ingin membuat contructor overloading, maka wajib memanggil contructor utamanya.

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}

// Note : java record class tidak bisa extend hanya bisa implement.