public static void Channel_nio() {
    try {
        RandomAccessFile randomAccessFile = new RandomAccessFile("ok.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(48);
        int byteRead = fileChannel.read(buffer);
        while (byteRead != -1) {
            System.out.println("Read" + byteRead);
            buffer.flip();//吧fileChannel从写入变成读取状态
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            byteRead = fileChannel.read(buffer);
        }
        randomAccessFile.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

}


public static void main(String[] args) {
    Channel_nio();

}