class A extends Marks {
    private double subject1, subject2, subject3;

    public A(double s1, double s2, double s3) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }
    
    public double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}