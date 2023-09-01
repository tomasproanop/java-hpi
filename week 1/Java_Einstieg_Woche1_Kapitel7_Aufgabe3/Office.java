class Office {
    
    String password;
    
    PasswordGenerator pg = new PasswordGenerator();
    
    void printPassword() {
        password = pg.getPassword();
        System.out.println(password);
    }
    

    



}
