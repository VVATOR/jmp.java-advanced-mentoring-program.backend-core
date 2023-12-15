# JMP: Java Advanced Mentoring Program: Backend Core

This JMP program will provide you with technical hands-on knowledge of Java Core 8-21 versions, advanced multithreading, monitoring and troubleshooting, reactive programming, testing and code quality.

### Modules:

---

<details>
<summary><u><strong>1. Java 8 and 9, 10, 11+, LTS</strong></u></summary>

[Practical task](jmp-advanced-backend-core-module1/README.md)

#### Topics:

- Java 8 features
- Java 9 features
- Java 10 features
- Java 11 features
- Lambdas
- Stream API
- Jigsaw
- Date API


<details>
<summary><u>References:</u></summary>

- [Java 8 in Action - Book](https://www.manning.com/books/java-8-in-action)
- [Java 8 Stream Tutorial & Examples](https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/)
- [Guide to Java 8 Optional](https://www.baeldung.com/java-optional)
- [Functional Interface in Java](https://www.scaler.com/topics/functional-interface-in-java/)
- [Java 8 Tutorials by Mkyong](https://mkyong.com/tutorials/java-8-tutorials/)
- [Java 8 Features with Examples](https://www.digitalocean.com/community/tutorials/java-8-features-with-examples)
- [Java 9 Modularity](https://www.baeldung.com/java-9-modularity)
- [Java 9 Features with Examples](https://www.digitalocean.com/community/tutorials/java-9-features-with-examples#factory-methods-for-immutable-list-set-map-and-map-entry)
- [What's New in Java 10](https://www.digitalocean.com/community/tutorials/java-10-features)
- [Var in Java 10 - Work in Progress](https://dzone.com/articles/var-work-in-progress)
- [What's New in Java 11](https://mkyong.com/java/what-is-new-in-java-11/)
- [Java 11 Features](https://www.digitalocean.com/community/tutorials/java-11-features)
- [What's New in Java 17](https://mkyong.com/java/what-is-new-in-java-17/)
- [What's New in Java 18](https://mkyong.com/java/what-is-new-in-java-18/)
- [What's New in Java 19](https://mkyong.com/java/what-is-new-in-java-19/)

</details>
</details>

---

<details>
<summary><u><strong>2. Advanced Multithreading</strong></u></summary>

#### Topics:

- What is concurrency
- Thread API
- Java memory model
- Semaphore, CountDownLatch, CyclicBarrier
- Completable future, parallel streams
- Anatomy of Synchronization
- Locks
- Atomics
- Thread pools
- Concurrent collections


<details>
<summary><u><strong>References:</strong></u></summary>

Documentation:
- [https://docs.oracle.com/javase/tutorial/essential/concurrency/](https://docs.oracle.com/javase/tutorial/essential/concurrency/)

References:
- [JMM](https://shipilev.net/blog/2014/jmm-pragmatics/)
- [Set of articles that cover most of the required topics](https://www.baeldung.com/java-concurrency)
- [An Introduction to Thread in Java](https://www.simplilearn.com/tutorials/java-tutori3al/thread-in-java)
- [ExecutorService Internal Working in Java](https://medium.com/codex/executorservice-internal-working-in-java-7b286882f54e)
- [Deadlock: What It Is, How to Detect, Handle and Prevent?](https://www.baeldung.com/cs/os-deadlock)
- [Synchronization in Java](https://www.mygreatlearning.com/blog/synchronization-in-java/)
- [CyclicBarrier in Java](https://www.baeldung.com/java-cyclic-barrier)
- [Java CompletableFuture Tutorial with Examples](https://www.callicoder.com/java-8-completablefuture-tutorial/)
- [A Guide to ConcurrentMap](https://www.baeldung.com/java-concurrent-map)

- [Understanding Volatile in Java](https://www.baeldung.com/java-volatile)
- [Thread in Java Tutorial](https://www.simplilearn.com/tutorials/java-tutorial/thread-in-java)
- [ExecutorService Internal Working in Java](https://medium.com/codex/executorservice-internal-working-in-java-7b286882f54e)
- [Understanding Deadlocks in Operating Systems](https://www.baeldung.com/cs/os-deadlock)
- [Synchronization in Java](https://www.mygreatlearning.com/blog/synchronization-in-java/)
- [Using CyclicBarrier in Java](https://www.baeldung.com/java-cyclic-barrier)
- [Java 8 CompletableFuture Tutorial](https://www.callicoder.com/java-8-completablefuture-tutorial/)
- [Concurrent Maps in Java](https://www.baeldung.com/java-concurrent-map)
- [Java 8 Parallel Streams](https://www.baeldung.com/java-8-parallel-streams-custom-threadpool)

Books:
- [Java-Concurrency-Practice-Brian-Goetz](https://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
- [Art-Multiprocessor-Programming](https://www.amazon.com/Art-Multiprocessor-Programming-Revised-Reprint/dp/0123973376)


</details>
</details>

---

<details>
<summary><u><strong>3. Monitoring and troubleshooting</strong></u></summary>

#### Topics:

- JVM utilities to monitor and troubleshoot java applications
- Common mistakes in Java programs and how to identify them: OutOfMemory, deadlocks etc.


<details>
<summary><u><strong>References:</strong></u></summary>

- [Java VisualVM Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/visualvm/intro.html)
- [JConsole Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/management/jconsole.html)
- [The jcmd Utility](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr006.html)
- [The jmap Utility](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr014.html)
- [The jhat Utility](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr012.html)
- [The jstack Utility](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr016.html)
- [The jps Utility](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr015.html)
- [JVM Tool Interface (JVM TI)](https://docs.oracle.com/javase/8/docs/technotes/guides/jvmti/)
- [Analyzing a Heap Dump Using OQL](https://visualvm.github.io/documentation.html)
- [Java Mission Control](https://github.com/openjdk/jmc)
- [Creating and Analyzing Java Heap Dumps](https://reflectoring.io/create-analyze-heapdump/)
- [Java Heap Dump Analyzer](https://dzone.com/articles/java-heap-dump-analyzer-1)
- [Understanding Memory Leaks in Java](https://www.baeldung.com/java-memory-leaks)

</details>
</details>

---

<details>
<summary><u><strong>4. Reactive programming (React)</strong></u></summary>

#### Topics:
- Project Reactor and Reactive Core
- Reactive web app with Spring Boot
- Spring WebFlux
- Spring Reactive Data

<details>
<summary><u><strong>References:</strong></u></summary>

- [Reactive programming](https://levelup.gitconnected.com/okay-but-what-exactly-is-reactive-programming-64ca2aabd1aa)
- [Reactive mindset](https://www.linkedin.com/pulse/reactive-programming-selcuk-sert%3FtrackingId=NCjc2lXwTZuMjeHM0c0%252B1A%253D%253D/?trackingId=NCjc2lXwTZuMjeHM0c0%2B1A%3D%3D)
- [Into to Project Reactor for Spring](https://www.linkedin.com/pulse/project-reactor-core-introduction-anmol-bhatia/)
- [What is Mono And Flux](https://www.linkedin.com/pulse/project-reactor-how-mono-flux-work-anmol-bhatia/)
- [Java Reactive](https://reflectoring.io/getting-started-with-spring-webflux/)
- [Spring Boot WebFlux project example](https://spring.io/guides/gs/reactive-rest-service/)
- [Building a Reactive App with Angular and Spring Boot 2](https://www.linkedin.com/learning/building-a-reactive-app-with-angular-and-spring-boot-2/zero-to-full-stack-app-with-angular-and-spring-boot?u=2113185)

</details>
</details>

---

<details>
<summary><u><strong>5. Code Quality: Integration Sonar Qube, CheckStyle. Static Code Analysis</strong></u></summary>

#### Topics:
- Code Quality Overview
- Practise to improve Code Quality
- SonarQube Overview

<details>
<summary><u><strong>References:</strong></u></summary>

- [Clean Code](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882)
- [11 Best Practices and Tools to Improve the Java Code Quality](https://www.romexsoft.com/blog/improve-java-code-quality/)
- [S.O.L.I.D OCP Liskov SRP IS DI](https://www.baeldung.com/solid-principles)
- [Clean Coding in Java](https://www.baeldung.com/java-clean-code)
- [Understanding the DRY Principle](https://www.plutora.com/blog/understanding-the-dry-dont-repeat-yourself-principle)


</details>
</details>

--- 

<details>
<summary><u><strong>6. TDD, BDD, ATDD, UnitTests, Mock</strong></u></summary>

#### Topics:
- TDD and BDD approaches
- Testing best practices
- Mocking and spying
- TestNG or JUnit

<details>
<summary><u><strong>References:</strong></u></summary>

Documentation:

-   [jUnit5](https://junit.org/junit5/docs/current/user-guide/#overview)
-   [testNG](https://testng.org/doc/)
-   [Hamcrest](https://code.google.com/archive/p/hamcrest/wikis/Tutorial.wiki)
-   [Mockito](https://site.mockito.org/)
-   [Mockito - Tutorial](https://www.vogella.com/tutorials/Mockito/article.html)
-   [EasyMock](https://easymock.org/user-guide.html)
-   [Powermock](https://github.com/powermock/powermock/wiki)
    
Books

-   Test NG Beginner's Guide (Varun Menon)
-   Test Driven: Practical TDD (Lasse Koskela)
-   Test-Driven Java Development (Viktor Farcic)
-   The Cucumber for Java (Seb Rose)
-   The Art of Unit Testing (Roy Osherove)
-   BDD in Action: Behaviordriven Development for the Whole (John Smart)
-   Working Effectively with Legacy Code: WORK EFFECT LEG CODE \_p1 (Robert C. Martin Series)

Sites:

-   [Effective unit testing](https://www.youtube.com/watch?v=fr1E9aVnBxw)
-   [FIRST principles](https://howtodoinjava.com/best-practices/first-principles-for-good-tests/)
-   [Best practices](https://howtodoinjava.com/best-practices/unit-testing-best-practices-junit-reference-guide/)
-   [jUnit5](https://www.youtube.com/watch?v=0qI6_NKFQsY)
-   [Test Doubles](http://martinfowler.com/bliki/TestDouble.html)
-   [Mocks are not Stubs](http://martinfowler.com/articles/mocksArentStubs.html)
-   [Mocks Fakes Stubs and Dummy](http://xunitpatterns.com/Mocks,%20Fakes,%20Stubs%20and%20Dummies.html)
-   [Testing pyramid](https://martinfowler.com/bliki/TestPyramid.html)
-   [Agile + Testing Pyramid](https://kb.epam.com/display/EAGILCC/Agile+Testing+Pyramid)
-   [Practical Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html)
-   [Integration tests](http://softwaretestingfundamentals.com/integration-testing/)
-   [JUnit User Guide](http://junit.org/junit5/docs/current/user-guide/)
-   [TestNG doc](http://testng.org/doc/)
-   [Mockito site](http://site.mockito.org/)
-   [EasyMock User Guide](http://easymock.org/user-guide.html)
-   [Powermock wiki](https://github.com/powermock/powermock/wiki)
-   [Mock aren't stubs by Fowler](https://martinfowler.com/articles/mocksArentStubs.html)
-   [TDD best practices](https://technologyconversations.com/2013/12/24/test-driven-development-tdd-best-practices-using-java-examples-2/)
-   [Cucumber User Guide](https://cucumber.io/docs/reference/jvm#java)
-   [JBehave introduction](http://jbehave.org/introduction.html)

</details>
</details>

---