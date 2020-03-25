本 demo 为 [移动分析](https://help.aliyun.com/document_detail/49562.html?spm=a2c4g.11186623.6.868.2d111612Hb5yQ7) 单组件 demo，clone 后直接运行工程即可。

### 控制台环境

- 移动分析产生的数据可在 mPaaS 控制台中观察，本 demo 对应的是公有云 mPaaS Demo 应用。
- 如需切换到您的 app，可在控制台中下载配置文件后替换 demo 中的 Ant-mpaas-570DA89281533-default-Android.config 文件。

### 支持基线与接入方式
支持 inside 和 aar 两种接入方式，支持基线：

- 10.1.60，支持 inside 方式
- 10.1.68，支持 inside 和 aar 方式
 
demo 中默认使用10.1.68基线。

### 切换接入方式

- demo中通过 gradle.properties 文件中 mPaasBuildType 字段区分接入方式，默认aar，可修改为inside（等号前后不要有空格）。
- app/build.gradle 和 根目录/build.gradle 文件中也通过 mPaasBuildType 字段针对不同的接入方式添加了相应配置，自行集成时请留意。

### 降级10.1.60
如需降级10.1.60，请按照如下步骤：

1. 删除 mpaas_packages.json 文件。
2. mPaaS IDEA插件 -> 组件管理 -> 选择基线 -> 确认。
3. mPaaS IDEA插件 -> 组件管理 -> 安装日志组件。
4. 同步工程。

注意：aar 接入方式无法降级10.1.60。