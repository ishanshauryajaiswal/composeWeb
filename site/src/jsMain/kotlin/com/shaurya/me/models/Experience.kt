package com.shaurya.me.models

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,  // Note: No changes here
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Senior Android Developer < > Team Lead",
        description = "• Leadership & Innovation: Led the end-to-end development of numerous high-impact, customer-facing features at PhonePe, driving innovation across multiple product verticals and significantly enhancing user engagement.\n" +
                "• Architectural Excellence: Architected and implemented scalable frameworks—including Hurdles, Consent, and Yatra—that were adopted across various teams and applications, streamlining development processes and reducing time-to-market.\n" +
                "• Optimization & Performance: Developed a centralized Android runtime permission management system, reducing code duplication by 13% and decreasing APK size by 5%, resulting in improved app performance and user experience.\n" +
                "• Strategic Technical Guidance: Acted as a technical advisor in strategic planning sessions with senior leadership, influencing platform development and contributing to the successful launch of new product lines.\n" +
                "• Best Practices Enforcement: Established and enforced coding standards and best practices across the Android team, enhancing code quality, maintainability, and reducing post-release defects.\n" +
                "• Mentorship & Team Development: Mentored and coached junior developers through technical workshops and one-on-one sessions, fostering a culture of continuous learning and professional growth.\n" +
                "• Code Review & Quality Assurance: Led critical code reviews, identifying potential issues related to scalability, performance, and code quality, ensuring adherence to architectural guidelines.\n" +
                "• Technology Advancement: Pioneered the migration to modern Android technologies such as Jetpack Compose, MVVM architecture, and Kotlin coroutines, increasing developer productivity and app responsiveness.\n" +
                "• Cross-functional Collaboration: Collaborated closely with product managers, designers, and backend engineers to ensure seamless feature delivery and alignment with business objectives.\n" +
                "• Performance Profiling: Conducted regular performance profiling and optimization, achieving significant reductions in app load times and resource usage.\n" +
                "• Scalability Initiatives: Spearheaded architectural improvements to ensure all new features were highly scalable, modular, and maintainable, supporting the company's rapid growth.",
        company = "PhonePe",
        from = "February 2020",
        to = "Present"
    ),
    Second(
        number = "02",
        jobPosition = "Senior Android Developer",
        description = "• Module Development: Spearheaded the end-to-end development of the Merchant-Listing module, a critical feature for Paytm’s platform, enhancing user accessibility and merchant visibility.\n" +
                "• Cross-team Collaboration: Partnered with backend and design teams to deliver a seamless user experience, integrating cutting-edge Android development best practices.\n" +
                "• App Modularization: Led the modularization of the Movies and Events module, enabling faster feature rollouts, improved build times, and a reduction in app size, contributing to better app performance.\n" +
                "• Architectural Improvements: Contributed to the app's scalability and maintainability by implementing clean architecture principles and promoting modular design patterns.\n" +
                "• Performance Optimization: Optimized application performance through profiling and refactoring, leading to a smoother user experience and increased app stability.\n" +
                "• Technical Leadership: Provided guidance and mentorship to junior developers, facilitating knowledge sharing and fostering a collaborative team environment.",
        company = "Paytm",
        from = "September 2018",
        to = "February 2020"
    ),
    Third(
        number = "03",
        jobPosition = "Android Developer",
        description = "• Feature-rich Applications: Collaborated with cross-functional teams at Newgen Software to build and maintain complex, feature-rich native Android applications that addressed key business challenges.\n" +
                "• Solution Design: Designed and implemented scalable solutions with a focus on performance and user experience, ensuring high-quality deliverables.\n" +
                "• Platform Optimization: Improved the mobile platform's responsiveness by implementing architectural enhancements, resulting in a more intuitive and efficient user experience.\n" +
                "• Backend Integration: Worked closely with backend services to ensure seamless integration between mobile applications and server-side components, enhancing data consistency and reliability.\n" +
                "• Agile Methodologies: Participated in Agile development processes, contributing to sprint planning, stand-ups, and retrospectives to continuously improve team performance.\n" +
                "• Quality Assurance: Conducted thorough testing and debugging of applications, ensuring robust functionality and adherence to quality standards.",
        company = "Newgen Software",
        from = "January 2017",
        to = "September 2018"
    )
}

/*
First(
        number = "01",
        jobPosition = "Senior Android Developer",
        description = """
            • **Product Leadership**: Led the development of EPIC, a groundbreaking micro-lending product at Slice, enabling seamless micro-transactions for millions of users.\n
            • **End-to-End Development**: Architected and built the entire Android application from scratch, integrating complex payment gateways and ensuring top-notch security and performance.\n
            • **Backend Integration**: Developed scalable backend solutions using Firebase Cloud Functions, optimizing data flow and transaction handling to support high-volume usage.\n
            • **Framework Development**: Collaborated with the app platform team to create central frameworks, significantly improving app performance and accelerating developer productivity across the organization.\n
            • **Technical Innovation**: Implemented cutting-edge technologies and best practices, positioning the app at the forefront of fintech innovation.\n
            • **Cross-functional Collaboration**: Worked closely with product managers, designers, and QA teams to deliver a seamless and intuitive user experience, aligning product features with customer needs.\n
            • **Performance Optimization**: Conducted regular code reviews and performance profiling, resulting in a 25% improvement in app load times and a smoother user experience.\n
            • **Mentorship**: Mentored junior developers, fostering a culture of excellence and continuous learning within the Android team.\n
            • **Strategic Impact**: Contributed to the company's strategic goals by driving key initiatives that enhanced user engagement and revenue growth.
        """.trimIndent(),
        company = "Slice",
        from = "March 2023",
        to = "Present"
    ),
 */