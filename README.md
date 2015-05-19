# NonViewUtils
不涉及视图的工具类，逻辑类的集合。收集开发中最方便好用的工具类和逻辑类，让开发变得简单。  

## 协作规范  
### 代码的编码格式是utf-8  

### 修改原有的类     
如果你需要修改项目中原本的类，请在类的开头添加你的名字或名字+个人网址，同时也添加@date作为修改日期。  
```java
/**
 * 这里是一个类的注释，建议在几十个字中说明类的主要功能.
 * 
 * @author Jack Tony
 * @date 2015/5/10
 * 
 * @author kale
 * @date 2015/5/11
 * 
 * @author <a href="http://blog.csdn.net/lmj623565791">Hongyang</a>
 * @date 2015/5/14
 */
```
### 新增一个类  
如果你想添加一个类到项目中，请到/NonViewUtils/utilslib/src/main/java/org/android/share/utils/下，取一个妥善的包名或者放在先有包名中，同时也请添加@author和@date。  
在类的第一行请添加注释，不要太简单，字多点也没关系的，注释最后请用英文的句号结尾。    
```java
/**
 * 这是一个方便操作SD卡文件的工具类，可以读、存文件.
 * @author Jack Tony
 * @date 2015/5/14
 */
```  
### 注释规范  
注释规范请参考JavaDoc的注释规范，因为我们最终要通过javadoc生成代码文档，所以需要对于public标记的方法和类都写上注释。  

### 生成文档
utilslib中已经做好了javadoc的gradle的task，使用Android Studio右侧的Gradle图形化工具，选择utilslib->Tasks->other->javadoc就可以在utilslib的build->outputs->docs->javadoc中找到文档了。之后把文档提交到gh-pages分支就完成了文档的生成和上传工作。  

## 文档  
[[http://android-quick-dev.github.io/NonViewUtils/NonViewUtils/utilslib/build/docs/javadoc/)]([http://android-quick-dev.github.io/NonViewUtils/javadoc/](http://android-quick-dev.github.io/NonViewUtils/javadoc/) "开发文档")

## 参与进来
欢迎提交你在开发中总结的方便好用的代码，如果发现有更好的办法来实现项目中提到的功能，欢迎去修改代码，让工程变得更加完善、高效。如果你对于项目有建议或者发现了问题，欢迎提出。希望你在指出问题时描述的尽可能详尽，以方便我们快速改进。

## 开发者们

Jack Tony: <developer_kale@.com>  
your name: <example@main.com>

## License

    Copyright 2013 Code Share

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.




