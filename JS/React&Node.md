React is a browser lib live JQuery, it can run in browser independently.
Node is localization tool, provide API which access localhost, like files. It's a **running environment**, like JAVA JVM
React can be built on Node, ez to add npm packages.

React can generate complex UI from several code components.

When the date was changed, react will update and refresh the components.
A component can receive some parameters (props)

JSX

Every react element is a JS object, it can be save in variable or pass as parameters.

<shopList /> represents whole shupList react components.
<shopList xxx=???> xxx can get from shopList->this.props.

In React, data pass via props, from Parent components to child components.

Invoke setState in component evert time. React'll refresh child components.

when we need multiple child components, need to put the child components' state higher to parent component. Then state can be passed by props.

When the state of Board changed, all squares will be re-rendered.

Any update of **state** or **props** will cause re-rendering of React. 

Procedure:
  1. make a blank board 3x3
  2. populate 1-9
  3. click show X
  4. click show repeat x -> o
  5. Judge winner
  6. Implements history back

History back！
