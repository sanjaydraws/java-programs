class DocumentReference {

     ListnerRegistration getListnerRegistration (ListnerRegistration registration) {
        return registration;
    }
    // public ListnerRegistration addSnapshotListner(){
    //     return this.getListnerRegistration() ;
    // }
    public static void main(String[] args) {
          System.out.print( new DocumentReference().getListnerRegistration(new ListenerRegistrationImpl(){
            @Override
            public void remove() {
              System.out.println("Hello");
            }
          }));

        }
}

