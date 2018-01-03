package Hw20180103;

import org.apache.log4j.Logger;;


public class LogDemo {
	private final static Logger LOG = Logger.getLogger(LogDemo.class);
	public static <LOG> void main(String[] args) {
		LOG.info("日志输出");
	}

}
