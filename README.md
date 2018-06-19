## Android - 面向对象六大原则##
	
> 1、单一职责原则（Single Responsibility Principle，缩写SRP）

 	单一职责原则，就一个类而言，应该只有一个引起它变化的原因。简单说，一个类应该是一组高度相关的函数、数据的封装；也就是高内聚。

> 2、开闭原则（Open Close Principle，缩写OCP）

    软件中的对象对于修改是封闭的，对于扩展是开放的。

> 3、里氏替换原则（Liskov Substitution Principle，缩写LSP）

    对于所有能够使用父类对象的地方都应该可以使用其子类的对象，即父类能出现的地方子类都能出现。
> 4、依赖倒置原则（Dependence Inversion Principle，缩写DIP）
    
    简单的讲就是面向接口编程，实现类之间解耦，互不依赖，调用端与实现类通过接口来相互调用。

> 5、接口隔离原则（Interface Segregation Principle，缩写ISP）

    与单一职责原则类似，主要是拆分接口各功能模块，让同一个接口中的各功能都是相关的，不相关的功能踢出去。
> 6、迪米特原则（Law of Principle，缩写LOP）

    又称最少知道原则，就是调用者只需要知道功能如何调用而不需要知道功能的具体实现。减少调用者与实现类之间的依赖关系。

## 一、设计模式：designpatterns ##
 
  1、迭代器模式（Iterator Pattern）
  
     定义：Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
     （它提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节。）
     
 ● Iterator抽象迭代器
 
     抽象迭代器负责定义访问和遍历元素的接口，而且基本上是有固定的3个方法：first()获得第一个元素，next()访问下一个元素，
     hasNext()是否已经访问到底部。
     
 ● ConcreteIterator具体迭代器
 
    具体迭代器角色要实现迭代器接口，完成容器元素的遍历。
    
 ● Aggregate抽象容器
 
    容器角色负责提供创建具体迭代器角色的接口，必然提供一个类似createIterator()这样的方法，在Java中一般是iterator()方法。
    
 ● Concrete Aggregate具体容器
 
    具体容器实现容器接口定义的方法，创建出容纳迭代器的对象。
    
     ps：迭代器模式已经被淘汰，java中已经把迭代器运用到各个聚集类（collection）中了，使用java自带的迭代器就已经满足我们的需求了。
