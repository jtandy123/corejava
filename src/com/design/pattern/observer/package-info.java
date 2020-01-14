/**
 * The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
 * all of its dependents are notified and updated automatically.
 *
 * There are a few different ways to implement the Observer Pattern but most resolve around a class design that includes
 * Subject and Observer interfaces.
 *
 * With the Observer Pattern, the Subject is the object that contains the state and controls it. So, there is ONE subject
 * with state. The observers, on the other hand, use the state, even if they don't own it. There are many observers and
 * they rely on the Subject to tell them when its state changes. So there is a relationship between the ONE Subject to the
 * MANY Observers.
 *
 * The subject is the sole owner of that data, the observers are dependent on the subject to update them when the data changes.
 * This leads to a cleaner OO design than allowing many objects to control the same data.
 *
 * loose coupling
 * subjects and observers are loosely coupled
 *
 * The only thing the subject knows about an observer is that it implements a certain interface(the Observer interface)
 * We can add new observers at any time.
 * We never need to modify the subject to add new types of observers.
 * We can reuse subjects or observers independently of each other.
 * Changes to either the subject or an observer will not affect the other.
 *
 * Design Principle
 * Strive for loosely coupled designs between objects that interact.
 *
 * Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
 *
 *
 *
 *
 */

package com.design.pattern.observer;