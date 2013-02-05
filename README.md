## Introduction

IK Analyzer是一个开源的，基于java语言开发的轻量级的中文分词工具包。从2006年12月推出1.0版开始， IKAnalyzer已经推出了4个大版本。最初，它是以开源项目Luence为应用主体的，结合词典分词和文法分析算法的中文分词组件。从3.0版本开始，IK发展为面向Java的公用分词组件，独立于Lucene项目，同时提供了对Lucene的默认优化实现。在2012版本中，IK实现了简单的分词歧义排除算法，标志着IK分词器从单纯的词典分词向模拟语义分词衍化。

他的开发者是[林良益](http://linliangyi2007.iteye.com/ )，这里我提供一个github的源码分支，使用maven构建并支持solr 4.0，提供`IKTokenizerFactory`.

## 协议

遵循原始协议 Apache license,Version 2.0

## 构建

    mvn package
	
## 导入IDE

如果使用eclipse:

	mvn eclipse:eclipse
	
如果使用Intelij idea:

    mvn idea:idea
