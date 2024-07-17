import DataPackages.dataGet;

class pengajuanCuti{

    public static void main(String[] args) {
        String[] teststringArray = {checkUserLogin("Aten", "Aten123")};

            for(int i = 0; i < teststringArray.length; i++){
                System.out.println(teststringArray[i]);
                
            }

            String[][] inputdata = {
                {"E12345", "Annual Leave", "2024-07-20", "2024-07-30", "Pending", "Vacation", "10"},
                {"E12346", "Sick Leave", "2024-08-01", "2024-08-05", "Approved", "Flu", "5"},
                {"E12347", "Maternity Leave", "2024-09-01", "2024-12-01", "Pending", "Childbirth", "90"},
                {"E12348", "Annual Leave", "2024-10-15", "2024-10-20", "Pending", "Family Trip", "5"},
                {"E12349", "Sick Leave", "2024-11-01", "2024-11-10", "Approved", "Surgery", "10"},
                {"E12350", "Annual Leave", "2024-12-15", "2024-12-25", "Pending", "Holiday", "10"}
              };

              String[][] applicationResult = leaveApplication(inputdata);

        for(int i = 0; i < applicationResult.length; i++){
            for (int j = 0; j < applicationResult[i].length; j++) {
                System.out.println(applicationResult[i][j]);
            }
            System.out.println();
    }

        System.out.println("Halo Git");
        };
     

    public static String checkUserLogin(String userName, String userPassword) {
        for (int i = 0; i < dataGet.userName.length; i++) {
            if (dataGet.userName[i] == userName && dataGet.userPassword[i] == userPassword) {
                return "Username dan Password Benar";
            }
        }
        return "Password dan Username Salah";
};

    public static String[][] leaveApplication(String[][] inputData ) {

        int numberOfApplication = inputData.length;
        String[][] applicationMessage = new String[numberOfApplication][7];

        String[] labels = {"Employee ID: ", "Jenis Cuti: ", "Tanggal Awal Cuti: ", "Tanggal Akhir Cuti: ", "Status: ", "Keterangan Cuti: ", "Jumlah Pengajuan Cuti: "};

        for (int i = 0; i < numberOfApplication; i++) {
            for (int o = 0; o < labels.length; o++) {
                applicationMessage[i][o] = labels[o] + inputData[i][o];
            }
        }
        return applicationMessage;
    }



}