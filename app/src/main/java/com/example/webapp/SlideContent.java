package com.example.webapp;

import java.util.ArrayList;
import java.util.List;

public class SlideContent {

    public static List<Slide> getSlides() {
        List<Slide> slides = new ArrayList<>();

        // Slide 1: Title
        slides.add(new Slide("Jules: Your AI Software Engineering Partner",
                "A presentation on the capabilities of an AI agent."));

        // Slide 2: About
        slides.add(new Slide("Who Am I?",
                "I am Jules, an autonomous AI software engineer. My core purpose is to handle complete coding tasks, from understanding the request to planning, implementing, and verifying the solution. I am designed to be a collaborative partner, taking on well-defined software development tasks to accelerate your workflow."));

        // Slide 3: My Workflow
        slides.add(new Slide("My Workflow",
                "I follow a systematic, four-step process for every task:\n\n" +
                        "1. Understand & Explore: I start by analyzing the request and exploring the codebase to build context.\n" +
                        "2. Plan: I create a detailed, step-by-step plan and present it for approval.\n" +
                        "3. Execute: I carry out the plan, using my tools to modify code, run commands, and interact with web resources.\n" +
                        "4. Verify & Review: I test my changes, verify the outcome (including frontend checks), and request a final code review before submitting."));

        // Slide 4: Core Features
        slides.add(new Slide("Core Features",
                "• Autonomous Planning: I create and manage my own execution plans.\n" +
                        "• Full Environment Control: I operate within a sandboxed bash environment, allowing me to install dependencies, run builds, and execute tests.\n" +
                        "• File System Operations: I can read, write, create, and delete files and directories.\n" +
                        "• Web Research: I can browse websites to access documentation and external resources.\n" +
                        "• Continuous Verification: I check my work at every step to ensure accuracy and correctness.\n" +
                        "• Self-Correction: If I encounter an error, I can analyze it and attempt to fix my own mistakes."));

        // Slide 5: Example
        slides.add(new Slide("Example: Fixing a Bug",
                "Imagine a function that incorrectly calculates a sum.\n\n" +
                        "// BEFORE: The bug\n" +
                        "function calculateSum(a, b) {\n" +
                        "  return a - b; // Incorrectly uses subtraction\n" +
                        "}\n\n" +
                        "After analyzing the issue, I would correct it as follows:\n\n" +
                        "// AFTER: The fix\n" +
                        "function calculateSum(a, b) {\n" +
                        "  return a + b; // Correctly uses addition\n" +
                        "}"));

        // Slide 6: Comparison
        slides.add(new Slide("How I Compare",
                "Here's how I differ from other common developer tools:\n\n" +
                        "Tool\t\tScope\t\tAutonomy\n" +
                        "---------------------------------------------------\n" +
                        "Jules (AI Agent)\t\tEnd-to-end task\t\tHigh\n" +
                        "Copilot\t\tIn-line suggestions\t\tLow\n" +
                        "IDE\t\tManual work tools\t\tNone\n" +
                        "CI/CD Pipeline\t\tAutomated scripts\t\tMedium"));

        // Slide 7: Limitations
        slides.add(new Slide("Current Limitations",
                "• High-Level Ambiguity: I work best with clear, specific tasks.\n" +
                        "• Large-Scale Refactoring: I am not yet equipped to handle massive architectural changes.\n" +
                        "• UI/UX Design: I cannot make aesthetic judgments or design user interfaces.\n" +
                        "• Resource Constraints: My environment has limits on execution time and memory."));

        // Slide 8: Vision
        slides.add(new Slide("The Future of AI in Development",
                "AI agents like me represent a shift from code *suggestion* to task *automation*. The goal is to empower human developers by offloading well-defined coding tasks, freeing them to focus on architecture, creativity, and complex problem-solving."));

        // Slide 9: Q&A
        slides.add(new Slide("Questions?", ""));

        return slides;
    }
}
