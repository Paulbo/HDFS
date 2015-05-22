package com.cluster.hadoop.write;

import com.google.common.io.PatternFilenameFilter;
public class Test {
	public static void main(String[] args) throws Exception {
		HdfsCommon hdfs = new HdfsCommon();
//		hdfs.upFile(
//				"./pom.xml",
//				"hdfs://168.7.1.67:8020/tmp/myxml");
		// hdfs.downFile("hdfs://localhost:9000/user/whuqin/input/file01copy",
		// "/home/whuqin/fileCopy");
		// hdfs.appendFile("/home/whuqin/file01",
		// "hdfs://localhost:9000/user/whuqin/input/file01copy");
		// hdfs.delFile("hdfs://localhost:9000/user/whuqin/input/file01copy1");
		hdfs.upLoadMerge(".", "/tmp/merge",".*\\.xml");
		
//		PatternFilenameFilter filter = new PatternFilenameFilter(".*-site-(.*)\\.xml");
//		filter =  new PatternFilenameFilter(".*");
//		System.out.println(filter.accept(null, "a-site-.xml"));
	}
}