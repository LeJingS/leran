## js引入方式

### 内部脚本

在任意html位置中放置 <script> 

一般处于<boby>底部，明显改善速度

### 外部引入 类css

<script>//不能自闭合


## js语法基础

注释：//

#### 输出语句

window.alert("内容");//弹出警告框

document.write();写入html

console.log();写入控制台



#### 变量

用var定义（作用域大，类似全局变量）

建议使用驼峰命名

可以重复定义

let 局部变量，不能重复定义

const 只读常量



#### 数据类型

number 数字

string 字符串

boolean 布尔

null 控

undefined 默认初始值



eg:

检查变量的方法

`var a = 1;`
`alert(typeof a);`

输出为number



#### 运算符

三元运算符：？true_value:false_value

比较运算符： == 进行类型转换 

​						===不进行

## js函数，对象，事件



#### 函数：

###### 函数定义

function 函数名(形参){

//code

}



var functionName = function()

{//code
}



不用指定形参和返回值的数据类型

###### 函数调用

类似java

#### js对象

##### 基础对象：

###### Array:(定义数组)

var arr = new Array(1,2,3,4);

var arr = [1,2,3,4];

属性：length 设置或返回数组中元素的数量

{

简化函数定义ES6：

原函数：

`arr.forEach(function(e){`

​		`console.log(e);`

`})`

简化后：

`arr.forEach((e) => {`

​		`console.log(e);`

`})`

}



方法：forEach() 遍历每一个有值元素 直接使用for遍历会遍历到 每一个 元素，包括 undefine

​			push() 添加新元素，返回len

​			push(1,2,3)

​			splice()  删除元素

​			splice(下标,删除个数)





###### String 字符串

定义：

var str = new String("");

var str = "";

属性：

length

方法：

charAt()返回指定位置的字符

indexOf()检索字符串位置

trim()去除字符串两边空格

substring()给两个位置，截取字符串。含头不含尾



###### JSON

*自定义对象：*

*var user = {*

​		*name:"Tom",*

​		*age:20,*

​		*eat:function(){*

​		*alert("吃饭");*

*}*

*};*

JSON用于网络数据传输，作为数据载体！！！

是一种数据格式

定义 JSON字符串

var userStr = '{"name":"Jerry","age":18,"addr":["北京","上海","西安"]}'；

JSON方法:

将JSON格式的字符串转化为js对象

var jsObject = JSON.parse(userStr);

将js对象转为JSON格式字符串

var jsonStr = JSON.stringify(jsObject);





##### BOM 

浏览器对象模型



Window 对象:

获取:

直接使用，甚至可以省略 Window.

属性:

history

location

navigator

方法:

alert();//警告框

confirm(); //确认删除对话框，用返回值确认用户的操作

setinterval();//周期性使用函数，传递函数和毫秒数

srtTimeout();//达到时间后使用，传递函数和毫秒数





Location 地址栏对象



属性：href

反映当前浏览器网站网址

可以获取当前地址，也可以通过赋值达到跳转的效果



##### DOM

文档对象模型

将标记语言的各个组成部分封装成对象

DOM获取对象

1.根据id获取

2.根据标签名称获取

3.根据name属性值获取

4.根据class属性值获取

都是返回Element对象数组





#### js事件监听

eg:

按钮被点击

鼠标移动到元素上

表单提交

##### 事件绑定

1.通过HTML标签中时间属性进行绑定

2.通过DOM进行绑定

常见事件：





![image-20240716214335216](C:\Users\LeJingS\AppData\Roaming\Typora\typora-user-images\image-20240716214335216.png)



练习随后~~~







































