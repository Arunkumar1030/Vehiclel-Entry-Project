package com.Project.ProjectBackend.DTO;

public class MrcSaveDTO {


        private String mrcnumber;
        private String mrcdrivername;
        private String mrctime;
        private String mrcdate;
        private String mrcplace;
        private String mrcloadone;
        private String mrcloadtwo;
        private String mrcstatus;

    public MrcSaveDTO(  String mrcnumber, String mrcdrivername, String mrctime , String mrcdate, String mrcplace, String mrcloadone, String mrcloadtwo, String mrcstatus) {

            this.mrcnumber = mrcnumber;
            this.mrcdrivername = mrcdrivername;
            this.mrctime = mrctime;
            this.mrcdate = mrcdate;
            this.mrcplace = mrcplace;
            this.mrcloadone = mrcloadone;
            this.mrcloadtwo = mrcloadtwo;
            this.mrcstatus = mrcstatus;
        }

    public MrcSaveDTO() {
        }


        public String getMrcnumber() {
            return mrcnumber;
        }

        public void setMrcnumber(String mrcnumber) {
            this.mrcnumber = mrcnumber;
        }

        public String getMrcdrivername() {
            return mrcdrivername;
        }

        public void setMrcdrivername(String mrcdrivername) {
            this.mrcdrivername = mrcdrivername;
        }

        public String getMrctime() {
            return mrctime;
        }

        public void setMrctime(String mrctime) {
            this.mrctime = mrctime;
        }

        public String getMrcdate() {
            return mrcdate;
        }

        public void setMrcdate(String mrcdate) {
            this.mrcdate = mrcdate;
        }


        public String getMrcplace() {
            return mrcplace;
        }

        public void setMrcplace(String mrcplace) {
            this.mrcplace = mrcplace;
        }

        public String getMrcloadone() {
            return mrcloadone;
        }

        public void setMrcloadone(String mrcloadone) {
            this.mrcloadone = mrcloadone;
        }

        public String getMrcloadtwo() {
            return mrcloadtwo;
        }

        public void setMrcloadtwo(String mrcloadtwo) {
            this.mrcloadtwo = mrcloadtwo;
        }
        public String getMrcstatus() {
            return mrcstatus;
        }

        public void setMrcstatus(String mrcstatus) {
            this.mrcstatus = mrcstatus;
        }

        @Override
        public String toString() {
            return "MrcDTO{" +

                    ", mrcnumber='" + mrcnumber + '\'' +
                    ", mrcdrivername='" + mrcdrivername + '\'' +
                    ", mrctime='" + mrctime + '\'' +
                    ", mrcdate='" + mrcdate + '\'' +
                    ", mrcplace='" + mrcplace + '\'' +
                    ", mrcloadone='" + mrcloadone + '\'' +
                    ", mrcloadtwo='" + mrcloadtwo + '\'' +
                    ", mrcstatus='" + mrcstatus + '\'' +
                    '}';
        }
    }
