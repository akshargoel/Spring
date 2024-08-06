package com.springcore.springcore;

public class Student {
 private int studentId;
 private String studentName;
 private String studentAddress ;
 
 public Student() {
	 super();
 }
 public Student(int studentId, String studentName, String studentAddress) {
	 super();
	 this.studentId= studentId;
	 this.studentName= studentName;
	 this.studentAddress= studentAddress;
 }
 
 public int getstudentId() {
	 return studentId;
 }
 public void setstudentId(int studentId) {
	 this.studentId=studentId;
 }
 public String getstudentName() {
	 return studentName;
 }
 public void setstudentName(String studentName) {
	 this.studentName=studentName;
 }
 public String getstudentAddress() {
	 return studentAddress;
 }
 public void setstudentAddress(String studentAddress) {
	 this.studentAddress=studentAddress;
 }
 
 @Override
 public String toString() {
	 return "Student [ studentId="+ studentId+ ",studentName="+ studentName + ",studentAddress=" + studentAddress+  "]";
}
}
