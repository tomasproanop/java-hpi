class Robot {
    EncryptedEMail encryptedEMail = new EncryptedEMail();
    

    void decryptSender() {
        for (int x = 0 ; x <= 3 ; x++ ) {
            for (int y = 0 ; y <=27 ; y++) {
                 System.out.print( encryptedEMail.decryptChar(x,y) ); 
            }
            System.out.println();
         }
    }
}
