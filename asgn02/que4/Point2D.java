package com.sunbeam.geometry;


public class Point2D {
		private double xCoord = 0;
		private double yCoord = 0;
		
		public Point2D(double xCoord, double yCoord) {
			super();
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
		
		//it is getDetails method from problem statement
		public void stringForm(Point2D p2) {	
			String str = "";
			System.out.println("String form = "+(str = String.valueOf(p2.xCoord)));
			System.out.println("String form = "+(str = String.valueOf(p2.yCoord)));
		}
		
		public boolean isEqual(Point2D p2) {
			if(this.xCoord==p2.xCoord && this.yCoord==p2.yCoord) {
				return true;	
			}
			else {
				return false;	
			}
		}
		
		public double calculateDistance(Point2D p2) {
			double res;
			res = Math.sqrt(Math.pow((this.xCoord-p2.xCoord),2)+Math.pow((this.yCoord-p2.yCoord),2));
			
			return res;
		}
		
		
		
}
