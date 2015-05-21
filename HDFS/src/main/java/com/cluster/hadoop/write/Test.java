package com.cluster.hadoop.write;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		HdfsCommon hdfs = new HdfsCommon();
		hdfs.upFile(
				"./pom.xml",
				"hdfs://168.7.1.67:8020/tmp/myxml");
		// hdfs.downFile("hdfs://localhost:9000/user/whuqin/input/file01copy",
		// "/home/whuqin/fileCopy");
		// hdfs.appendFile("/home/whuqin/file01",
		// "hdfs://localhost:9000/user/whuqin/input/file01copy");
		// hdfs.delFile("hdfs://localhost:9000/user/whuqin/input/file01copy1");
	}
}