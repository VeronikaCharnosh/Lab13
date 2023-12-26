package com.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authoriz = new Authorization();
        if (authoriz.logIn(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}