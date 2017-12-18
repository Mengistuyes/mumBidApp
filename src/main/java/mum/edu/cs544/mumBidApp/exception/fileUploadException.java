package mum.edu.cs544.mumBidApp.exception;
	public class fileUploadException extends RuntimeException{
		private static final long serialVersionUID = 1L;
		
		String msg  = "upload failed";
		
		public fileUploadException(String msg, Exception e) {
			this.msg=msg;
		}

		public String getMsg() {
			return msg;
		}
	}