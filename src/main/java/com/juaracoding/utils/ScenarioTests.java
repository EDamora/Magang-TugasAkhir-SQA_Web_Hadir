package com.juaracoding.utils;

public enum ScenarioTests {

    // Izin Pulang Cepat Test Scenario
    T1("Menampilkan data izin pulang cepat dengan input tanggal yang sesuai"),
    T2("Menampilkan data izin pulang cepat dengan input nama dan tanggal yang sesuai"),
    T3("Menampilkan data izin pulang cepat dengan input nama tidak valid"),
    T4("Menampilkan data izin pulang cepat dengan input angka"),
    T5("Menampilkan data izin pulang cepat tanpa mengisi nama, tanggal, dan filter"),
    T6("Menampilkan data izin pulang cepat dengan input tanggal tanpa memilih start date"),
    T7("Menampilkan data izin pulang cepat dengan input tanggal tanpa memilih end date"),
    T8("Menampilkan data izin pulang cepat dengan input tanggal yang akan datang"),
    T9("Menampilkan data izin pulang cepat dengan filter departemen"),
    T10("Menampilkan data izin pulang cepat dengan filter tidak valid"),
    T11("Menampilkan data izin pulang cepat dengan filter nama dan departemen"),
    T12("Menggunakan tombol Batal untuk keluar dari modal filter"),
    T13("Menghapus filter yang dipilih dengan tombol X"),

    //Absen Point Test Scenario

    T14 ("Search by nama"),
    T15("Verifikasi tombol Reset"),
    T16("Melakukan pencarian diluar tabel nama seperti LATITUDE dan LONGTITUDE"),
    T17("Melakukan pencarian menggunakan description"),
    T18("Menambahkan tabel absen point dengan data valid"),
    T19("Menambahkan tabel absen point dengan tidak mengisi form"),
    T20("Menambahkan tabel absen point dengan tidak mengisi field nama tetapi mengisi field lain"),
    T21("Menambahkan tabel absen point dengan tidak mengisi form latitude tetapi mengisi field lain"),
    T22("Menambahkan tabel absen point dengan tidak mengisi form longtitude tetapi mengisi field lain"),
    T23("Menambahkan tabel absen point dengan tidak mengisi form maksimal radius tetapi mengisi field lain"),
    T24("Menambahkan tabel absen point dengan tidak mengisi form description tetapi mengisi field lain"),
    T25("Verifikasi button Batal"),
    T26("Melakukan edit pada data absen point"),
    T27("Menghapus data absen point"),
    T28("Logout"),

    //ClientUpliner Test Scenario

    T29("Filter Client upliner"),
    T30("Search by nama"),
    T31("Verifikasi tombol Reset"),
    T32("Melakukan pencarian diluar tabel nama seperti email"),
    T33("Tambahkan Upliner Dengan data yang kosong"),
    T34("Tambahkan Upliner Dengan unit yang kosong"),
    T35("Tambahkan Upliner Dengan nama yang kosong"),
    T36("Tambahkan Upliner Dengan email yang kosong"),
    T37("Tambahkan Upliner Dengan Password yang kosong"),
    T38("Tambahkan Upliner Dengan nama yang kurang dari 2 character"),
    T39("Tambahkan Upliner Dengan email tanpa @"),
    T40("Tambahkan Upliner Dengan Password yang kurang dari 2 character"),
    T41("Tambahkan Upliner"),
    T42("Edit client upliner"),
    T43("Menghapus client upliner"),
    T44("Tambahkan Upliner BCA dengan tanpa password"),
    T45("Tambahkan Upliner BCA dengan data kosong kecuali password"),
    T46("Tambahkan Upliner BCA");

    //Divisi Scenario Test

    private String scenarioTestName;

    ScenarioTests(String value) {
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
    }