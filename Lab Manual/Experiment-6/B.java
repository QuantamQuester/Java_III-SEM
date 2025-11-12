class B extends Marks {
    private double subject1, subject2, subject3, subject4;

    public B(double s1, double s2, double s3, double s4) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
        this.subject4 = s4;
    }

    public double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}