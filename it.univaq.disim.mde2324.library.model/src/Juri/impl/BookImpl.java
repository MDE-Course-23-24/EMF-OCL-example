/**
 */
package Juri.impl;

import Juri.Book;
import Juri.JuriPackage;
import Juri.JuriTables;
import Juri.Library;

import Juri.Loan;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Juri.impl.BookImpl#getName <em>Name</em>}</li>
 *   <li>{@link Juri.impl.BookImpl#getCopies <em>Copies</em>}</li>
 *   <li>{@link Juri.impl.BookImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link Juri.impl.BookImpl#getLoans <em>Loans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookImpl extends MinimalEObjectImpl.Container implements Book {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopies() <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COPIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopies() <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected BigInteger copies = COPIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JuriPackage.Literals.BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JuriPackage.BOOK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCopies() {
		return copies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopies(BigInteger newCopies) {
		BigInteger oldCopies = copies;
		copies = newCopies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JuriPackage.BOOK__COPIES, oldCopies, copies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library getLibrary() {
		if (eContainerFeatureID() != JuriPackage.BOOK__LIBRARY) return null;
		return (Library)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(Library newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, JuriPackage.BOOK__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibrary(Library newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != JuriPackage.BOOK__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, JuriPackage.LIBRARY__BOOKS, Library.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JuriPackage.BOOK__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Loan> getLoans() {
		/**
		 * library.loans->select(book = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ Library library = this.getLibrary();
		if (library == null) {
			throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/jj\'::Library::loans\'");
		}
		final /*@Thrown*/ List<Loan> loans = library.getLoans();
		final /*@Thrown*/ SetValue BOXED_loans = idResolver.createSetOfAll(JuriTables.SET_CLSSid_Loan, loans);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(JuriTables.SET_CLSSid_Loan);
		Iterator<Object> ITERATOR__1 = BOXED_loans.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Loan _1 = (Loan)ITERATOR__1.next();
			/**
			 * book = self
			 */
			if (_1 == null) {
				throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/jj\'::Loan::book\'");
			}
			final /*@Thrown*/ Book book = _1.getBook();
			final /*@Thrown*/ boolean eq = book.equals(this);
			//
			if (eq == ValueUtil.TRUE_VALUE) {
				accumulator.add(_1);
			}
		}
		final /*@Thrown*/ List<Loan> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(Loan.class, select);
		return (EList<Loan>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean isAvailable() {
		/**
		 * loans->size() < copies
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Loan> loans = this.getLoans();
		final /*@NonInvalid*/ SetValue BOXED_loans = idResolver.createSetOfAll(JuriTables.SET_CLSSid_Loan, loans);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_loans);
		final /*@NonInvalid*/ BigInteger copies = this.getCopies();
		final /*@NonInvalid*/ IntegerValue BOXED_copies = ValueUtil.integerValueOf(copies);
		final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, size, BOXED_copies).booleanValue();
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean SufficientCopies(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Book::SufficientCopies";
		try {
			/**
			 *
			 * inv SufficientCopies:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = library.loans->select((book = self))
			 *         ->size() <= copies
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, JuriPackage.Literals.BOOK___SUFFICIENT_COPIES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, JuriTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Library library = this.getLibrary();
					if (library == null) {
						throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/jj\'::Library::loans\'");
					}
					final /*@Thrown*/ List<Loan> loans = library.getLoans();
					final /*@Thrown*/ SetValue BOXED_loans = idResolver.createSetOfAll(JuriTables.SET_CLSSid_Loan, loans);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(JuriTables.SET_CLSSid_Loan);
					Iterator<Object> ITERATOR__1 = BOXED_loans.iterator();
					/*@Thrown*/ SetValue select;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Loan _1 = (Loan)ITERATOR__1.next();
						/**
						 * book = self
						 */
						if (_1 == null) {
							throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/jj\'::Loan::book\'");
						}
						final /*@Thrown*/ Book book = _1.getBook();
						final /*@Thrown*/ boolean eq = book.equals(this);
						//
						if (eq == ValueUtil.TRUE_VALUE) {
							accumulator.add(_1);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ BigInteger copies = this.getCopies();
					final /*@NonInvalid*/ IntegerValue BOXED_copies = ValueUtil.integerValueOf(copies);
					final /*@Thrown*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, BOXED_copies).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, JuriTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JuriPackage.BOOK__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((Library)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JuriPackage.BOOK__LIBRARY:
				return basicSetLibrary(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JuriPackage.BOOK__LIBRARY:
				return eInternalContainer().eInverseRemove(this, JuriPackage.LIBRARY__BOOKS, Library.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JuriPackage.BOOK__NAME:
				return getName();
			case JuriPackage.BOOK__COPIES:
				return getCopies();
			case JuriPackage.BOOK__LIBRARY:
				return getLibrary();
			case JuriPackage.BOOK__LOANS:
				return getLoans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JuriPackage.BOOK__NAME:
				setName((String)newValue);
				return;
			case JuriPackage.BOOK__COPIES:
				setCopies((BigInteger)newValue);
				return;
			case JuriPackage.BOOK__LIBRARY:
				setLibrary((Library)newValue);
				return;
			case JuriPackage.BOOK__LOANS:
				getLoans().clear();
				getLoans().addAll((Collection<? extends Loan>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JuriPackage.BOOK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JuriPackage.BOOK__COPIES:
				setCopies(COPIES_EDEFAULT);
				return;
			case JuriPackage.BOOK__LIBRARY:
				setLibrary((Library)null);
				return;
			case JuriPackage.BOOK__LOANS:
				getLoans().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JuriPackage.BOOK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JuriPackage.BOOK__COPIES:
				return COPIES_EDEFAULT == null ? copies != null : !COPIES_EDEFAULT.equals(copies);
			case JuriPackage.BOOK__LIBRARY:
				return getLibrary() != null;
			case JuriPackage.BOOK__LOANS:
				return !getLoans().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JuriPackage.BOOK___IS_AVAILABLE:
				return isAvailable();
			case JuriPackage.BOOK___SUFFICIENT_COPIES__DIAGNOSTICCHAIN_MAP:
				return SufficientCopies((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", copies: ");
		result.append(copies);
		result.append(')');
		return result.toString();
	}

} //BookImpl
