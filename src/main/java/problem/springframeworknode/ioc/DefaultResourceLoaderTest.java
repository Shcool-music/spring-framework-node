package problem.springframeworknode.ioc;

import org.springframework.core.io.*;

public class DefaultResourceLoaderTest {

    /**
     * 运行结果
     * fileResource1 is FileSystemResource:false
     * fileResource2 is ClassPathResource:true
     * urlResource1 is UrlResource:true
     * urlResource1 is urlResource:true
     *
     * @param args
     */
    public static void main(String[] args) {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        FileSystemResourceLoader fileSystemResourceLoader = new FileSystemResourceLoader();

        Resource fileResource1 = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
        System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

        /*使用FileSystemResourceLoader 就可以正确加载到 FileSystemResource*/
        Resource fileResource1ByFileSystemResourceLoader = fileSystemResourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
        System.out.println("fileResource1ByFileSystemResourceLoader is FileSystemResource:" + (fileResource1ByFileSystemResourceLoader instanceof FileSystemResource));

        Resource fileResource2 = resourceLoader.getResource("/Users/chenming673/Documents/spark.txt");
        System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

        Resource urlResource1 = resourceLoader.getResource("file:/Users/chenming673/Documents/spark.txt");
        System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

        Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
        System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof UrlResource));
    }
}
