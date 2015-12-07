问题总结：

当数据库连接池中的连接被创建而长时间不使用的情况下，该连接会自动回收并失效，但客户端并不知道，在进行数据库操作时仍然使用的是无效的数据库连接，这样，就导致客户端程序报“ java.sql.SQLException: Io 异常: Connection reset by peer”或“java.sql.SQLException 关闭的连接”异常，加上<property name="validationQuery" value="select * from dual"/>

配置后，客户端在使用一个无效的连接时会先对该连接进行测试，如果发现该连接已经无效，则重新从连接池获取有效数据库连接来使用